pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
    }
}

rootProject.name = "otuskotlin-simpleads"

include("ok-simpleads-common-be")