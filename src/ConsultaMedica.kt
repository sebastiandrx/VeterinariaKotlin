class ConsultaMedica(val mascota: Mascota, val diagnostico: String, val costoBase: Double, val incluyeMedicacion: Boolean) {
    fun calcularCosto(): Double {
        return if (incluyeMedicacion) costoBase * 1.15 else costoBase
    }
}