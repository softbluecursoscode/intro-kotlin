fun main(args: Array<String>) {
   
    var auto : Veiculo = Automovel()
    
    //var auto2 : Automovel = auto as Automovel
    var auto2 : Motocicleta? = auto as? Motocicleta?
    print(auto2)
    
    if (auto is Automovel) {
    	auto.abrirPorta()
    }
}

open class Veiculo {
}

class Automovel : Veiculo() {
    fun abrirPorta() {
        print("Abriu a porta")
    }
}

class Motocicleta : Veiculo() {
}