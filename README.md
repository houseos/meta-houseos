# meta-houseos

This repository contains an [ilbers/isar](https://github.com/ilbers/isar) layer used to generate the image for the **HouseOS Central Service Unit**.

## Content

This layer integrates all Open Source software useful for a Smart Home central device.

- pihole - As an AdBlocker
- OpenHAB - To integrate as many Smart Home devices as possible

The following HouseOS specific applications are integrated as well:

- kvs - The Secure Key Value store for persistent data
- scp-client - The Commandline Client for the Secure Control Protocol

## How to build

First create two directories for the build, one for each image.

Second download the `kas-docker` script:

`wget https://raw.githubusercontent.com/siemens/kas/master/kas-docker`

`chmod a+x kas-docker`

### Build the target image

First export the absolute path to the build directory for the **HouseOS Central Service Unit** image as the `KAS_WORK_DIR` environment variable.

`./kas-docker --isar build meta-odyssey-kas.yml`

The target image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/seeed-odyssey/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img`

### Build the installer image

First export the absolute path to the build directory for the installer image as the `KAS_WORK_DIR` environment variable.

`./kas-docker --isar build installer-kas.yml`

The installer image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/live/installer-image-debian-buster-live.wic.img`

## License

SPDX-License-Identifier: MIT

## Copyright 

Copyright (C) 2020 Benjamin Schilling