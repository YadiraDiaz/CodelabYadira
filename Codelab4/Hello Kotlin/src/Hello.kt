import java.util.*    // required import

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")


    // Will assign kotlin.Unit

    print("\n")
    val isUnit = println("This is an expression")
    println(isUnit)

    //todo tiene un valor

    print("\n")
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    print("\n")
    val temperature2 = 10
    val message = "The water temperature is ${ if (temperature2 > 50) "too warm" else "OK" }."
    println(message)

    //llamado funciones
    print("\n")
    feedTheFish()

    print("\n")
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

    //impresion filtro
    print("\n")
    println( decorations.filter {it[0] == 'p'})
    print("\n")
    println("eager: $eager")
    print("\n")
    println("filtered: $filtered")
    print("\n")
    println("new list: $newList")
    print("\n")
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
    print("\n")
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
    //lambdas
    print("\n")
    println(waterFilter(dirtyLevel))
    print("\n")
    println(updateDirty(30, waterFilter))
    print("\n")
    println(updateDirty(15, ::increaseDirty))
}

//funciones

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

//funciones compactas

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

//filtros

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
// eager, creates a new list
val eager = decorations.filter { it [0] == 'p' }
// lazy, will wait until asked to evaluate
val filtered = decorations.asSequence().filter { it[0] == 'p' }
// force evaluation of the lazy list
val newList = filtered.toList()

val lazyMap = decorations.asSequence().map {
    println("access: $it")
    it
}

val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
    println("access: $it")
    it
}

//lambdas

var dirtyLevel = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

//funcion orden superior

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1

