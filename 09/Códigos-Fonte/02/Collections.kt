fun main(args: Array<String>) {
    
    //var l = mutableListOf("A", "B", "C", "D")
    //var l = setOf("A", "B", "C", "D", "D")
    //l.removeAt(1)
    //l.forEach({ println(it) })
    
    //var m = mapOf(1 to "A", 2 to "B", 3 to "C")
    var m = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    
    m.remove(3)
    m.put(4, "D")
    
    m.forEach({ k, v -> println("$k --> $v") })
}
