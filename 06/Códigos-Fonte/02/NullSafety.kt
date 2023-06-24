fun main(args: Array<String>) {
    
    var s : String? = "abcde"
    
    if (s != null) print(s.toUpperCase())
    
    s = null
    print(s?.length ?: 0)
    
    print(s!!.length)
}