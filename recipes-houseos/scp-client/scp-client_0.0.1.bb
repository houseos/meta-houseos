# ISAR Recipe for the scp-client
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

inherit dpkg

SRC_URI = "git://github.com/houseos/secure_control_protocol.git;branch=master;protocol=https"
SRCREV = "2f3c15c5c144d3e2a6fe71f34d158f0d468d26a6"

S = "${WORKDIR}/git"