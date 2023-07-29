package com.kmilord44.app2687390

class perimetro {
}
/*personalizada*/

fun areacir (){
    println("ingrese el radio de su circulo")
    var rad = readln()!!.toInt()
    var to= rad*rad
    var tot= (to*3.1416)
    println("area es "+tot)
}

fun areatri (h: Double,b: Double){
    var tot= (b*h)/2
    println("area de su triangulo es "+tot)
}
fun peritri (l1: Double, l2: Double, l3: Double ){
    var tot= l1+l2+l3
    println("el perimetro de su triangulo es "+tot)
}
fun pericir ():Unit{
    println("ingrese el radio de su circulo")
    var per = readln()!!.toInt()
    var tot= per*2*3.1416
    println("perimetro es "+tot)
}

fun tipot(l1:Double, l2: Double, l3: Double) {

    if (l1==l2 && l1==l3) {
        println("todas las medidas son iguales, tu triangulo es EQUILATERO")

    }else if (l1==l2 || l1==l3 || l2==l3) {
        println("dos de las medidas son iguales, tu triangulo es isósceles")

    }else if (l1!=l2 && l1!=l3 && l2!=l3) {
        println("todas las medidas son diferentes, tu triangulo es ESCALENO")
    }
}

fun arearect(bas: Double, alt:  Double): Double{

    return (bas*alt)!!
}

fun perirect(bas1: Double, alt1:  Double): Double{

    return (2*bas1)+(2*alt1)!!
}


fun main() {

    var ciclo = 1

    while (ciclo == 1) {

        println("elija el proceso")
        println("1. area del circulo")
        println("2. perimetro del circulo")
        println("3. area del triangulo")
        println("4. perimetro del triangulo")
        println("5. area rectangulo")
        println("6. perimetro rectangulo")
        var ele = readln()!!.toInt()

        if (ele == 1) {
            println(pericir())
        }
        else if (ele == 2) {
            println(areacir())
        }
        else if (ele == 3) {
            println("ingrese la altura de su triangulo")
            var h = readln()!!.toDouble()
            println("ingrese la base de su triangulo")
            var b = readln()!!.toDouble()
            println(areatri(h, b))
    }
        else if (ele == 4) {
            println("ingrese lado n1")
            var l1 = readln()!!.toDouble()
            println("ingrese lado n2")
            var l2 = readln()!!.toDouble()
            println("ingrese lado n3")
            var l3 = readln()!!.toDouble()
            println(peritri(l1,l2,l3))
            println(tipot(l1,l2,l3))
        }

        else if (ele == 5) {
            println("ingrese base de rectangulo")
            var bas = readln()!!.toDouble()
            println("ingrese altura de rectangulo")
            var alt = readln()!!.toDouble()
            println(arearect(bas,alt))
        }

        else if (ele == 6) {
            println("ingrese base de rectangulo")
            var bas1 = readln()!!.toDouble()
            println("ingrese altura de rectangulo")
            var alt1 = readln()!!.toDouble()
            println(perirect(bas1,alt1))
        }


        println("desea repetir? 1.si 2.no")
        var ciclo = readln()!!.toInt()

    }
    println("fin:D")
}





