# meta-houseos


## How to build

First export the target directory for the build as the `KAS_WORK_DIR` environment variable.

### Build the target image
`./third_party/kas-docker --isar build meta-odyssey-kas.yml`

The target image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/seeed-odyssey/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img`

### Build the installer image
`./third_party/kas-docker --isar build installer-kas.yml`

The installer image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/live/installer-image-debian-buster-live.wic.img`