#!/bin/bash

cp ../target/demo-*.jar demo.jar
docker build -t java-demo:latest .
