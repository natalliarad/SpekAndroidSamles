package com.example.natallia_radaman.kotlinsamples

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert


class FizzBuzzTest : Spek({
    var fizzBuzz: FizzBuzzInterface = FizzBuzz()

    describe("Calculate Fizz Buzz logic") {
        it("check number") {
            Assert.assertEquals(fizzBuzz.calculate(1), "1")
        }

        it("check Fizz") {
            Assert.assertEquals(fizzBuzz.calculate(3), "Fizz")
        }

        it("check Buzz") {
            Assert.assertEquals(fizzBuzz.calculate(5), "Buzz")
        }
    }
})