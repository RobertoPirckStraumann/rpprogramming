plugins {
    id("java")
    id("maven-publish")
}

group = "com.rpprogramming.conversion"
version = "1.0-SNAPSHOT"
description = "A convertion package for public usage"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    withJavadocJar()
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}