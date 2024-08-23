@file:Suppress("unused", "UnusedReceiverParameter", "SpellCheckingInspection")

// CONSTANTES
const val ROCKS = 3

fun complexFunctionCall(): Int {
    // Ejemplo de implementación, puede ser cualquier función que devuelva un valor constante.
    return 42
}

val value1 = complexFunctionCall() // OK
// const val CONSTANT1 = complexFunctionCall() // NOT OK: const val must be initialized with a constant expression

object Constants {
    const val CONSTANT2 = "object constant"
}

const val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

// Definición de la clase AquariumPlant y GreenLeafyPlant
open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// Funciones de extensión para AquariumPlant
fun AquariumPlant.print() = println("AquariumPlant")

// Funciones de extensión para GreenLeafyPlant
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

// Propiedad de extensión para AquariumPlant
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

// Función de extensión segura para AquariumPlant
fun AquariumPlant?.pull() {
    this?.apply {
        println("Removing $this")
    }
}

fun main() {
    println("\nDoes it have spaces? ${"Does it have spaces?".hasSpaces()}") // Outputs: true

    val plant = GreenLeafyPlant(size = 10)
    println()
    plant.print() // Outputs: GreenLeafyPlant

    println("\n")

    val aquariumPlant: AquariumPlant = plant
    println()
    aquariumPlant.print()  // Outputs: AquariumPlant (porque el método de impresión en la clase base es utilizado)

    println()
    val isGreen = aquariumPlant.isGreen
    println(isGreen) // Outputs: true (ya que el color de la planta es verde)

    println()
    val nullablePlant: AquariumPlant? = null
    nullablePlant.pull() // Sin salida ya que la planta es nula
}

// Definición de la extensión para String
fun String.hasSpaces(): Boolean {
    return this.find { it == ' ' } != null
}
