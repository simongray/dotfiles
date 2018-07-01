#!/usr/bin/env bash

# This script updates the git directory with the local dotfiles
# The export.sh script can then be used to copy the files to the local machine.
# Be aware that certain files (intellij settings) must be manually copied!

cp ~/.bash_profile dot/bash_profile
cp ~/.lein/profiles.clj dot/lein/profiles.clj
