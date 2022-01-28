plugins {
    kotlin("jvm") version "1.6.10"
}

group = "o.dereknelson.lostcities"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_16

repositories {
    maven {
        url = uri("https://maven.pkg.github.com/lostcities-cloud/lostcities-common")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
    mavenCentral()
}

