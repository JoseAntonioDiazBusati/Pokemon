class Jugador(var pokemon: Pokemon) {
    fun obtenerPokemon(): Pokemon {
        return pokemon
    }

    fun establecerPokemon(pokemon: Pokemon) {
        this.pokemon = pokemon
    }
}
