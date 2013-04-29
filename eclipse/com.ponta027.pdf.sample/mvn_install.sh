#!/bin/bash

mvn install:install-file -Dfile=bcprov-jdk15on-148.jar -DgroupId=bcprov -DartifactId=bcprov -Dversion=148 -Dpackaging=jar
