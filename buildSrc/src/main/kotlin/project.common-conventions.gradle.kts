plugins {
    `java-library`
}

repositories {
    mavenLocal()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://jitpack.io")
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    mavenCentral()
}

tasks {
    java {
        toolchain {
            languageVersion.set(
                JavaLanguageVersion.of(
                    "${findProperty("java")}"
                )
            )
        }
    }

    compileJava {
        options.compilerArgs.add("-parameters")
    }
}