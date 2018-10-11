package com.example.natallia_radaman.kotlinsamples

class FizzBuzz: FizzBuzzInterface {
    override fun calculate(num: Int) : String {
        if (num % 3 == 0) return "Fizz"
        if (num % 5 == 0) return "Buzz"
        return num.toString()
    }
}

interface FizzBuzzInterface {
    fun calculate(num: Int) : String
}