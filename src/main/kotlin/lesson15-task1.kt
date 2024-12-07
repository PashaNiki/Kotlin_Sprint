package org.example

interface Flying {
    fun fly(): String
}

interface Swimming {
    fun swim(): String
}

    class Carp : Swimming {
        override fun swim(): String {
            return "Карась плывет в воде"
        }
    }
    class Seagul : Flying {
        override fun fly(): String {
            return "Чайка летает над морем"
        }
    }
    class Duck : Flying, Swimming {
        override fun fly(): String {
            return "Утка летает над озером"
        }

        override fun swim(): String {
            return "Утка плывет по воде"
        }
    }

    fun main() {
        val carp = Carp()
        val seagul = Seagul()
        val duck = Duck()

        println(carp.swim())
        println(seagul.fly())
        println(duck.fly())
        println(duck.swim())
    }