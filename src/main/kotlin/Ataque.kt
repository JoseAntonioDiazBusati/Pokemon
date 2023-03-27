
class Ataque(nombre:String,tipo:Tipo,danio:Int) {
    /**
     * Estos son los atributos necesarios para crear un ataque
     * @property name Es el nombre del ataque o movimiento que creemos
     * @property type Es el tipo del ataque que hemos creado dependiendo de cuál sea afecta de una manera u otra tendrá un efecto distinto en el pokemon rival
     * @property damage Es el daño que causará el ataque dependiedo del factor anterior puede multiplicarse o dividirse su daño según el tipo rival.
     * @author Pablo
     */
    val name = nombre
    val type = tipo
    val damage = danio
}