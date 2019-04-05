package com.infrontofthenet.lesson12kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun readOnly() {
        val flavour = "Bubble Gum"
        //flavour = "Cookie Dough"
    }

    @Test
    fun mutable() {
        var flavour = "Bubble Gum"
        flavour = "Cookie Dough"
    }

    fun multiply(x: Int = 0, y:Int = 0): Int {
        return x * y
    }

    @Test
    fun tryMultiply() {
        println(multiply(20, 3))
        println(multiply(y = 4, x = 10))
    }

    @Test
    fun defaultValues() {
        println(multiply(5))
        println(multiply(y = 10))
    }

    @Test
    fun canBeNull() {
        var flavour: String? = null
        //flavour = null
        println(flavour)
    }

    @Test
    fun letCheck() {
        var flavour: String? = "Chocolate"

        // let checks if the value is null
        flavour?.let {
            println(flavour)
        }
    }

    @Test
    fun elvisCheck() {
        var flavour: String? = null
        flavour = "Mango"
        // elvis - if it's null, assign it some other value
        println(flavour ?: "N/A")

    }
}
