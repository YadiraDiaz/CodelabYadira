fun main() {
    // Ejemplo 1: Uso de un valor nulo y captura de NullPointerException
    var s: String? = null

    try {
        // Intentar acceder a la longitud de una cadena que podría ser null
        val length = s!!.length // Esto lanzará NullPointerException si s es null
        println("La longitud de la cadena es: $length")
    } catch (e: NullPointerException) {
        println("Se ha producido una NullPointerException: ${e.message}")
    }

    // Ejemplo 2: Uso de llamada segura y operador Elvis
    s = "Hola, Kotlin!"
    val safeLength = s?.length ?: 0 // No lanzará excepción, sino que retornará 0 si s es null
    println("La longitud de la cadena segura es: $safeLength")

    // Ejemplo 3: Uso de una función que puede lanzar una excepción
    try {
        val result = divide(10, 0) // Intentar dividir por cero
        println("El resultado de la división es: $result")
    } catch (e: ArithmeticException) {
        println("Se ha producido una ArithmeticException: ${e.message}")
    }
}

// Función que puede lanzar ArithmeticException si el divisor es 0
fun divide(numerator: Int, denominator: Int): Int {
    if (denominator == 0) {
        throw ArithmeticException("División por cero no permitida.")
    }
    return numerator / denominator
}
