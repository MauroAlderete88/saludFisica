package subClase



class pesoIdeal  {

    /**
     * Formula para el calculo peso ideal de hombre.
     */
    private fun pesoIdealHombre(altura: Int?) : String {
        var calculo : Double = (altura!! - 100 - ((altura!! - 150 ) / 4 )).toDouble()
    return "Tu peso ideal es de $calculo kg"
    }

    /**
     * Formula para el calculo peso ideal de una mujer.
     */
    private fun pesoIdealMujer(altura: Int?) : String {
        var calculo : Double = altura!! - 100 - ((altura - 150 )/ 2.5)
    return "Tu peso ideal es de $calculo kg"
    }

    /**
     * Se comunica con el metodo adecuado segun sexo y luego imprime resultado.
     */
    fun calcular(altura: Int?, sexo: Boolean?){
        var respuesta : String = ""
        if (sexo == false){
            respuesta = pesoIdealHombre(altura)
        } else {
            respuesta = pesoIdealMujer(altura)
        }

        println(respuesta)
    }

}
