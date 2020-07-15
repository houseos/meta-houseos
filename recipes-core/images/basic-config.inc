
# Tools required for ethernet access
IMAGE_INSTALL += "eth-config"
IMAGE_PREINSTALL += "iproute2 iputils-ping wget dnsutils ca-certificates"

# Editor
IMAGE_PREINSTALL += "nano"

# Tools required for ATSAMD21G18 Co-Processor
IMAGE_INSTALL += "arduino-cli"

# Packages for exfat filesystem
IMAGE_PREINSTALL += "exfat-fuse exfat-utils"

# Docker
IMAGE_PREINSTALL += "docker-ce docker-ce-cli containerd.io"

# pihole
IMAGE_INSTALL += "pihole"

# OpenHAB
IMAGE_INSTALL += "openhab"