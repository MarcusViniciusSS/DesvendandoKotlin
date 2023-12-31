fun main() {
    // Quais os tipos de Colecoes disponiveis dentro do kotlin?
    // List, Set, Map
    // Quais as diferenças entre elas?
    // List -> lista de elementos, pode ter elementos repetidos, é ordenada
    // Set -> conjunto de elementos, não pode ter elementos repetidos, não é ordenada
    // Map -> conjunto de pares chave-valor, não pode ter chaves repetidas, não é ordenada

    // Exemplos de cada uma das coleções imutaveis
    // List
    val lista = listOf("Pato", "Cachorro", "Gato")
    println(lista)

    // Set
    val conjunto = setOf("Pato", "Cachorro", "Gato")
    println(conjunto)

    // Map
    val mapa = mapOf("Pato" to "Pato", "Cachorro" to "Cachorro", "Gato" to "Gato")
    println(mapa)

    // Exemplos de cada uma das coleções mutaveis
    // List
    val listaMutavel = mutableListOf("Pato", "Cachorro", "Gato")
    listaMutavel.add("Papagaio")
    println(listaMutavel)

    // Set
    val conjuntoMutavel = mutableSetOf("Pato", "Cachorro", "Gato")
    conjuntoMutavel.add("Papagaio")
    conjuntoMutavel.remove("Pato")
    println(conjuntoMutavel)

    // Map
    val mapaMutavel = mutableMapOf("Pato" to "Pato", "Cachorro" to "Cachorro", "Gato" to "Gato")
    mapaMutavel.put("Papagaio", "Papagaio")
    println(mapaMutavel)

    // Quais as diferenças entre as coleções mutaveis e imutaveis?
    // As coleções imutaveis não podem ser alteradas, enquanto as mutaveis podem ser alteradas

    // Quais as vantagens de se utilizar coleções imutaveis?
    // As coleções imutaveis são mais seguras, pois não podem ser alteradas, e são mais performaticas

    // Quais sao os metodos disponiveis nas colecoes?
    // List -> get, indexOf, lastIndexOf, subList
    // Set -> add, remove, contains, isEmpty
    // Map -> get, put, remove, containsKey, containsValue, isEmpty

    // Quais sao os metodos disponiveis apenas nas colecoes mutaveis?
    // List -> add, remove, set
    // Set -> add, remove
    // Map -> put, remove

    println("#################################Agora sua vez de codar!########################################")

    // Tarefa 1: Crie uma lista de numeros inteiros imutaveis e exiba-a
    // Tarefa 2: Crie uma lista de numeros inteiros mutaveis e exiba-a
    // Tarefa 3: Crie um conjunto de numeros inteiros imutaveis e exiba-a
    // Tarefa 4: Crie um conjunto de numeros inteiros mutaveis e exiba-a
    // Tarefa 5: Crie um mapa de numeros inteiros imutaveis e exiba-a
    // Tarefa 6: Crie um mapa de numeros inteiros mutaveis e exiba-a
    // Tarefa 7: Crie verifique se dado um numero esta contido em uma lista imutavel
    // Tarefa 8: Crie verifique se dado um numero esta contido em mapa imutavel
    // Tarefa 9: Retorne a soma das quantidades de cada lista. Exemplo: lista1 = [1, 2, 3] lista2 = [4, 5, 6] resultado = 6
    // Tarefa 10: Verifique se algum elemente contains na lista. Exemplo: lista = [1, 2, 3] contains = 2 , resultado = true
}