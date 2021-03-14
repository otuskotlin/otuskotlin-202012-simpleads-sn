package ru.otus.otuskotlin.simpleads.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

class SomeFuncTest {

    @Test
    internal fun someFuncTest() {
        val str = "ExampleString"
        assertTrue {
            someFunc(str).contains(str)
        }
    }
}