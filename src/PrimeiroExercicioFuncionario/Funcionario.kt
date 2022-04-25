package PrimeiroExercicioFuncionario

class Funcionario {

    var nome = ""
    var sobrenome = ""
    var horasTrabalhadas: Double = 0.0
    var valorPorHora: Double = 0.0

    fun nomeCompleto(){

        println("Nome Completo: $nome $sobrenome")
    }

    fun calcularSalario(){

        val calculo = horasTrabalhadas*valorPorHora

        println("Salário: R$$calculo")
    }

    fun incrementarHoras(incremento: Double){

        valorPorHora = incremento
    }
}