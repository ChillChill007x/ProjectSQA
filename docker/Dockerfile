# =========================================================
# Dockerfile: SQA Project — MOSA (EvoSuite) + JDart + Defects4J
# ใช้สำหรับ: คนที่ 1 (MOSA/EvoSuite) และ คนที่ 2 (JDart)
#
# JDart = Dynamic Symbolic (Concolic) Execution engine
#   เป็นส่วนขยายของ NASA Java PathFinder (JPF)
#   ต้อง build จาก source เอง 3 ส่วน: jpf-core, jConstraints(+z3 plugin), jdart
#   ไม่มี jar สำเร็จรูปให้โหลดตรง ๆ เหมือน EvoSuite — ต้อง gradle build ที่นี่
#
# [แก้ไข] jConstraints/z3/jdart ใช้ Spotless ตรวจปีใน license header
#   ไฟล์ใน repo เป็นปี 2023 แต่ปีปัจจุบันคือ 2026 -> spotlessJavaCheck ล้ม -> build ล้ม
#   แก้โดยรัน `spotlessApply` ก่อน (ให้ปีตรงกับปัจจุบัน) แล้วค่อย build
# =========================================================

FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive
ENV TZ=Asia/Bangkok

# ---- 1. Basic tools + Java 8/11/17 + Z3 solver (จำเป็นสำหรับ JDart) ----
RUN apt-get update && apt-get install -y \
    git \
    curl \
    wget \
    unzip \
    zip \
    ca-certificates \
    build-essential \
    cpanminus \
    perl \
    subversion \
    python3 \
    python3-pip \
    maven \
    ant \
    tzdata \
    z3 \
    libz3-dev \
    openjdk-8-jdk \
    openjdk-11-jdk \
    openjdk-17-jdk \
 && rm -rf /var/lib/apt/lists/*

RUN ln -snf /usr/share/zoneinfo/${TZ} /etc/localtime && echo ${TZ} > /etc/timezone

# ---- 2. Java 11 เป็น default (Defects4J framework ต้องการ) ----
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV PATH="${JAVA_HOME}/bin:${PATH}"

# ---- 3. Defects4J ----
WORKDIR /opt
RUN git clone https://github.com/rjust/defects4j.git
WORKDIR /opt/defects4j
RUN cpanm --installdeps . --notest
RUN ./init.sh

ENV DEFECTS4J_HOME=/opt/defects4j
ENV PATH="${DEFECTS4J_HOME}/framework/bin:${PATH}"

# ---- 4. ตรวจสอบว่า Defects4J + EvoSuite (auto-installed) ใช้งานได้ ----
RUN java -version
RUN defects4j info -p Chart
RUN ls -la /opt/defects4j/framework/lib/test_generation/generation/ \
    || echo "WARNING: ตรวจสอบ path ของ test-generation tools (EvoSuite jar ควรอยู่ในนี้)"

# =========================================================
# ---- 5. JDart stack: jpf-core -> jConstraints(+z3) -> jdart ----
# อ้างอิงขั้นตอนจาก README ทางการของแต่ละ repo (build ด้วย Gradle)
#
# หมายเหตุ: ส่วนนี้เป็นของ JDart (คนที่ 2) เท่านั้น — EvoSuite ไม่ได้ใช้
# จึงทำให้ jConstraints/z3/jdart "ไม่ล้ม build ทั้ง image" ถ้าพัง
# แต่จะมีสรุปสถานะท้ายส่วนนี้ให้ดูว่าตัวไหน build สำเร็จจริง
# =========================================================
WORKDIR /opt/jdart-stack

# 5.1 jpf-core (พื้นฐานของ Java PathFinder — ทุก JPF extension ต้องมีตัวนี้)
RUN git clone https://github.com/javapathfinder/jpf-core.git
WORKDIR /opt/jdart-stack/jpf-core
RUN chmod +x gradlew && ./gradlew clean build -x test

# 5.2 jConstraints (constraint-solver abstraction layer ที่ JDart ใช้)
WORKDIR /opt/jdart-stack
RUN git clone https://github.com/tudo-aqua/jConstraints.git
WORKDIR /opt/jdart-stack/jConstraints
RUN chmod +x gradlew && \
    (./gradlew spotlessApply || echo "NOTE: spotlessApply ใช้ไม่ได้ ข้ามไป") && \
    ./gradlew clean build -x test || \
    echo "WARNING: jConstraints build ล้มเหลว — ดู log ข้างบน (ไม่กระทบ EvoSuite)"

# 5.3 jConstraints-z3 (ปลั๊กอินให้ jConstraints คุยกับ Z3 solver)
WORKDIR /opt/jdart-stack
RUN git clone https://github.com/tudo-aqua/jconstraints-z3.git
WORKDIR /opt/jdart-stack/jconstraints-z3
RUN chmod +x gradlew && \
    (./gradlew spotlessApply || echo "NOTE: spotlessApply ใช้ไม่ได้ ข้ามไป") && \
    ./gradlew clean build -x test || \
    echo "WARNING: jconstraints-z3 build อาจต้องปรับ Z3 native path เอง — ดู README ของ repo นี้"

# 5.4 JDart เอง (fork ที่ยัง maintain อยู่: tudo-aqua/jdart)
WORKDIR /opt/jdart-stack
RUN git clone https://github.com/tudo-aqua/jdart.git
WORKDIR /opt/jdart-stack/jdart
RUN chmod +x gradlew && \
    (./gradlew spotlessApply || echo "NOTE: spotlessApply ใช้ไม่ได้ ข้ามไป") && \
    ./gradlew clean build -x test || \
    echo "WARNING: jdart build มีปัญหา — เช็ค log ข้างบนแล้วแก้ตาม README ของ psycopaths/jdart"

# 5.5 ตั้งค่า site.properties ให้ JPF รู้จัก jpf-core + jdart extension
RUN mkdir -p /root/.jpf && \
    { \
      echo "jpf-core = /opt/jdart-stack/jpf-core"; \
      echo "jpf-jdart = /opt/jdart-stack/jdart"; \
      echo "extensions=\${jpf-core},\${jpf-jdart}"; \
    } > /root/.jpf/site.properties

ENV JDART_HOME=/opt/jdart-stack/jdart
ENV JPF_CORE_HOME=/opt/jdart-stack/jpf-core

# 5.6 สรุปว่าแต่ละตัว build ได้ jar จริงกี่ไฟล์ (0 = ตัวนั้นพัง) — ไม่ทำให้ build ล้ม
RUN echo "=== JDart stack build summary ===" ; \
    for d in jpf-core jConstraints jconstraints-z3 jdart; do \
      n=$(find /opt/jdart-stack/$d -path "*/build/*" -name "*.jar" 2>/dev/null | wc -l); \
      echo "$d: $n jar(s) built"; \
    done

# ---- 6. Python deps สำหรับ benchmark runner ----
RUN pip3 install --no-cache-dir requests pandas

# ---- 7. Workspace ----
WORKDIR /workspace

CMD ["/bin/bash"]