#!/bin/bash
echo "Killing all java processes started by user vagrant..."
pkill -u vagrant -c java

# delete exercise TCP settings
find ../src -name "jgroups-udp.xml" -delete
