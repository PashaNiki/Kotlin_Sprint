package org.example

open class CelestiaBody(
    val name: String,
    val hasAtmosphere: Boolean
) {
    open fun displayinfo() {
        println("Небесное тело: $name, Атмосфера: ${if (hasAtmosphere) "есть" else "нет"}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestiaBody(name, hasAtmosphere) {
    override fun displayinfo() {
        super.displayinfo()
        if (satellites.isEmpty()) {
            println("$name не имеет спутников.")
        } else {
            println("Спутники планеты $name:")
            satellites.forEach { println("- ${it.name}") }
        }
    }
}

class Satellite(name: String, hasAtmosphere: Boolean) : CelestiaBody(name, hasAtmosphere) {
    override fun displayinfo() {
        println("Спутник: $name, Атмосфера: ${if (hasAtmosphere) "есть" else "нет"}")
    }
}

    fun main() {
        val moon1 = Satellite("Фобос", false)
        val moon2 = Satellite("Деймос", false)

        val mars = Planet(name = "Марс", hasAtmosphere = true)

        mars.satellites.add(moon1)
        mars.satellites.add(moon2)

        mars.displayinfo()
    }