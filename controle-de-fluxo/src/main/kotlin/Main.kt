fun main() {

    val valor: Int = 11;
    val check: Boolean = valor % 2 == 0;

    // tradicional
    if (check) {
        println("O " + valor + " é par")
    } else {
        println("O " + valor + " é impar")
    }

    //  nao temos if ternario em kotlin
    println(if (check) "O " + valor + " é par" else "O " + valor + " é impar")

    // Usando  when (Similar o switch do java)
    when (check) {
        true -> println("O $valor é par")
        else -> println("O $valor é impar")
    }

    // Usando o when com retorno
    var resultado = when {
        check -> "O $valor é par"
        else -> "O $valor é impar"
    }

    println(resultado)
}