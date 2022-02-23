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

Second download the `kas-container` script:

`wget https://raw.githubusercontent.com/siemens/kas/master/kas-containr`

`chmod a+x kas-container`

### Build the target image

First export the absolute path to the build directory for the **HouseOS Central Service Unit** image as the `KAS_WORK_DIR` environment variable.

`./kas-docker --isar build meta-odyssey-kas.yml`

The target image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/seeed-odyssey/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img`

### Build the installer image

The installer image can be used as a transport media for initial installation of an image on a device.
For this purpose it is used as a live image that contains the target image on a separate partition.
It is booted and afterwards the image can be written to the device using `dd` or similar.

First export the absolute path to the build directory for the installer image as the `KAS_WORK_DIR` environment variable.

`./kas-docker --isar build installer-kas.yml`

The installer image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/live/installer-image-debian-buster-live.wic.img`

Now, write it to a USB drive, e.g. using `dd` on Linux or `rufus` on Windows.
Next create an additional partition on the USB drive, it is recommended to use ext4 on Linux and `exfat` on Windows.
Afterwards the target image file (*.wic.img) can be copied to the new partition and should be available when the live image is running.

## License

SPDX-License-Identifier: MIT

## Copyright 

Copyright (C) 2020 Benjamin Schilling
