# =========================================================
# Dockerfile: SQA Project — MOSA (EvoSuite) + GRT + Defects4J
# ใช้สำหรับ: คนที่ 1 (MOSA/EvoSuite) และ คนที่ 2 (GRT)
#
# หมายเหตุ (แก้ไขจากเวอร์ชันก่อนหน้า):
#   - Defects4J รุ่นปัจจุบันใช้ Java 11 เป็นค่า default (ไม่ใช่ 7/8)
#     แต่ยังติดตั้ง Java 8/17 ไว้ด้วยเผื่อ bug บางตัวต้องการ
#   - EvoSuite ไม่ต้องดาวน์โหลด jar เอง — init.sh ของ Defects4J
#     จัดเตรียมให้อัตโนมัติที่ framework/lib/test_generation/generation/
#   - Perl deps ติดตั้งผ่าน cpanm --installdeps . (อ่านจาก cpanfile ของ
#     Defects4J เอง แม่นยำกว่าการ list module เองทีละตัว)
# =========================================================

FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive
ENV TZ=Asia/Bangkok

# ---- 1. Basic tools + Java 8/11/17 ----
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

# ---- 5. โฟลเดอร์สำหรับ GRT (คนที่ 2 ต้องหา tool มาวางเอง — ไม่มี official release แบบ Kex) ----
RUN mkdir -p /opt/tools/grt
# วิธีใช้: หา jar ของเครื่องมือที่ implement GRT (เช่น Randoop รุ่น GRT mode)
# แล้ววางที่โฟลเดอร์ ./tools/ บนเครื่องจริง (mount เข้า /opt/tools/grt ผ่าน docker-compose)

# ---- 6. Python deps สำหรับ benchmark runner ----
RUN pip3 install --no-cache-dir requests pandas

# ---- 7. Workspace ----
WORKDIR /workspace

CMD ["/bin/bash"]
