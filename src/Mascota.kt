open class Mascota(
    val Nombre: String,
    val Especie: String,
    var Edad: Int,
    var Peso: Double
) {
    fun incrementar_Edad(){
        Edad ++
    }
    fun actualizar_Peso (nuevopeso:Double){
        Peso = nuevopeso
    }
    open fun describir_Mascota(): String{
        return "Nombre $Nombre, Especie:  $Especie, Edad:  $Edad años, Peso: $Peso kg"
    }

}
