pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
}

rootProject.name = "otuskotlin-simpleads"

include("ok-simpleads-common-be")
include("ok-simpleads-common-mp")