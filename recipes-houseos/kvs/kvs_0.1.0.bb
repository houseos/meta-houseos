# ISAR Recipe for the key value store
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

DESCRIPTION = "kvs - Key value store"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"

SRC_URI = "git://github.com/houseos/kvs.git;branch=fix-deb;protocol=https"
SRCREV = "0231eaac16f0bf6ae8296c30a4379210b80f97f7"

inherit dpkg

S = "${WORKDIR}/git"

PR = "r0"

dpkg_runbuild_prepend() {
}