# ISAR Recipe for the scp-client
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

inherit dpkg

SRC_URI = "git://github.com/houseos/secure_control_protocol.git;branch=debian-packaging;protocol=https"
SRCREV = "b7073f00a2c68759147b5d8e61b17bde133f4401"

S = "${WORKDIR}/git"