import Tipo.Efectividad

class Pokemon(nombre: String, lore: String, tipo: Tipo, fuerza: Int, vida: Int) {
    val name = nombre
    val pokedex = lore
    val typePokemon = tipo
    val power = fuerza
    var ps = vida
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