#!/usr/bin/env bash

# This script replaces local dotfiles with the ones from this git repo.
# It is the inverse operation of import.sh!
# Be aware that certain files (intellij settings) must be manually copied!

cp dot/bash_profile ~/.bash_profile
cp dot/lein/profiles.clj ~/.lein/profiles.clj
