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
     * Ahora vamos a crear un método para que durante el combate dependiendo de que tipo sea el pokemon y el tipo del ataque realizará más daño,menos o igual al poder que le demos.
     * Dependiendo si el ataque es muy,poco o igual de defectivo devolverá un mensaje que lo demuestre .
     */
    fun recibirAtaque(ataque: Ataque): Int {
        val efectividad = Tipo.calcularEfectividad(ataque.type,this.typePokemon)
        val daño = when (efectividad) {
            Efectividad.MUY_EFECTIVO -> ataque.damage * 2
            Efectividad.POCO_EFECTIVO -> ataque.damage / 2
            else -> ataque.damage
        }
        ps -= daño
        return when (efectividad) {
            Efectividad.MUY_EFECTIVO -> "Es muy eficaz!"
            Efectividad.POCO_EFECTIVO -> "No es muy eficaz😑"
            else -> "Ni más ni menos daño :)"
        }
    }
}