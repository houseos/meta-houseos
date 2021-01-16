# ISAR Recipe for the HouseOS Services
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

DESCRIPTION = "houseos-services"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

inherit dpkg-raw

DEBIAN_DEPENDS += "systemd, kvs"

SRC_URI = "file://kvsd.service \
           file://kvsd-dir.service \
           file://mnt-data.mount \
           file://postinst"

do_install() {
    install -v -d ${D}/usr/lib/systemd/user
    install -v -m 644 ${WORKDIR}/kvsd.service ${D}/usr/lib/systemd/user/kvsd.service
    install -v -m 644 ${WORKDIR}/kvsd-dir.service ${D}/usr/lib/systemd/user/kvsd-dir.service
    install -v -m 644 ${WORKDIR}/mnt-data.mount ${D}/usr/lib/systemd/user/mnt-data.mount
}