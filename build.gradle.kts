plugins {
    id("java")
    id("maven-publish")
}

group = "com.rpprogramming.conversion"
version = "1.0-SNAPSHOT"
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

            groupId = project.group.toString()  // Ensuring consistency with global group
            artifactId = "conversion-library"  // Set your artifact ID here
            version = project.version.toString()  // Ensuring consistency with global version

            pom {
                name.set("Conversion Library")
                description.set("A Java library for temperature and distance conversions.")
                url.set("https://github.com/RobertoPirckStraumann/rpprogramming")  // Correct URL to your GitHub repo
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/RobertoPirckStraumann/rpprogramming")  // Correct GitHub Packages URL

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
