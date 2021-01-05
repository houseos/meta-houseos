inherit image

DESCRIPTION = "HouseOS Image"

ISAR_RELEASE_CMD = "git -C ${LAYERDIR_cip-core} describe --tags --dirty --always --match 'v[0-9].[0-9]*'"

require recipes-core/images/basic-config.inc
require recipes-core/images/house-os-core.inc
