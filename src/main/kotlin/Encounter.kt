import java.util.Random

class Encounter(_player:Player,_enemy:Enemy) {
    val enemy = _enemy
    val player = _player

    init {
        println("${player.name} has encountered: ${enemy.title}")
    }

    fun beginEncounter() {
        println("${enemy.title} appears, wielding a ${enemy.weapon.name}. " +
                "You are using a ${player.weapon.name}.")
        println("Would you like to:\n" +
                "a - attack\n" +
                "r - run\n" +
                "n - negotiate")
        val action = readLine()
        when(action){
            "a" -> player.basicAttack()
            "r" -> {
                val chanceToRun = Random()
                if (chanceToRun.nextFloat() > 0.3) println("You escaped!") else println("He's still after you!")
            }
            "n" -> println("""You yell: "Hail, traveler!"""")
        }
    }
}