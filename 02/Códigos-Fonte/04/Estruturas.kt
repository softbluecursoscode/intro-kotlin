fun main(args: Array<String>) {
    // Cifra de Cesar
    // Mensagem: KOTLIN
    // Cifrada:  NRWOLQ
    
    val msg = "KOTLINXYZ"
    val offset = 3
    
    for (c in msg) {
        var i = c.toInt() + offset
        var r = i.toChar()
        print(r)
    }
    
    println()
    for (j in 0..msg.length - 1 step 1) {
        var i = msg[j].toInt() + offset
        var r = i.toChar()
        print(r)
    }

    println()
    var j = 0
    while (j < msg.length) {
        var i = msg[j].toInt() + offset
        var r = i.toChar()
        print(r)
        j++
    }
    
    println()
    for (c in msg) {
        var i = c.toInt() + offset
        
        //if (i > 90) {
        //    i = 65 + i - 90 - 1
        //}
        
        i = if (i > 90) 65 + i - 90 - 1 else i
        
        var r = i.toChar()
        print(r)
    }
}