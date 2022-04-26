package TerceiroExercicioFilme

fun main() {
    val filmeExemploTitanic = Filme("Titanic", 194)

    filmeExemploTitanic.exibirDuracaoEmHoras()
    println("---------------------------------------------------------------------")

    val filme1 = Filme("Vingadores", 142)
    filme1.exibirDuracaoEmHoras()
    println("---------------------------------------------------------------------")

    val filme2 = Filme("Hotel Transilvânia", 93)
    filme2.exibirDuracaoEmHoras()

    println("---------------------------------------------------------------------")
    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")
    println("---------------------------------------------------------------------")

    //Instancie outros 5 filmes e faça as mesmas ações descritas acima,
    //porém utilizando novos valores (você pode adicionar os filmes em
    //um vetor caso queira)

    val listaFilmes = ArrayList<Filme>()

    for(i in 1..5){
        println("Digite o nome do ${i}º filme: ")
        val titulo = readln()

        println("$titulo tem quantos minutos de duração? ")
        val minutos = readln().toInt()

        val filmeAdicionado = Filme(titulo, minutos)

        listaFilmes.add(filmeAdicionado)
        println("---------------------------------------------------------------------")
    }

    listaFilmes.forEach {
        it.exibirDuracaoEmHoras()
    }


}

