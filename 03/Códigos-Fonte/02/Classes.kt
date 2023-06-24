fun main(args: Array<String>) {
    var r = Retangulo(20.0, 5.0)
    var a = r.calcularArea()
    println(a)
    var p = r.perimetro
    println(p)
    
    r = Retangulo(10.0)
    a = r.calcularArea()
    println(a)
    p = r.perimetro
    println(p)
}

//class Retangulo(a: Double, l: Double) {
//    var altura : Double = a
//    var largura : Double = l

class Retangulo(var altura: Double, var largura: Double) {
    val perimetro : Double
    	get() = altura * 2 + largura * 2
    
    constructor(lado: Double) : this(lado, lado) {
        println("Quadrado")
    }
    
    //fun calcularArea() : Double {
    //    return altura * largura
    //}
    
    fun calcularArea() : Double = altura * largura
}