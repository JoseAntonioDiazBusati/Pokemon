class Tipo(var tipo: String) {
    /**
     * Creamos una enum class para diferenciar la efectividad de los ataques en los pokemons
     * @author Pablo
     */
    enum class Efectividad(val valor: Double) {
        MUY_EFECTIVO(2.0),
        NORMAL(1.0),
        POCO_EFECTIVO(0.5)
    }
    /**
     * Con este método podremos saber si el pokemon al que están atacando le hacen más, menos o igual daño.
     * Esta función se utiliza en la clase pokemon para que el pokemon pueda recibir correctamente el daño.
     * @receiver Recibe el tipo del ataque lanzado
     * @receiver Recibe el tipo del pokemon que va a recibir un ataque
     * @return Devolverá si un movimiento es efectivo o no en el pokemon rival
     * @author Pablo
     */
    companion object {
        fun calcularEfectividad(tipoAtaque: Tipo, tipoActual: Tipo): Efectividad {
            return when (tipoActual.tipo) {
                "fuego" -> when (tipoAtaque.tipo) {
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
                else -> Efectividad.NORMAL
            }
        }
    }
}