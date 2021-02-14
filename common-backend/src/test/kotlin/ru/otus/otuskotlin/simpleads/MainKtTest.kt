package ru.otus.otuskotlin.simpleads

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class MainKtTest : FunSpec({

    test("sum") {
        sum(10, 5) shouldBe 15
        sum(10, 5) shouldNotBe 20
    }
})