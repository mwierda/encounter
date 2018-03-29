class Bandit(_dangerLevel:DangerRating): Enemy("Bandit",_dangerLevel) {
    override var weapon:Weapon = Weapon(WeaponType.DAGGER,Durability.WORN)

    fun changeWeapon(newWeapon:Weapon) {
        this.weapon = newWeapon
    }

    fun basicAttack(): Unit {
        println("Bandit attacks with ${this.weapon.name}")
    }
}