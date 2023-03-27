import Tipo.Efectividad

class Pokemon(nombre: String, lore: String, tipo: Tipo, fuerza: Int, vida: Int) {
    /**
     * Estos son los atributos necesarios para crear un pokemon
     * @property name Es el nombre del pokemon que debemos crear
     * @property pokedex Es un dato que queramos meter al pokemon como una entrada de la pokedex
     * @property typePokemon Es el tipo del pokemon que hemos creado
     * @property power Es un dato de poder del pokemon que actualmente no lo usamos
     * @property ps Son los puntos de vida del pokemon
     * @author Pablo
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
     * @receiver Recibe por una funcion externa si un ataque es efectivo o no contra el pokemon que lo recibe
     * @return Devuelve la vida restante del pokemon
     * @author Pablo
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
