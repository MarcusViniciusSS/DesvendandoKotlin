fun main(args: Array<String>) {
    // Onde podemos usar o Kotlin?
    // Porque deveriamos utilizar o kotlin
    // Qual a diferença entre var e val?
    // O que significa Fun?
    // Como funciona o string template?

    // ## variaveis mutaveis
    var NomeMutavel: String = "Nome do Aluno";
    var IdadeMutavel: Int = 10;

    // ## variaveis imutaveis
    val NomeDaTurma = "Desvendando Kotlin";
    val Professor = "MarcusViniciusS";

    print("Bem vindo ao curso de $NomeDaTurma, ministrado pelo professor $Professor \n")
    print("############################################################################\n")

    NomeMutavel = args[0];
    IdadeMutavel = args[1].toInt();

    // String template!!
    println("$NomeMutavel tem ${IdadeMutavel + 20} anos de idade");

    // Operadores aritmeticos
    IdadeMutavel += 7            // adicao
    IdadeMutavel -= 3            // subtração
    IdadeMutavel *= 2            // multiplicação
    IdadeMutavel /= 3            // Divisão

    // Operadores de comparação
    IdadeMutavel == 10           // igualdade
    IdadeMutavel != 10           // desigualdade
    IdadeMutavel > 10            // maior que
    IdadeMutavel < 10            // menor que
    IdadeMutavel >= 10           // maior ou igual que
    IdadeMutavel <= 10           // menor ou igual que

    // Operadores logicos
    IdadeMutavel > 10 && IdadeMutavel < 20 // AND
    IdadeMutavel > 10 || IdadeMutavel < 20 // OR
    !(IdadeMutavel > 10)                   // NOT

    // Tipos basicos (https://kotlinlang.org/docs/basic-types.html)
    // Integers [Byte, Short, Int, Long]
    // Floating-point numbers [Float, Double]
    // Characters [Char]
    // Booleans [Boolean]
    // Strings [String]
    // Unsigned integers [UByte, UShort, UInt, ULong]
    // Arrays [Array]

    print("###############################Aqui inicia sua vez de codar!!#############################################")

    // tarefa 1: subistituir dentro dos argumentos da main,qual o nome e idade do aluno e adicionar qual periodo da faculdade esta cursando
    // tarefa 2: criar uma variavel imutavel com o nome do professor favorito e imprimir na tela
    // tarefa 3: criar uma variavel imutavel com a idade do professor favorito e imprimir na tela
    // tarefa 4: Criar uma nova frase utilizando string tamplate com o nome e idade do professor favorito adicionando uma idade a mais nele.
    // tarefa 5: Printar uma mensagem em tela quando a idade do professor for maior que 30 anos "Está ficando coroa!" senão "Ainda é um jovem igual mariano!"
    // tarefa 6: Agora crie uma funcao que receba como parametro os dados de professor e imprima na tela a frase que foi criada na tarefa 4 e 5
    // tarefa 7: declare qual o tipo correto das variaveis abaixo
                val a = 1000
                val b = "log message"
                val c = 3.14
                val d = 100_000_000_000_000
                val e = false
                val f = '\n'
                var g  = IntArray(5) // desafio!

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}