fun main(args: Array<String>) {
    
    //var notas: Array<Double>
    //notas = arrayOf(8.5, 9.0, 7.0, 6.5)
    
    var notas: DoubleArray = DoubleArray(5)
    //notas = doubleArrayOf(8.5, 9.0, 7.0, 6.5)
    
    notas[3] = 7.0
    
    for (i in notas) {
        //println("O aluno tirou " + i + " na prova")
        println("O aluno tirou ${i * 10} na prova")
    }
}