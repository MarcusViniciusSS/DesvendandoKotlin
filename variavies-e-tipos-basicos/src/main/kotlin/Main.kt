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

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    print("###############################Aqui inicia sua vez de codar!!#############################################")

    // tarefa 1: subistituir dentro dos argumentos da main,qual o nome e idade do aluno e adicionar qual periodo da faculdade esta cursando
    // tarefa 2: criar uma variavel imutavel com o nome do professor favorito e imprimir na tela
    // tarefa 3: criar uma variavel imutavel com a idade do professor favorito e imprimir na tela
    // tarefa 4: Criar uma nova frase utilizando string tamplate com o nome e idade do professor favorito adicionando uma idade a mais nele.
}