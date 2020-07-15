inherit image

DESCRIPTION = "Installer Image"

IMAGE_PREINSTALL += "iproute2 iputils-ping wget dnsutils ca-certificates nano parted"

# Packages for exfat filesystem
IMAGE_PREINSTALL += "exfat-fuse exfat-utils"