plugins {
    kotlin("jvm")
}

dependencies {
    val kotestVersion: String by project
    implementation(kotlin("stdlib"))
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

tasks {
    test {
        useJUnitPlatform()
    }
}