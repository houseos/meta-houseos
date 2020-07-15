inherit dpkg-raw

DESCRIPTION = "Simple update service"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

DEBIAN_DEPENDS = "systemd"

SRC_URI = "file://perform-update.sh"

do_install() {
    install -v -d ${D}/opt/simple-update
    install -v -m 755 ${WORKDIR}/perform-update.sh /${D}/opt/simple-update
}