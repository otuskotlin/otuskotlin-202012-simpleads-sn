package ru.otus.otuskotlin.simpleads.multiplatform

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SharedModelTest {

    @Test
    fun sharedModelTest() {
        val sm = SharedModel(23423, "testName")
        assertEquals(23423, sm.id)
        assertEquals("testName", sm.name)
    }
}