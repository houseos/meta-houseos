inherit dpkg-raw

DESCRIPTION = "Docker-based pihole installation"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

DEBIAN_DEPENDS = "systemd, docker-ce, curl, python3"

SRC_URI = "file://docker-compose.yml \
            file://pihole.service \
            file://postinst"
 
do_install() {
    install -v -d ${D}/home/pihole/
    install -v -m 644 ${WORKDIR}/docker-compose.yml ${D}/home/pihole/
    install -v -m 644 ${WORKDIR}/pihole.service ${D}/home/pihole/
}