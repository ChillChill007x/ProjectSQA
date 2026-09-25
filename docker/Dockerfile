# Exact Java releases; Java 11 runs Defects4J/GRT, Java 8 runs EvoSuite 1.2.0.
FROM eclipse-temurin:8u462-b08-jdk-jammy AS java8
FROM node:22.20.0-bookworm-slim AS node
FROM eclipse-temurin:11.0.28_6-jdk-jammy AS core
ENV DEBIAN_FRONTEND=noninteractive TZ=America/Los_Angeles LANG=C.UTF-8 LC_ALL=C.UTF-8
RUN apt-get update && apt-get install -y --no-install-recommends \
    git curl unzip zip ca-certificates build-essential cpanminus perl subversion \
    python3 ant maven tzdata libatomic1 \
    && rm -rf /var/lib/apt/lists/*
COPY --from=java8 /opt/java/openjdk /opt/java8
ENV JAVA8_HOME=/opt/java8
ENV DEFECTS4J_HOME=/opt/defects4j SQA_TOOLS=/opt/sqa/lib SQA_WORK=/workspace/work
ENV PATH="/opt/defects4j/framework/bin:${PATH}"
RUN useradd --create-home --uid 1000 --shell /bin/bash sqa \
    && git clone https://github.com/rjust/defects4j.git /opt/defects4j \
    && cd /opt/defects4j \
    && git checkout --detach 6d54320e0db5a357f9ab38a8e4d2e5aead7e1c09 \
    && cpanm --installdeps . --notest \
    && ./init.sh \
    && defects4j info -p Lang \
    && chown -R sqa:sqa /opt/defects4j
COPY config/dependencies.lock.json /opt/sqa/config/dependencies.lock.json
COPY scripts/install_tools.py /opt/sqa/scripts/install_tools.py
RUN python3 /opt/sqa/scripts/install_tools.py --dest /opt/sqa/lib
RUN chown -R sqa:sqa /opt/sqa
USER sqa
RUN test -s /opt/defects4j/project_repos/README && defects4j info -p Lang
WORKDIR /workspace
CMD ["bash"]

# Optional agent image. Manual AI work uses core and needs no CLI credentials.
FROM core AS ai
USER root
COPY --from=node /usr/local/bin/node /usr/local/bin/node
COPY --from=node /usr/local/lib/node_modules/npm /usr/local/lib/node_modules/npm
RUN ln -s /usr/local/lib/node_modules/npm/bin/npm-cli.js /usr/local/bin/npm \
    && npm install -g @openai/codex@0.156.1 @anthropic-ai/claude-code@2.1.280 \
    && codex --version && claude --version
USER sqa
CMD ["bash"]
