package subClase


class grasaCorporal{

    /**
     * Calcula el imc, sera usado en la formula final para el calculo de grasa.
     */
    private fun imc (peso: Double?, altura: Int?) : Double {
        var resultado : Double = peso!! / (altura!! * altura!!)
        return resultado
    }

    /**
     * Calcula la grasa corporal y arroja un resultado.
     */
    private fun grasaHombre (altura: Int?, peso: Double?, edad: Int?) : String{
      var resultado : Double = (1.2 * imc(peso,altura)) + (0.23 * edad!!) - (10.8 * 1)- 5.4

       var respuesta : String =  when (resultado) {
            in 0.0 .. 1.9 -> "Nivel graso bajo."
            in 2.0 .. 5.0 -> "Segun tus datos estas en el porcentaje de grasa esencial."
            in 6.0 .. 13.0 -> "Segun tus datos tenes un nivel de grasa para atletas."
            in 14.0 .. 17.0 -> "Posees nivel de grasa para cuerpos Fitness"
            in 18.0 .. 24.0 -> "Tienes un nivel de grasa aceptable para una persona"
            !in 0.0 .. 24.0 -> "Segun tus datos tienes Obesidad."

           else -> ""
       }

     return respuesta
    }

    /**
     * Calcula la grasa corporal y arroja un resultado.
     */
    private fun grasaMujer (altura: Int?, peso: Double?, edad: Int?) : String {
        var resultado : Double = (1.2 * imc(peso,altura)) + (0.23 * edad!!) - 10.8- 5.4

        var respuesta : String =  when (resultado) {
            in 0.0 .. 9.9 -> "Nivel graso muy bajo."
            in 10.0 .. 13.0 ->  "Segun tus datos estas en el porcentaje de grasa esencial."
            in 14.0 .. 20.0 ->  "Segun tus datos tenes un nivel de grasa para atletas."
            in 21.0 .. 24.0 ->  "Posees nivel de grasa para cuerpos Fitness"
            in 25.0 .. 31.0 ->  "Tienes un nivel de grasa aceptable para una persona"
            !in 0.0 .. 31.0 -> "Segun tus datos tienes Obesidad."

            else -> ""
        }

        return respuesta

    }

    fun calcular (altura: Int?, peso: Double?, edad: Int?, sexo: Boolean?){
        if (sexo ==false) {
            println(grasaHombre(altura,peso,edad))
        }else{
            println(grasaMujer(altura,peso,edad))
        }
    }
}