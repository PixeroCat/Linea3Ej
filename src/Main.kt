fun main() {

    var n1 = 0.0
    var n2 = 0.0
    var opcion = 0
    var au = 1

    val hist = mutableListOf<Double>()
    val historial = mutableListOf<Operaciones>()

    do{

        println("Escriba el primer número: ")
        n1 = readln().toDouble()
        println("Escriba el segundo número: ")
        n2 = readln().toDouble()

        var op = Operaciones(n1, n2)

        println("""¿Que operación desea realizar?
            |1- Suma
            |2- Resta
            |3- Raiz
            |4- Cuadrado
            |5- Historial
            |0- Salir
        """.trimMargin())
        opcion = readln().toInt()

        when(opcion){

            1-> {

                op.sumar()
                historial.add(op)
                hist.add(op.suma)


            }
            2-> {

                println(op.resta())
                historial.add(op)
                hist.add(op.resta())

            }
            3-> {

                op.raiz(n1)
                historial.add(op)
                hist.add(op.raiz)


            }
            4-> {

                println(op.cuadrado(n2))
                historial.add(op)
                hist.add(op.cuadrado(n2))

            }
            5-> {
                println("Historial: $historial")
                for (n in hist) {

                    println(n)
                }
            }

        }

    }while(au == 1)


}