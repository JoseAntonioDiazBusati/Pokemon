class Tipo(var tipo: String) {
    private val fortalezas: Map<String, List<String>> = mapOf(
        "fuego" to listOf("hierba"),
        "agua" to listOf("fuego"),
        "hierba" to listOf("agua")
    )

    private val debilidades: Map<String, List<String>> = mapOf(
        "fuego" to listOf("agua"),
        "agua" to listOf("hierba"),
        "hierba" to listOf("fuego")
    )
    enum class Efectividad(val valor: Double) {
        MUY_EFECTIVO(2.0),
        NORMAL(1.0),
        POCO_EFECTIVO(0.5)
    }
    fun obtenerFortalezas(): List<String> {
        return fortalezas[tipo] ?: emptyList()
    }

    fun obtenerDebilidades(): List<String> {
        return debilidades[tipo] ?: emptyList()
    }

    companion object {
        fun calcularEfectividad(tipoAtaque: Tipo, tipoActual: Tipo): Efectividad {
            return when (tipoActual.tipo) {
                "fuego" -> when(tipoAtaque.tipo){
                    "agua" -> Efectividad.MUY_EFECTIVO
                    "planta" -> Efectividad.POCO_EFECTIVO
                    else -> Efectividad.NORMAL
                }
                "agua" -> when (tipoAtaque.tipo) {
                    "planta" -> Efectividad.MUY_EFECTIVO
                    "fuego" -> Efectividad.POCO_EFECTIVO
                    else -> Efectividad.NORMAL
                }
                "planta" -> when (tipoAtaque.tipo) {
                    "fuego" -> Efectividad.MUY_EFECTIVO
                    "agua" -> Efectividad.POCO_EFECTIVO
                    else -> Efectividad.NORMAL
                }
                else -> Efectividad.POCO_EFECTIVO
            }
        }
    }
}