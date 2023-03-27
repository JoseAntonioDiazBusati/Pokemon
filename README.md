# Pokemon
## Explicación del código

Trabajo de entorno junto a Pablo Carmona.  

El proyecto se divide en 4 clases :  

- La clase Jugador se define por la eleccion de un pokemon para cada jugador.
     - En la clase jugador tendremos una función para que pueda obtener un pokemon que hayamos creado.
- La clase Pokemon define a cada uno por sus puntos de vida, tipo, nombre.
     - En la clase pokemon hay una funcion para recibir el daño de la clase ataque según sea un movimiento efectivo o no. 
- La clase Tipo define el tipo de cada pokemon.
     - En la clase Tipo hemos hecho una función para que reciba el tipo del pokemon que recibe el ataque y el tipo del ataque , es decir, veremos si es efectivo o no y se lo mandará a la función de la clase pokemon
- La clase Ataque que esta define la potencia de cada ataque y su tipo.

Luego tendremos el main , donde crearemos los ataques , los pokemons y los entrenadores con uno de los pokemons creados . En nuestro ejemplo es :
- **val ataqueFuego** = Ataque("Llamarada", Tipo("fuego"), 80)    

- **val ataqueAgua** = Ataque("Chorro de agua", Tipo("agua"), 70)  

- **val ataquePlanta** = Ataque("Rayo solar", Tipo("planta"), 90)    

- **val charmander** = Pokemon("Charmander", "Un lagartijón que escupe fuego y se convierte en dragon", Tipo("fuego"), 50, 100)    

- **val squirtle** = Pokemon("Squirtle", "Una tortuga y que mas quieres", Tipo("agua"), 40, 120)    

- **val bulbasaur** = Pokemon("Bulbasaur", "Un bicharraco que se fuma hasta la hierba del suelo", Tipo("planta"), 45, 110)    

- **val jugador1** = Jugador(charmander)    

- **val jugador2** = Jugador(squirtle)    

Dentro del main  existe un bucle que acabará cuando uno de los pokemons en el  combate acabe debilitado . Comenzará el combate y asignaremos numeros a los ataques anteriormente agregados para lanzarlos durante el combate. Empieza el turno el jugador 1 y luego el jugador 2
