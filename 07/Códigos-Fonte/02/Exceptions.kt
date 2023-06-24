fun main(args: Array<String>) {
    try {
        val r = calculate(1.0, -5.0, 6.0)
        //val r = calculate(1.0, 2.0, 3.0)
        println(r)
    
    } catch (e: DeltaNegativoException) {
        println("O delta não pode ser calculado: ${e.message}")
    
    } finally {
        println("O programa terminou")
    }
}

data class Result(val x1: Double, val x2: Double)

fun calculate(a: Double, b: Double, c: Double) : Result {
    val delta = b * b - 4 * a * c
    
    if (delta < 0) {
        throw DeltaNegativoException("Delta é negativo: $delta")
    }
    
    val x1 = (-b + Math.sqrt(delta)) / (2 * a)
    val x2 = (-b - Math.sqrt(delta)) / (2 * a)
    
    return Result(x1, x2)
}

class DeltaNegativoException(msg: String) : Throwable(msg) {
    
}