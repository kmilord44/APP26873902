package com.kmilord44.app2687390

class nequi2 {
}

fun login ():Boolean {
    var entra:Boolean=true
    var contador= 4
    var rep=1

    println("bienvenido a NEQUI:D")
    while (rep==1) {
        contador-=1
        println("ingrese telefono ")
        var num = readln()!!.toInt()
        println("ingrese contraseña (4 digitos)")
        var cont = readln()!!.toInt()

        if (num==123456 && cont==1111){
            println("entra")
            entra=true
            break
        }
        else {
            println("datos incorrectos, tiene ${contador} intentos mas")
            entra=false
        }
        if (contador==0){
            println("contraseña bloqueada")
            entra=false
            break
        }
    }
    return entra
}

fun ele2(plata: Int): Int {
    println("escribe el numero de contacto al que enviaras dinero")
    val numero = readLine()!!.toBigInteger()
    println("tu monto actual es de ${plata} pesos")

    println("digita la cantidad a enviar")
    val sendmoney = readLine()!!.toInt()

    if (sendmoney > plata) {
        println("ups, no tienes tanto dinero")
    } else {
        println("dinero enviado")
        return plata - sendmoney
    }
    return plata
}

fun ele1(plata:Int): Int {
    println("tu dinero actual es ${plata}")
    println("escriba el monto a retirar")
    var restplata = readln()!!.toInt()

    if (restplata > plata) {
        println("ups, no tienes tanto dinero")
    } else {
        return plata-restplata
        println(plata)
    }
    return plata
}

fun ele3(plata: Int): Int{
    println("digita la cantidad a recargar")
    val sendmoney = readln()!!.toInt()
    println("esta seguro de recargar?? true/false")
    val op = readln()!!.toBoolean()
    if (op==false){
        println("proceso cancelado")
    }
    else{
        println("dinero recargado")
        return plata+sendmoney
    }
    return plata
}




    fun main() {
        /*VARIABLES:*/
        var entra = login()
        var plata = 4500
        var again = 1
        var contactos=arrayListOf("milo","carlos","jeniffer","tatiana","alfonso")



        if (entra == true) {
            while (again == 1) {
                println("Bienvenido a Nequi")
                println("su saldo disponible es de ${plata}")
                println("FUNCIONES:")
                println("1. Saca plata")
                println("2. Envia plata")
                println("3. Recarga Plata")
                println("4  Salir del app")
                println("5. Consultar Saldo")
                println("6. ver tus contactos")
                println("elija con el numero")
                var ele = readln()!!.toInt()

                if (ele==1){
                    plata=ele1(plata)
                }
                else if (ele==2){
                    plata=ele2(plata)

                }
                else if (ele==3){
                    plata=ele3(plata)
                }
                else if (ele==4){
                    println("hasta pronto:D")
                    break
                }
                else if (ele==5){
                    println("SU SALDO ACTUAL ES DE ${plata} PESOS")
                }
                else if (ele==6){
                    println("contactos:")
                    println("----------")
                    println(contactos)

                }
                println("desea hacer otro proceso? 1.si / 2.no")
                again = readln()!!.toInt()
            }
        }
    }



