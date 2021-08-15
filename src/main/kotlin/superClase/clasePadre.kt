package superClase

import subClase.*


 class clasePadre  {
    var sexo : Boolean?= false
    var nombre  : String?=null
    var altura : Int?= null
    var edad : Int?= null
    var peso : Double?= null
    var actividad : Array<String> = arrayOf<String>("No hago actividad" , "Una vez a la semana" , "Tres o mas veces a la semana")
    var actividad_elejida : Int ?= null
    var activo : Boolean =true //Variable que controla el loop del menu de navegacion.

    // objetos
    var IB : indiceBasal = indiceBasal()
    var GC : grasaCorporal = grasaCorporal()
    var PPM : calculoPPM = calculoPPM()
    var PI : pesoIdeal = pesoIdeal()
    /**
     * Metodo que pide datos basicos para el funcionamiento de las formulas del programa. El objetivo
     * es pedirlos al principio de una vez y no cada vez que los necesite para las formulas, de esta forma
     * el programa no es tan molesto para el usuario.
     * Return : un mensaje de que los datos fueron cargados exitosamente.
     */
    fun programa () : String {
        println("")
        println ("Para una mejor experiencia de usuario, vamos a pedirte unos datos.")
        print("¿Nombre? = ")
        nombre  = readLine()

        try {
            print("¿Edad? = ")
            edad = readLine()?.toInt()
        } catch (e : NumberFormatException) {
            edad = 25
        }

        try{
            print("Altura en cm = ")
            altura = readLine()?.toInt()
        } catch (e : NumberFormatException) {
            altura = 170
        }


        var sexoCorrecto : Boolean = false
        while(sexoCorrecto == false){
            print("Sexo (Mujer (M) / Hombre(H)) = ")
            var opcion_elejida : String ?= readLine()
            if (opcion_elejida.equals("M") or opcion_elejida.equals("m")) {
                sexo = true
                sexoCorrecto = true
            } else if (opcion_elejida.equals("H") or opcion_elejida.equals("h")){
                sexo = false
                sexoCorrecto = true
            } else if (!opcion_elejida.equals("M") or !opcion_elejida.equals("m") or
                !opcion_elejida.equals("H") or !opcion_elejida.equals("h")){
                println("Opcion no valida")
            }

        }


        try {
            print("Peso en Kg = ")
            peso = readLine()?.toDouble()
        } catch (e : java.lang.NumberFormatException) {
            peso = 75.0
        }


        println("Elije nivel de actividad, escribir numero de opcion elejida = ")
        println(" 0 - ${actividad.get(0)}")
        println(" 1 - ${actividad.get(1)}")
        println(" 2 - ${actividad.get(2)}")
        actividad_elejida = readLine()?.toInt() ?: 0

        var agradecimiento :String = " Gracias por tus datos. Podes utilizar el software libremente."
        return agradecimiento
    }


    fun menu_navegacion () {

        while (activo == true) {
            try {
                println("")
                println("")
                println("***      Menu de navegacion      ***")
                println("1, Calculo del indice basal.")
                println("2, Medidor de grasa corporal.")
                println("3, Rendimiento de las pulsaciones por minuto.")
                println("4, Calculo de tu peso ideal.")
                println("5, Salir del programa")


                var opcion: Int? = readLine()?.toInt()
                when (opcion ?: 5) {
                    1 -> IB.calcular(sexo,peso,altura,edad,actividad_elejida)
                    2 -> GC.calcular(altura, peso, edad, sexo)
                    3 -> PPM.calcular(edad)
                    4 -> PI.calcular(altura,sexo)
                    5 -> activo = false
                    else -> print("No valido, volver a intentar.")
                 }


            } catch (E:Exception) {
               menu_navegacion()
            }
        }

        println("Fin del programa.")

    }


 }
