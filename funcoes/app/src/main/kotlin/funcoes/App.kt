package funcoes

fun main() {
    minhaPrimeiraFuncao("Agora vai!")
    minhaPrimeiraFuncao(funcaoQueRetornaUmDataType("Agora vai!"))
    minhaPrimeiraFuncao(funcaoQueRetornaUmNumeroMultiplicadoPor2(2))
    funcaoQueRecebeMuitosElementos("Agora vai", "Duas vezes");
    
    println("#################################Agora sua vez de codar#########################")
    
    // Tarefa 1: Crie uma função que dado um numero retorne verdadeiro ou falso se é par.
    // Tarefa 2: Crie uma função que dado uma lista retorne verdadeiro ou falso se a quantidade é maior que 1
    // Tarefa 3: Crie uma função que retorn uma string sempre em UPPERCASE!
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