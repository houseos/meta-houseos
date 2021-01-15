#!/bin/bash
# bash script for network interface configuration
# SPDX-License-Identifier: MIT
# Copyright (c) 2021 Benjamin Schilling

# ==== configure enp2s0 ====

# read IP address
enp2s0_ip=$(kvsc get --key enp2s0-ip)
# read subnet mask
enp2s0_mask=$(kvsc get --key enp2s0-mask)
# read default gw
enp2s0_gw=$(kvsc get --key enp2s0-gw)
# read DNS
enp2s0_dns=$(kvsc get --key enp2s0-dns)

# set system network unit
echo "[Match]"                           > /etc/systemd/network/enp2s0.network
echo "Name=enp2s0"                      >> /etc/systemd/network/enp2s0.network
echo "\n"                               >> /etc/systemd/network/enp2s0.network
echo "[Network]"                        >> /etc/systemd/network/enp2s0.network
echo "DNS=$enp2s0_dns"                  >> /etc/systemd/network/enp2s0.network
echo "Address=$enp2s0_ip/$enp2s0_mask"  >> /etc/systemd/network/enp2s0.network
echo "Gateway=$enp2s0_gw"               >> /etc/systemd/network/enp2s0.network

# ==== configure enp3s0 ====

# read IP address
enp3s0_ip=$(kvsc get --key enp3s0-ip)
# read subnet mask
enp3s0_subnet=$(kvsc get --key enp3s0-subnet)
# read default gw
enp3s0_gw=$(kvsc get --key enp3s0-gw)
# read DNS
enp3s0_dns=$(kvsc get --key enp3s0-dns)

# set system network unit
echo "[Match]"                           > /etc/systemd/network/enp3s0.network
echo "Name=enp3s0"                      >> /etc/systemd/network/enp3s0.network
echo "\n"                               >> /etc/systemd/network/enp3s0.network
echo "[Network]"                        >> /etc/systemd/network/enp3s0.network
echo "DNS=$enp3s0_dns"                  >> /etc/systemd/network/enp3s0.network
echo "Address=$enp3s0_ip/$enp3s0_mask"  >> /etc/systemd/network/enp3s0.network
echo "Gateway=$enp3s0_gw"               >> /etc/systemd/network/enp3s0.network

systemctl restart systemd-networkd