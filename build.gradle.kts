import org.gradle.api.tasks.bundling.Jar

plugins {
    `maven-publish`
    kotlin("jvm") version "1.6.10"
}

group = "io.dereknelson.lostcities"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_16

repositories {
    mavenCentral()
}

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(sourceSets.main.get().allSource)
}

publishing {

    repositories {

        publications {
            register("mavenJava", MavenPublication::class) {
                from(components["java"])
                artifact(sourcesJar.get())
            }
        }

        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/lostcities-cloud/lostcities-models")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}