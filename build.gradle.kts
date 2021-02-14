plugins {
    kotlin("jvm") apply false
}

allprojects {
    group = "ru.otus.otuskotlin.simpleads"
    version = "0.0.1"

    repositories {
        mavenCentral()
        jcenter()
    }
}