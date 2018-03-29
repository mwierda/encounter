

/*
McKenzie Wierda 2018
wierda.mckenzie@gmail.com
 */


// Changed WeaponType so they have DangerRatings. Need to figure out how to access them next
// Added Durability class; I want to have a private number value as well
// Also want durability to lessen by a random amount in a range based on what it's used to do
// Such as attack, as a tool, or even if it's stored somewhere or traded (possibly)


fun main(args: Array<String>) {
    val player1 = Player("game1", "Mac")
    val bandit = Bandit(DangerRating.LOW)
    player1.changeWeapon(Weapon(WeaponType.SWORD, Durability.NEW))
    val basicEncounter = Encounter(player1, bandit)
    basicEncounter.beginEncounter()
}