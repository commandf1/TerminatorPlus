plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.7.1"
    id("net.nuggetmc.java-conventions")
}

group = "net.nuggetmc"
description = "TerminatorPlus"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
    maven {
        name = "minecraft-repo"
        url = uri("https://libraries.minecraft.net/")
    }

    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }

    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/central") }
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.20.6-R0.1-SNAPSHOT")
    compileOnly("org.spigotmc:spigot:1.20.6-R0.1-SNAPSHOT")
    implementation("net.kyori:adventure-api:4.17.0")
}

dependencies {
    paperDevBundle("1.20.6-R0.1-SNAPSHOT")
    // paperDevBundle("1.20.6-R0.1-SNAPSHOT")

    //add the TerminatorPlus-API module
    implementation(project(":TerminatorPlus-API"))

    // paperweightDevBundle("com.example.paperfork", "1.19-R0.1-SNAPSHOT")

    // You will need to manually specify the full dependency if using the groovy gradle dsl
    // (paperDevBundle and paperweightDevBundle functions do not work in groovy)
    // paperweightDevelopmentBundle("io.papermc.paper:dev-bundle:1.20.6-R0.1-SNAPSHOT")
}

tasks {
    // Configure reobfJar to run when invoking the build task
    assemble {
        dependsOn(reobfJar)
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything

        // Set the release flag. This configures what version bytecode the compiler will emit, as well as what JDK APIs are usable.
        // See https://openjdk.java.net/jeps/247 for more information.
        options.release.set(17)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name() // We want UTF-8 for everything
    }

    /*
    reobfJar {
      // This is an example of how you might change the output location for reobfJar. It's recommended not to do this
      // for a variety of reasons, however it's asked frequently enough that an example of how to do it is included here.
      outputJar.set(layout.buildDirectory.file("libs/PaperweightTestPlugin-${project.version}.jar"))
    }
     */
}

