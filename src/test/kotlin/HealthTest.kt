import org.junit.Assert
import org.junit.Test


class HealthTest {
    // Testing Health functionality
    @Test
    fun testHealthBelowZero() {
        val health = Health(20)
        health.removeHealth(21)
        Assert.assertEquals(0,health.getHealth())
    }
    @Test
    fun testHealthAboveZero() {
        val health = Health(20)
        health.removeHealth(15)
        Assert.assertEquals(5,health.getHealth())
    }
    @Test
    fun testHealing() {
        val health = Health(20)
        health.removeHealth(15)
        health.recoverHealth(3)
        Assert.assertEquals(8,health.getHealth())
    }
    @Test
    fun testIncreaseMaxHealth() {
        val health = Health(20)
        health.increaseMaxHealth(10)
        Assert.assertEquals(30,health.getMaxHealth())
    }
    @Test
    fun testIncreaseMaxHealthAdvanced() {
        val health = Health(20)
        health.removeHealth(5)
        health.increaseMaxHealth(5)
        Assert.assertEquals(25,health.getMaxHealth())
    }
}