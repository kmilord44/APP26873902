package com.kmilord44.app2687390

class reto2 {
}

fun main() {
        print("Ingrese el valor se su compra ")
        var compra: Int = readLine()!!.toInt()
        var bolitas = (1..4).random()
        if (compra > 50000) {
            if (bolitas == 1) {
                println("Ha sacado la bolita roja y obtiene el 10%, el total de compra es ${compra - (compra * 10 / 100)}")
            } else if (bolitas == 2) {
                println("Ha sacado la bolita azul y obtiene el 30%, el total de compra es ${compra - (compra * 30 / 100)}")
            } else if (bolitas == 3) {
                println("Ha sacado la bolita amarilla y obtiene el 50%, el total de compra es ${compra - (compra * 50 / 100)}")
            } else {
                println("Ha sacado la bolita blanca y te llevas gratis tu compra, el total de compra es ${compra - (compra * 100 / 100)}")
            }
        }
        else{
            println("Su compra es menor a 50000, no puede participar")
        }
    }

