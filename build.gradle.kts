plugins {
    id("java")
    id("maven-publish")
}

group = "com.rpprogramming.conversion"
version = "1.0-0"
description = "A conversion package for public usage"

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

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = project.group.toString()
            artifactId = "conversion-library"
            version = project.version.toString()

            pom {
                name.set("Conversion Library")
                description.set("A Java library for temperature and distance conversions.")
                url.set("https://github.com/RobertoPirckStraumann/rpprogramming")
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/RobertoPirckStraumann/rpprogramming")

            credentials {
                username = (project.findProperty("gpr.user") ?: System.getenv("GITHUB_ACTOR")).toString()
                password = (project.findProperty("gpr.token") ?: System.getenv("GITHUB_TOKEN")).toString()
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
