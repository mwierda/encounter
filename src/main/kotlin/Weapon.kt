class Weapon(_type:WeaponType,_durability:Durability) {
    val type = _type
    val durability = _durability
    var name:String = ""
    init {
        when (type) {
            WeaponType.UNARMED -> name = "fists"
            WeaponType.DAGGER -> name = "dagger"
            WeaponType.SWORD -> name = "sword"
            WeaponType.BOW -> name = "bow"
        }
    }
}