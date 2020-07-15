inherit dpkg-raw

DESCRIPTION = "OpenHAB"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

DEBIAN_DEPENDS = "systemd, git, docker-ce"

SRC_URI = "file://openhab.service \
            file://postinst"
 
do_install() {
    install -v -d ${D}/home/openhab/
    install -v -m 644 ${WORKDIR}/openhab.service ${D}/home/openhab/openhab.service
    install -v -d ${D}/home/openhab/conf
    install -v -d ${D}/home/openhab/userdata
    install -v -d ${D}/home/openhab/addons
}

