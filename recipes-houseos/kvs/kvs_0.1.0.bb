# ISAR Recipe for the key value store
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

DESCRIPTION = "kvs - Key value store"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

SRC_URI = "git://github.com/houseos/kvs.git;branch=main;protocol=https"
SRCREV = "2705165177ebd6d10026630dcd49acdb96850d33"

inherit dpkg

S = "${WORKDIR}/git"

PR = "r0"
