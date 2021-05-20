#!/bin/bash

if [[ -v SECRET1 ]]; then
	echo "ENV1 $SECRET1"
fi

if [[ -v SECRET2 ]]; then
	echo "ENV2 $SECRET2"