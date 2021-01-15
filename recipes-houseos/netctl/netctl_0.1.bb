# ISAR Recipe for the netctl script
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

inherit dpkg-raw

SRC_URI = "file://netctl.sh \
           file://netctl.service"

do_install() {
    install -v -d ${D}/usr/lib/systemd/system/
    install -v -m 644 ${WORKDIR}/netctl.service ${D}/usr/lib/systemd/system/netctl.service
    install -v -m 644 ${WORKDIR}/netctl.sh ${D}/opt/netctl/netctl.sh
}