package TerceiroExercicioFilme

class Filme(
    titulo: String,
    duracao: Int
) {
    var titulo = titulo
    var duracaoEmMinutos = duracao

    fun exibirDuracaoEmHoras(){
        val horas = duracaoEmMinutos/60
        val minutos = duracaoEmMinutos%60

        println("O filme $titulo possui $horas horas e $minutos minutos de duração")
    }
}