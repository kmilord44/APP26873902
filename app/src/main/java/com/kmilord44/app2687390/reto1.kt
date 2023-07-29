package com.kmilord44.app2687390



class Reto1 {
}
fun main(){
    var d1=(1..6).random()
    var d2=(1..6).random()

    if (d1==1 || d2==1){
        println("Ganaste, has obtenido un par de unos en los dados $d1 $d2")
    }else if (d1+d2==11) {
        println("Ganaste, has obtenido un total de Once en los dados $d1 $d2")
    }
    else if (d1+d2==3){
    println("Ganaste, has obtenido un total de tres en los dados $d1 $d2")
    }
    else if (d1+d2==12) {
        println("Ganaste, has obtenido un total de Doce en los dados $d1 $d2")
    }
    else if (d1+d2==7) {
        println("Ganaste, has obtenido un total de Siete en los dados $d1 $d2")
    }
    else{
        println("sacaste ${d1} y ${d2}")
        print("Has perdido vuelve a intentarlo")
    }
}


