plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.intellij") version "1.2.0"
    java
}

group = "me.vistart.jetbrains_plugins"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.2.2")
}
tasks {
    patchPluginXml {
        changeNotes.set("""
            Add change notes here.<br>
            <em>most HTML tags may be used</em>        """.trimIndent())
    }
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}