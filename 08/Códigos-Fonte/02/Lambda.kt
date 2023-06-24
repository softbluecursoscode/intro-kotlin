fun main(args: Array<String>) {
    
    var itens = arrayOf(
        Item("Toalha", 35.0),
        Item("Xícara", 11.0),
        Item("Mesa", 430.0),
        Item("Faca", 25.0),
        Item("Cadeira", 90.0)
    )
    
	var r = itens.filter({ it.preco < 100 })
    	.sortedBy({ it.preco })
    	//.sumByDouble({ it.preco })
    	//.count()
    	.map({ item -> item.nome.toUpperCase() })
    
    //println(r)
    
    //r.forEach({ println("${it.nome} ==> ${it.preco}") })
    r.forEach({ println(it) })
}

data class Item(val nome: String, val preco: Double)
