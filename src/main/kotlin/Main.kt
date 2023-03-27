fun main() {
    // Creamos algunos ataques
    val ataqueFuego = Ataque("Llamarada", Tipo("fuego"), 80)
    val ataqueAgua = Ataque("Chorro de agua", Tipo("agua"), 70)
    val ataquePlanta = Ataque("Rayo solar", Tipo("planta"), 90)

    // Creamos algunos pokémon
    val charmander = Pokemon("Charmander", "Lizardon", Tipo("fuego"), 50, 100)
    val squirtle = Pokemon("Squirtle", "Zenigame", Tipo("agua"), 40, 120)
    val bulbasaur = Pokemon("Bulbasaur", "Fushigidane", Tipo("planta"), 45, 110)

    // Creamos a los jugadores con uno de los pokemones creados
    val jugador1 = Jugador(charmander)
    val jugador2 = Jugador(squirtle)

    // Comienza el combate
    while (jugador1.obtenerPokemon().ps > 0 && jugador2.obtenerPokemon().ps > 0) {
        // Turno del jugador 1
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

        // Turno del jugador 2
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