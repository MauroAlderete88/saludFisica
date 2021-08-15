package subClase


 class indiceBasal  {

     /**
      * Realiza la formula para el indice basal en el hombre
      */
   private fun indiceBasalHombre(peso: Double?, altura: Int?, edad: Int?, actividad: Int?): String {

        println("")
        println("El indice basal es el calculo de energia(kcal) que consume tu cuerpo en un dia.")
        var parcial: Double = (10 * peso!!) + (6.25 * altura?.toDouble()!!) - (5 * edad?.toDouble()!!) + 5
        var resultado : Double?=null
        if (actividad==0){
            resultado = parcial * 1.2
        } else if ( actividad == 1) {
            resultado = parcial *  1.55
        } else if (actividad == 2) {
            resultado = parcial * 1.725
        }

        return when (actividad) {
            0 -> "De acuerdo a tu falta de actividad, tu indice basal es de : $resultado kcal diarias."
            1 -> "Segun tu nivel de actividad, tu indice basal ronda en : $resultado kcal diarias."
            2 -> "Al realizar actividad fisica con frecuencia tu indice basal es de : $resultado kcal diarias."
            else -> "error al generar el indice basal. Reintentar."
        }
    }

     /**
      * Realiza la formula para el indice basal en la mujer
      */
   private fun indiceBasalMujer (peso: Double? , altura : Int ?, edad : Int?, actividad : Int?): String {

        println("")
        println("El indice basal es el calculo de energia(kcal) que consume tu cuerpo en un dia.")
        var parcial : Double = (10 * peso!!) + (6.25 *  altura?.toDouble()!!) - ( 5 * edad?.toDouble()!!) - 161

        var resultado : Double?=null
        if (actividad==0){
            resultado = parcial * 1.2
        } else if ( actividad == 1) {
            resultado = parcial *  1.55
        } else if (actividad == 2) {
            resultado = parcial * 1.725
        }

        return when (actividad){
            0 -> "De acuerdo a tu falta de actividad, tu indice basal es de : $resultado kcal diarias."
            1 -> "Segun tu nivel de actividad, tu indice basal ronda en : $resultado kcal diarias."
            2 -> "Al realizar actividad fisica con frecuencia tu indice basal es de : $resultado kcal diarias."
            else-> "error al generar el indice basal. Reintentar."
        }
    }

     /**
      * Se comunica con el metodo adecuado segun el sexo e imprime el resultado despues.
      */
    fun calcular (sexo: Boolean?, peso: Double?, altura: Int?, edad:Int?, actividad_elejida: Int?){

        if (sexo ==false){
        println(indiceBasalHombre(peso,altura,edad,actividad_elejida))
        }else {
        println(indiceBasalMujer(peso,altura,edad,actividad_elejida))
        }

    }



}