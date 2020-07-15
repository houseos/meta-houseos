inherit dpkg-raw

DESCRIPTION = "Arduino CLI"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"
DEBIAN_DEPENDS = "ca-certificates, dnsutils"

SRC_URI = "https://github.com/arduino/arduino-cli/releases/download/0.10.0/arduino-cli_0.10.0_Linux_64bit.tar.gz \
            file://arduino-cli.yaml \
            file://postinst"

SRC_URI[sha256sum] = "a3eab6cb28026a62d78210ff52b20bcc70b6a9d9e51e8b5d4af75e437bd8f03c"

do_install() {
    install -v -d ${D}/opt/arduino-cli/
    install -v -m 644 ${WORKDIR}/arduino-cli.yaml /${D}/opt/arduino-cli
    install -v -m 755 ${WORKDIR}/arduino-cli /${D}/opt/arduino-cli
}