package funcoes

fun main() {
    minhaPrimeiraFuncao("Agora vai!")
    minhaPrimeiraFuncao(funcaoQueRetornaUmDataType("Agora vai!"))
    minhaPrimeiraFuncao(funcaoQueRetornaUmNumeroMultiplicadoPor2(2))
    funcaoQueRecebeMuitosElementos("Agora vai", "Duas vezes");
    
    println("#################################Agora sua vez de codar#########################")
    
    // Tarefa 1: Crie uma função que dado um numero retorne verdadeiro ou falso se é par.
    println(funcaoQueRetornaVerdadeiroOuFalsoSeONumeroEPar(20))
    // Tarefa 2: Crie uma função que dado uma lista retorne verdadeiro ou falso se a quantidade é maior que 1
    println(funcaoQueRetornaVerdadeiroOuFalsoSeAListaTemMaisDeUmElemento(listOf("Agora vai", "Duas vezes")))
    // Tarefa 3: Crie uma função que retorn uma string sempre em UPPERCASE!
    println(funcaoQueRetornaUmaStringSempreEmUppercase("Agora vai"))
}

// função void
fun minhaPrimeiraFuncao(texto: String) {
    return println("[Meu texo personalizado]: $texto");
}


// função que retorna um tipo
fun funcaoQueRetornaUmNumeroMultiplicadoPor2(item: Int) : String {
    return (item * 2).toString()
}

// função generica que recebe qualquer tipo
fun <T> funcaoQueRetornaUmDataType(item: T) : T {
    return item
}

// função que recebe n elementos de um tipo
fun funcaoQueRecebeMuitosElementos(vararg parametros: String) {
    for (parametro in parametros) {
        minhaPrimeiraFuncao(parametro)
    }
}

fun funcaoQueRetornaVerdadeiroOuFalsoSeONumeroEPar(numero: Int) : Boolean {
    return numero % 2 == 0
}

fun funcaoQueRetornaVerdadeiroOuFalsoSeAListaTemMaisDeUmElemento(lista: List<String>) : Boolean {
    return lista.size > 1
}

fun funcaoQueRetornaUmaStringSempreEmUppercase(texto: String) : String {
    return texto.toUpperCase()
}