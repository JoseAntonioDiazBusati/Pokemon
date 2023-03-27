# Pokemon
## Explicación del código

Trabajo de entorno junto a Pablo Carmona.  

El proyecto se divide en 4 clases y una funcion principal.  

- La clase Jugador se define por la eleccion de un pokemon para cada jugador.
     - En la clase jugador tendremos una función para que pueda obtener un pokemon que hayamos creado.
- La clase Pokemon define a cada uno por sus puntos de vida, tipo, nombre.
     - En la clase pokemon hay una funcion para recibir el daño de la clase ataque según sea un movimiento efectivo o no. 
- La clase Tipo define el tipo de cada pokemon.
     - En la clase Tipo hemos hecho una función para que reciba el tipo del pokemon que recibe el ataque y el tipo del ataque , es decir, veremos si es efectivo o no y se lo mandará a la función de la clase pokemon
- La clase Ataque que esta define la potencia de cada ataque y su tipo.

En la funcion principal se definen a los 3 pokemons elegibles, en los cuales se 
definen sus puntos de vida y ataque; cuando la vida de los pokemons lleguen a 
0 el combate se acaba y el vencedor será aquel que no haya sido derrotado.
