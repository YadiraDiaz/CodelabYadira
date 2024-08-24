@file:Suppress("SpellCheckingInspection")

fun main() {
    println("")

    // Usando un par
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    println("")

    // Usando un triple
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    println("")

    // Usando un par anidado
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println(equipment2.first.second)

    println("")

    // Desestructuración de un par
    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use")

    println("")

    // Desestructuración de un triple
    val numbers2 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers2
    println("$n1 $n2 $n3")

    // Colecciones: listas y mapas hash

    println("")

    // Lista de enteros
    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    println("")

    // Lista de cadenas
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumOf { it.length })

    println("")

    // Iterador de lista
    val list3 = listOf("a", "bbb", "cc")
    for (s in list3.listIterator()) {
        println("$s ")
    }

    println("")

    // Mapa hash
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures["white spots"])
    println(cures["red sores"])
    println(cures["scale loss"])
    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    println(cures.getOrElse("bloating") { "No cure for this" })

    println("")

    // Mapa mutable
    val inventory = mutableMapOf("fish net" to 1)
    inventory["tank scrubber"] = 3
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}
