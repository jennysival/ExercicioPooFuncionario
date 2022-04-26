package SegundoExercicioLivros
//- Instancie outros 10 livros no método main e chame os métodos
//desenvolvidos, conforme o exemplo anterior.
class TestarLivros {
    fun main(){
        val livroFavorito: Livros = Livros("O Pequeno Príncipe", 98, 0)

        println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas.")

        livroFavorito.paginasLidas = 20
        livroFavorito.verificarProgresso()

        livroFavorito.paginasLidas = 50
        livroFavorito.verificarProgresso()

        println("------------------------")

        val listaLivros = ArrayList<Livros>()

        val livro01 = Livros("A Pequena Sereia", 100, 15)
        val livro02 = Livros("Alice no País das Maravilhas", 300, 250)
        val livro03 = Livros("Os Miseráveis", 980, 320)
        val livro04 = Livros("Senhor dos Anéis", 670, 410)
        val livro05 = Livros("Contos de Fadas", 230, 57)
        val livro06 = Livros("Melancia", 70, 23)
        val livro07 = Livros("A Casa Torta", 160, 49)
        val livro08 = Livros("Ecos", 268, 177)
        val livro09 = Livros("Quando as Sereias Choram", 344, 89)
        val livro10 = Livros("Crepúsculo", 210, 115)

        listaLivros.add(livro01)
        listaLivros.add(livro02)
        listaLivros.add(livro03)
        listaLivros.add(livro04)
        listaLivros.add(livro05)
        listaLivros.add(livro06)
        listaLivros.add(livro07)
        listaLivros.add(livro08)
        listaLivros.add(livro09)
        listaLivros.add(livro10)

        listaLivros.forEach {
            println("O livro ${it.titulo} possui ${it.qtdPaginas} páginas.")
            it.verificarProgresso()
            println("------------------------")
        }


    }
}