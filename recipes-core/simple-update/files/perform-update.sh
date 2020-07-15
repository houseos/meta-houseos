#!/bin/bash

if [ -z "$1" ]
  then
    echo "An image has to be provided as \$1."
    exit 255
  else
    echo "$1 provided as image."
fi

dialog --backtitle Confirm --title "Confirm Update" --yesno "Should the update be started?" 5 60
result=${?}
clear

if [ "$result" -eq "255" ]
  then
    echo "Update canceled."
    exit 255
fi

if [ "$result" -eq "1" ]
  then
    echo "Update not confirmed."
fi

if [ "$result" -eq "0" ]
  then
    echo "start update"
fi

# if update flag file does not exist or bootpart is 2 set boot part to 3 
    # update mmcblk0p3
#    dd if=$1 of=/dev/mmcblk0p3
    # set boot-part
#    mount /dev/mmcblk0p4 /opt/boot-part
#    rm -p /opt/boot-part/2
#    touch /opt/boot-part/3
#    umount /opt/boot-part
    # update grub for part 3
#    mount /dev/mmcblk0p1 /opt/EFI
#    umount /opt/EFI

# else    
    # update mmcblk0p2
#    dd if=$1 of=/dev/mmcblk0p2
    # set boot-part
#    mount /dev/mmcblk0p4 /opt/boot-part
#    rm -p /opt/boot-part/3
#    touch /opt/boot-part/2
#    umount /opt/boot-part
    # update grub.cfg for part 2
#    mount /dev/mmcblk0p1 /opt/EFI
#    umount /opt/EFI