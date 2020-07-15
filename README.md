# meta-houseos


## How to build

First export the target directory for the build as the KAS_WORK_DIR environment variable.

### Build the target image
`./third_party/kas-docker --isar build meta-odyssey-kas.yml`

### Build the installer image
`./third_party/kas-docker --isar build installer-kas.yml`