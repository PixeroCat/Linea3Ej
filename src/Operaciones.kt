class Operaciones(var n1:Double, var n2:Double) {

    private var _suma:Double = n1 + n2 // Variable privada de suma
    private var _raiz: Double = Math.sqrt(n1) // Variable privada de raiz

    // Getter para acceder a la suma
    var suma: Double
        get() = _suma
        set(value) {
            _suma = value
        }

    // Getter para acceder al valor de la raíz cuadrada
    var raiz: Double
        get() = _raiz
        set(value) {
            _raiz = value
        }

    // Función sin parametros y sin retorno
    fun sumar (){

        _suma = n1 + n2
        println("La suma es $_suma")

    }

    //Función sin parametros y con retorno
    fun resta ():Double{

        return (n1-n2)

    }
    //Función con parametros y sin retorno
    fun raiz(n1:Double){

        _raiz = Math.sqrt(n1)
        println("La raiz del primer número es $_raiz")

    }
    //Funciones con parametros y con retorno
    fun cuadrado(n2:Double):Double{

        return Math.pow(n2, 2.0)

    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }


}