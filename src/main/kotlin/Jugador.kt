class Jugador(var pokemon: Pokemon) {
    fun obtenerPokemon(): Pokemon {
        return pokemon
    }
    /**
     * Estos son los atributos necesarios para crear un jugador
     * @property pokemon define a cada jugador
     * @author Jose Antonio
     */
    fun establecerPokemon(pokemon: Pokemon) {
        this.pokemon = pokemon
    }
}
