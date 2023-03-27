import Tipo.Efectividad

class Pokemon(nombre: String, lore: String, tipo: Tipo, fuerza: Int, vida: Int) {
    /**
     * Estos son los atributos necesarios para crear un pokemon
     */
    val name = nombre
    val pokedex = lore
    val typePokemon = tipo
    val power = fuerza
    var ps = vida

    /**
     * Ahora vamos a crear un método para que durante el combate dependiendo
     * de que tipo sea el pokemon y el tipo del ataque realizará más daño, menos o igual al poder que le demos a ese ataque.
     * Si el movimiento es muy efectivo el daño se multiplica por 2.
     * Si el movimiento es efectivo el daño se multiplica por 1.
     * Si el movimiento no es efectivo el daño se dividirá entre 2.
     */
    fun recibirAtaque(ataque: Ataque): Int {
        val efectividad = Tipo.calcularEfectividad(ataque.type,this.typePokemon)
        val daño = when (efectividad) {
            Efectividad.MUY_EFECTIVO -> ataque.damage * 2
            Efectividad.POCO_EFECTIVO -> ataque.damage / 2
            else -> ataque.damage
        }
        ps -= daño
        return ps
    }
}
