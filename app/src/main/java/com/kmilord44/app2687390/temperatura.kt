package com.kmilord44.app2687390

class temperatura {
}

/*funciones personalizadas*/
fun printhello(){
    print("fun mi rey")
}

fun main() {  /*funcion x expresion
    val temperture=20
    val ishot=if (temperture>40)true else false

    print(ishot)*/

    print("Ingrese su edad: ")
    var age = readln()!!.toInt()
    if (age>=18){
        println("ola")
    }
    else{
        println("no entras bro")
    }

    print(printhello())
}