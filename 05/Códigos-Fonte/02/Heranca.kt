fun main(args: Array<String>) {
    var c = Cachorro("Rex")
    println(c.nome)
    c.falar()
    
    var p = Papagaio()
    println(p.nome)
    p.falar()
    p.voar()
    
    var a : Animal = Cachorro("Lulu")
    println(a.nome)
    a.falar()
}

abstract class Animal(var nome: String) {
    abstract fun falar()
}

class Cachorro(nome : String) : Animal(nome) {
    override fun falar() {
        println("AU-AU")
    }
}

class Papagaio : Animal("Loro"), Voa {
    override fun falar() {
        println("Currupaco")
    }
    
    override fun voar() {
        println("Voando...")
    }
}

interface Voa {
    fun voar()
}