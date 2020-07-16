# meta-houseos

This repository contains an ilbers/isar layer used to generate the image for the **HouseOS Central Service Unit**.

## How to build

First create two directories for the build, one for each image.

Second download the `kas-docker` script:
> wget https://raw.githubusercontent.com/siemens/kas/master/kas-docker
> chmod a+x kas-docker

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