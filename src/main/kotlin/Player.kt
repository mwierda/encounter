class Player(_saveFileName:String,_characterName:String) {
    val name = _characterName
    val filename = _saveFileName
    var weapon:Weapon = Weapon(WeaponType.UNARMED,Durability.UNBREAKABLE)

    fun name():String {
        return this.name
    }

    fun weaponName():String {
        return this.weapon.name
    }

    fun weaponType():WeaponType{
        return this.weapon.type
    }

    fun changeWeapon(newWeapon:Weapon) {
        this.weapon = newWeapon
    }

    fun basicAttack(): Unit {
        println("Player attacks with ${this.weapon.name}")
    }
}