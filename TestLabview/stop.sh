#!/bin/bash
echo "Killing all java processes started by user vagrant..."
pkill -u vagrant -c java
