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

    fun calcularEfectividad(tipoAtaque: Tipo): Efectividad {
        if (tipo == "fuego") {
            return when (tipoAtaque.tipo) {
                "hierba" -> Efectividad.MUY_EFECTIVO
                "agua" -> Efectividad.POCO_EFECTIVO
                else -> Efectividad.NORMAL
            }
        } else if (tipo == "agua") {
            return when (tipoAtaque.tipo) {
                "fuego" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POCO_EFECTIVO
                else -> Efectividad.NORMAL
            }
        } else if (tipo == "hierba") {
            return when (tipoAtaque.tipo) {
                "agua" -> Efectividad.MUY_EFECTIVO
                "fuego" -> Efectividad.POCO_EFECTIVO
                else -> Efectividad.NORMAL
            }
        }
        return Efectividad.NORMAL
    }

    fun obtenerFortalezas(): List<String> {
        return fortalezas[tipo] ?: emptyList()
    }

    fun obtenerDebilidades(): List<String> {
        return debilidades[tipo] ?: emptyList()
    }

}
