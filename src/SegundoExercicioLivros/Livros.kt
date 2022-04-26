package SegundoExercicioLivros

class Livros (titulo: String, qtdPaginas: Int, paginasLidas: Int){
    var titulo = titulo
    var qtdPaginas = qtdPaginas
    var paginasLidas = paginasLidas

    fun verificarProgresso(){
        val porcentagem = (paginasLidas*100)/qtdPaginas

        println("Você já leu $porcentagem% do livro $titulo")
    }
}