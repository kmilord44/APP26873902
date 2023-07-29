package com.kmilord44.app2687390

import java.io.PrintStream

class Arrays {
}

fun main() {
    /*
    val pets= arrayOf("dog", "cat", "canary")
    println(pets.contentToString())
    println(pets[1])
    pets[2]="parrot"
    println(pets.contentToString())

    for (element in pets){
        println("la mascota es ${element}")
    }

    for ((index,element) in pets.withIndex()){
        println("la mascota en la posicios ${index} es ${element}")
    }

     */
    val instruments = listOf("trumpet","piano","violin")
    println(instruments)

    val instrumentos = mutableListOf<String>("piano","batery","violin")
    println(instrumentos)

    print(instruments[1])
    instrumentos[2]="guitar"
    println(instrumentos)

    /*MOSTRAR PRIMER Y ULTIMO ELEMENTO*/
    println(instrumentos.last())
    println(instrumentos.first())

    /*AGREGAR ELEMENTOS A LISTA MUTABLE*/

    instrumentos +="ukelele"
    instrumentos.add("ukelele2")
    println(instrumentos)

    /*QUITAR ELEMENTOS DE LISTA MUTABLE*/
    instrumentos -="ukelele2"
    instrumentos.removeAt(3)
    println(instrumentos)

    /*BUSCAR ELEMENTOS EN LISTA MUTABLE*/
    println(instrumentos.contains("ukelele"))
    println(instrumentos.contains("guitar"))

    /*QUE PASA SI QUITAS UN ELEMENTO QUE NO EXISTE NO PASA NADA XD*/
    instrumentos -="NOEXISTOXD"
    println(instrumentos)

    //quitar elementos por medio del index//
    instrumentos.removeAt(1)

    //borrar lista completa
    instrumentos.clear()
    print(instrumentos)
}

