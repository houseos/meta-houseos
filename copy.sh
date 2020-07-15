#!/bin/bash

ODYSSEY_FILE=build_output/build/tmp/deploy/images/seeed-odyssey/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img
if [ -f "$ODYSSEY_FILE" ]; then
    echo "Copying Odyssey Image."
    cp build_output/build/tmp/deploy/images/seeed-odyssey/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img /media/sf_VBoxShare/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img
else
    echo "Odyssey Image does not exist."
fi


INSTALLER_FILE=build_output_installer/build/tmp/deploy/images/live/installer-image-debian-buster-live.wic.img
if [ -f "$INSTALLER_FILE" ]; then
    echo "Copying Installer Image."
    cp build_output_installer/build/tmp/deploy/images/live/installer-image-debian-buster-live.wic.img /media/sf_VBoxShare/installer-image-debian-buster-live.wic.img
else
    echo "Installer Image does not exist."
fi

