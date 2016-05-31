#!/bin/bash

cp ../demo/target/demo-*.jar demo.jar
docker build -t java-demo:latest .
