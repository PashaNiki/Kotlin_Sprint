package org.example

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun arm(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк вооружен патроном: ${ammo.name}")
    }
    fun shoot() {
        if (currentAmmo != null) {
            println("Выстрел. Нанесен урон: ${currentAmmo!!.damage}")
        } else {
            println("Танк не вооружен")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.arm(Ammo.BLUE)
    tank.shoot()

    tank.arm(Ammo.GREEN)
    tank.shoot()

    tank.arm(Ammo.RED)
    tank.shoot()
}