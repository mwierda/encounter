class Health(private var maxHealth:Int) {
    private var currHealth = maxHealth

    fun getHealth(): Int {
        return currHealth
    }

    fun getMaxHealth(): Int {
        return maxHealth
    }

    fun removeHealth(healthToRemove:Int):Unit {
        this.currHealth = currHealth-healthToRemove
        if (currHealth < 0) currHealth = 0
    }

    fun recoverHealth(amountToHeal:Int): Unit {
        currHealth += amountToHeal
        if (currHealth > maxHealth) currHealth = maxHealth
    }

    fun increaseMaxHealth(amountToIncreaseMaxBy:Int):Unit {
        this.maxHealth += amountToIncreaseMaxBy
    }
}