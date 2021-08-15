package subClase

import superClase.clasePadre

class calculoPPM  {

    fun calcular(edad: Int?) {
        var pulsacionesMaximas : Int ?= edad!! - 220
        var zonaNaranjaPiso : Double ?= pulsacionesMaximas!!.toDouble() * 0.6
        var zonaNaranjaTecho : Double?= pulsacionesMaximas!!.toDouble() * 0.85

        println("Tus pulsaciones maximas son $pulsacionesMaximas por minuto.")
        println("Tus pulsaciones por minutos para quema de grasa efectiva llamada zona naranja ronda entre $zonaNaranjaPiso y $zonaNaranjaTecho pulsaciones por minuto.")

    }

}