fun main() {
    /**
     * Antes de empezar el combate tenemos que crear un ataque de cada tipo para ver los efectos en cada pokemon. Todos los pokemons podrán usarlos.
     * En futuras versiones del juego los pokemons dispondrán de 4 ataques cada uno.
     * @author Pablo
     */
    val ataqueFuego = Ataque("Llamarada", Tipo("fuego"), 80)
    val ataqueAgua = Ataque("Chorro de agua", Tipo("agua"), 70)
    val ataquePlanta = Ataque("Rayo solar", Tipo("planta"), 90)

    /**
     * Creamos nuestros primeros pokemons para las versiones beta del juego.
     * @author Pablo
     */
    val charmander = Pokemon("Charmander", "Un lagartijón que escupe fuego y se convierte en dragon", Tipo("fuego"), 50, 100)
    val squirtle = Pokemon("Squirtle", "Una tortuga y que mas quieres", Tipo("agua"), 40, 120)
    val bulbasaur = Pokemon("Bulbasaur", "Un bicharraco que se fuma hasta la hierba del suelo", Tipo("planta"), 45, 110)

    /**
     * Creamos a los 2 jugadores de nuestro juego
     * En proximas versiones podran hacer combates de 2vs2 y almacenar hasta 6 pokemons en su equipo.
     * @author Pablo
     */
    val jugador1 = Jugador(charmander)
    val jugador2 = Jugador(squirtle)

    /**
     * Esta parte da comienzo a nuestro combate, el cual acabará cuando 1 de los pokemons de los jugadores caiga a 0 ps o vida.
     * Asignaremos numeros a los ataques anteriormente agregados para lanzarlos durante el combate.
     * @author Pablo
     */
    while (jugador1.obtenerPokemon().ps > 0 && jugador2.obtenerPokemon().ps > 0) {
        /**
         * Comienza el turno del jugador 1.
         * Usando el 1 hace un ataque de fuego.
         * Utilizando el 2 hace un ataque de agua.
         * Empleando el 3 hace un ataque de planta.
         * @author Pablo
         */
        println("Turno del jugador 1")
        println("${jugador1.obtenerPokemon().name} tiene ${jugador1.obtenerPokemon().ps} PS")
        println("${jugador2.obtenerPokemon().name} tiene ${jugador2.obtenerPokemon().ps} PS")
        val ataqueJugador1 = readLine()?.toIntOrNull() ?: 0
        if (ataqueJugador1 == 1) {
            jugador2.obtenerPokemon().recibirAtaque(ataqueFuego)
            println("${jugador1.obtenerPokemon().name} usa ${ataqueFuego.name}")
        } else if (ataqueJugador1 == 2) {
            jugador2.obtenerPokemon().recibirAtaque(ataqueAgua)
            println("${jugador1.obtenerPokemon().name} usa ${ataqueAgua.name}")
        } else if (ataqueJugador1 == 3) {
            jugador2.obtenerPokemon().recibirAtaque(ataquePlanta)
            println("${jugador1.obtenerPokemon().name} usa ${ataquePlanta.name}")
        }

        if (jugador2.obtenerPokemon().ps <= 0) {
            println("${jugador2.obtenerPokemon().name} se debilitó!")
            break
        }

        /**
         * Comienza el turno del jugador 2.
         * Usando el 1 hace un ataque de agua.
         * Utilizando el 2 hace un ataque de fuego.
         * Empleando el 3 hace un ataque de planta.
         * @author Pablo
         */
        println("Turno del jugador 2")
        println("${jugador1.obtenerPokemon().name} tiene ${jugador1.obtenerPokemon().ps} PS")
        println("${jugador2.obtenerPokemon().name} tiene ${jugador2.obtenerPokemon().ps} PS")
        val ataqueJugador2 = readLine()?.toIntOrNull() ?: 0
        if (ataqueJugador2 == 1) {
            jugador1.obtenerPokemon().recibirAtaque(ataqueAgua)
            println("${jugador2.obtenerPokemon().name} usa ${ataqueAgua.name}")
        } else if (ataqueJugador2 == 2) {
            jugador1.obtenerPokemon().recibirAtaque(ataqueFuego)
            println("${jugador2.obtenerPokemon().name} usa ${ataqueFuego.name}")
        } else if (ataqueJugador2 == 3) {
            jugador1.obtenerPokemon().recibirAtaque(ataquePlanta)
            println("${jugador2.obtenerPokemon().name} usa ${ataquePlanta.name}")
        }
        if (jugador1.obtenerPokemon().ps <= 0) {
            println("${jugador1.obtenerPokemon().name} se debilitó!")
            break
        }
    }
}