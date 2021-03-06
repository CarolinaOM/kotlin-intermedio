package com.example.ikotin

open class Person(name: String, age: Int) : Work(), Game {

    // Cualqeuier clase tiene una superclase comun "Any"

    open fun work(){
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    // Game Interface

    override val game: String = "Among Us"

    override fun play() {
        println("Esta persona esta jugando a $game")
    }
}