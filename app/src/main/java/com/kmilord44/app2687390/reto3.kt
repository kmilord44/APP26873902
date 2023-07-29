package com.kmilord44.app2687390

class reto3 {
}

fun main() {
        var op: Int=1
        val autos= mutableListOf("lambo","volfswagen","ford")

        println("BIENVENIDO A SUPERMERCADOS NOE")
        println("-------------------------------")
        while (op==1) {
            println("1. Registrar Auto")
            println("2. mostrar lista de Autos")
            println("3. buscar Autos")
            println("4. Modificar Autos")
            println("5. Eliminar Auto")
            println("6. Eliminar todos los Autos")

            println("-------------------------------")
            print("Ingrese su eleccion: ")
            var elecc = readln()!!.toInt()

            if (elecc == 1) {
                println("ingrese el nombre del auto")
                var newcar = readLine()

                if(autos.contains(newcar)==false){
                autos.add(newcar.toString())
                println(autos)}
                else if(autos.contains(newcar)==true) {
                println("el auto ya existe")
                }


            } else if (elecc == 2) {
                for ((index, element) in autos.withIndex())
                    println("auto numero ${index} es ${element}")


            } else if (elecc ==3 ) {
                println("ingrese el nombre del auto que desea buscar")
                var searchcar = readLine()
                var veri = println("${autos.contains(searchcar.toString())}")


            } else if (elecc ==4 ) {
                for ((index, element) in autos.withIndex()){
                    println("auto numero ${index} es ${element}")}

                println("ingresa el numero del auto que deseas modificar")
                var eleccmodify = readln()!!.toInt()

                println("ingresa el nuevo nombre")
                var eleccmodify2 = readln()!!.toString()

                autos[eleccmodify]=eleccmodify2

                println(autos)

            } else if (elecc == 5) {
                for ((index, element) in autos.withIndex()){
                    println("auto numero ${index} es ${element}")}

                println("ingresa el numero del auto que deseas eliminar")
                var eleceliminar = readln()!!.toInt()
                autos.removeAt(eleceliminar)

                for ((index, element) in autos.withIndex()){
                    println("auto numero ${index} es ${element}")}

            } else if (elecc == 6) {
                println("ESTA A PUNTO DE ELIMINAR TODA LA LISTA ¿ESTA SEGURO?")
                println("1. si 2. no")
                var eliminarlist = readln()!!.toInt()
                if (eliminarlist== 1) { autos.clear() }
                }

            println("desea hacer otro proceso? 1 si 2 no")
            op = readLine()!!.toInt()
        }

    println("FIN:d")
}
