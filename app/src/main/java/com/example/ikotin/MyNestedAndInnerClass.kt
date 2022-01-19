package com.example.ikotin

class MyNestedAndInnerClass {

    private val one = 1

    private  fun returnOne() : Int {
        return one
    }

    // Clases anidada (nested class)
    class MyNestedClass {

        fun sum(first: Int, second: Int): Int {
            return first + second
        }
    }

        // Clase interna (inner class)
        inner class MyInnerClass {
            fun sumTwo(number: Int) : Int {
                return number + one + returnOne()
            }
        }
}