package superClase

fun main (){
   var iniciar : clasePadre = clasePadre()
   println("*                      Binvenidos a salud                          *")
   println("Este es un software de consola donde podras ver datos fisicos tuyos.")
   println("                        **Advertencia**")
   println("El objetivo de este software es la mejora de skills con Kotlin, en ")
   println("ningun caso reemplazara la experiencia de un especialista.")


   println(iniciar.programa())
   println(iniciar.menu_navegacion())
}