package com.example.ikotin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Classes
        //enumClasses()

        // Nested and Inner Classes
        //nestedAndInnerClasses()

        // Class Inheritance
        //classInheritance()

        // Interfaces
        //interfaces()

        // Visibibility Modifiers
        visibilityModifiers()
    }

    // Parte 1 kotilin intermedio: Enum Classes

    enum class Direction(val dir : Int) {
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun description() : String {
           return when (this){
               NORTH -> "La direccón es NORTE"
               SOUTH -> "La direccón es SUR"
               EAST -> "La direccón es ESTE"
               WEST -> "La direccón es OESTE"
           }
        }
    }

    private fun enumClasses(){
        var userDirection: Direction? = null
        println("Direccion: $userDirection")

        userDirection = Direction.NORTH
        println("Direccion: $userDirection")

        userDirection = Direction.WEST
        println("Direccion: $userDirection")

        println("Propiedad name: ${userDirection.name}")
        println("Propiedad ordinal: ${userDirection.ordinal}")

        // Funciones
        println(userDirection.description())

        // Inicializacion
        println(userDirection.dir)
    }

    // Parte 2 kotlin intermedio: nested and inner classes
    private fun nestedAndInnerClasses(){
        // Clases anidada (nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum: Int = myNestedClass.sum(10, 5)
        println("El resultado de la suma es $sum")

        // Clase interna (inner)
        val myInnerClass : MyNestedAndInnerClass.MyInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo: Int = myInnerClass.sumTwo(10)
        println("El resultado de sumar dos es $sumTwo")
    }

    // Parte 3 kotlin intermedio: class inheritance

    private fun classInheritance(){
        val person = Person("Sara", 40)

        val programmer = Programmer("Brais", 32, "Kotlin")
        programmer.work()
        programmer.sayLanguage()
        programmer.goToWork()
        programmer.drive()

        val designer = Designer("Juan", 30)
        designer.work()
        designer.goToWork()
    }

    private fun interfaces(){
        val gamer = Person("Brais", 33 )
        gamer.play()
        gamer.stream()
    }

    private fun visibilityModifiers(){
        /*val visibility = Visibility()
        visibility.name = "Brais"
        visibility.sayMyName()*/

        val visibilityTwo = VisibilityTwo()
        /*visibilityTwo.sayMyNameTwo()*/
    }
}