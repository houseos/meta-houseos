inherit dpkg-raw

DESCRIPTION = "Basic ethernet configuration"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

DEBIAN_DEPENDS = "systemd"

SRC_URI = "file://enp2s0.network \
            file://enp3s0.network \
            file://postinst"

do_install() {
    install -v -d ${D}/etc/systemd/network/
    install -v -m 644 ${WORKDIR}/enp2s0.network ${D}/etc/systemd/network/
    install -v -m 644 ${WORKDIR}/enp3s0.network ${D}/etc/systemd/network/
}