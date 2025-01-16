package org.example

enum class FishType {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun showAvialableFish() {

    println("Доступные рыбы для добавления в ваш аквариум:")
    for (fish in FishType.values()) {
        println("- ${fish.name.lowercase().replace('_', ' ')}")
    }
}

fun main() {
    showAvialableFish()
}