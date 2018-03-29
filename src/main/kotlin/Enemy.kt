open class Enemy(_title:String,_dangerLevel:DangerRating) {
    val title = _title
    val dangerLevel = _dangerLevel
    open var weapon:Weapon = Weapon(WeaponType.UNARMED,Durability.WORN)
}