plugins {
    java
}

repositories {
    mavenCentral()
    maven("https://libraries.minecraft.net/")
    maven("https://repo.marcloud.net/") // Repository provided by Marcelektro to retrieve Minecraft libraries.
}

dependencies {
    // Netty
    implementation("io.netty:netty-all:4.0.23.Final")

    // System related
    implementation("oshi:oshi-core:1.1")

    // Command line
    implementation("net.sf.jopt-simple:jopt-simple:4.6")

    implementation("org.lwjgl:lwjgl:2.9.4-nightly")
    implementation("org.lwjgl:util:2.9.4-nightly")

    // Apache HttpComponents
    implementation("org.apache.httpcomponents:httpclient:4.3.3")
    implementation("org.apache.httpcomponents:httpcore:4.3.2")

    // JNA (Java Native Access)
    implementation("net.java.dev.jna:jna:3.4.0")
    implementation("net.java.dev.jna:platform:3.4.0") {
        exclude("net.java.dev.jna", "jna")
    }

    // Logging - UPDATE TO LATEST VERSION
    implementation("org.apache.logging.log4j:log4j-api:2.0-beta9")
    implementation("org.apache.logging.log4j:log4j-core:2.0-beta9")

    // Miscellaneous
    implementation("org.apache.commons:commons-compress:1.8.1")
    implementation("org.apache.commons:commons-lang3:3.3.2")
    implementation("commons-io:commons-io:2.4")
    implementation("commons-codec:commons-codec:1.9")
    implementation("com.google.guava:guava:17.0")
    implementation("com.google.code.gson:gson:2.2.4")

    // Sound Libraries
    implementation("com.paulscode.sound:libraryjavasound:20101123")
    implementation("com.paulscode.sound:codecwav:20101023")
    implementation("com.paulscode.sound:soundsystem:20120107")
    implementation("com.paulscode.sound:codecjorbis:20101023")
    implementation("com.paulscode.sound:librarylwjglopenal:20100824")

    // Mojang
    implementation("com.mojang:realmsclient:1.7.59")
    implementation("com.mojang:icu4j-core-mojang:51.2")
    implementation("com.mojang:authlib:1.5.21")

    // Twitch
    implementation("tv.twitch:twitch:6.5")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

version = "1.8.9"
description = "MCP"

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}

tasks.withType<JavaExec> {
    val osType = System.getProperty("os.name").lowercase().let {
        if (it.contains("windows")) "windows" else "linux"
    }
    systemProperty("java.library.path", "${projectDir}${File.separator}test_natives${File.separator}$osType")
}