package org.example

class Ingredient(
    val name: String,
    val quantity: String
)

class Recipe(
    val id: String,
    val title: String,
    val imageUrl: String,
    val servings: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>
)

fun main() {
    val ingredients = listOf(
        Ingredient(name = "Творог", quantity = "350 г"),
        Ingredient(name = "Куриное яйцо", quantity = "2 штуки"),
        Ingredient(name = "Пшеничная мука", quantity = "6 с.ложек"),
        Ingredient(name = "Подсолнечное масло", quantity = "5 c.ложен"),
        Ingredient(name = "Сахао", quantity = "2 с. ложки")
    )

    val steps = listOf(
        "1. В глубокой миске смешайте говяжий фарш, лук, чекснок, соль и перец. Разделите фарш на 4 равные части и сформируйте котлеты.",
        "2. Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4-5 минут или до желаемой степени прожарки.",
        "3. В то время как котлеты готовятся, подготовьте булочки. Разрежьте их поплам и обжарьте на сковороде до золотистой корочки.",
        "4. Смажьте нижние половинки булочек горчицей и кетчупом, затем положите лист саалата, котлету, кольца помидора и закройте верхней половинкой булочки.",
        "5. Подавайте бургеры горячими с картофельными чипсами или картофельным пюре."
    )

    val recipe = Recipe(
        id = "1",
        title = "Бургер с грибами и сыром",
        imageUrl = "https://example.com/burger_image.jpg",
        servings = 3,
        ingredients = ingredients,
        steps = steps
    )

    println("Рецепт: ${recipe.title}")
    println("Порции: ${recipe.servings}")
    println("Ингридиенты:")
    recipe.ingredients.forEach { println("- ${it.name}: ${it.quantity}") }
    println("Способ приготовления:")
    recipe.steps.forEach { println(it) }

}
