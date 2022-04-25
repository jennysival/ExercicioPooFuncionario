package PrimeiroExercicioFuncionario

fun main() {
    val novoFuncionario: Funcionario = Funcionario()

    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Silva"
    novoFuncionario.horasTrabalhadas = 10.0
    novoFuncionario.valorPorHora = 25.50

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.0)
    novoFuncionario.calcularSalario()
    println("------------------------------------")

    val listaFuncionarios = ArrayList<Funcionario>()
    listaFuncionarios.add(novoFuncionario)

    val funcionario2: Funcionario = Funcionario()
    funcionario2.nome = "Jenny"
    funcionario2.sobrenome = "Sival"
    funcionario2.horasTrabalhadas = 30.0
    funcionario2.valorPorHora = 50.8
    listaFuncionarios.add(funcionario2)

    val funcionario3: Funcionario = Funcionario()
    funcionario3.nome = "Gabriel"
    funcionario3.sobrenome = "Sival"
    funcionario3.horasTrabalhadas = 48.0
    funcionario3.valorPorHora = 40.5
    listaFuncionarios.add(funcionario3)

    val funcionario4: Funcionario = Funcionario()
    funcionario4.nome = "Melancia"
    funcionario4.sobrenome = "Sival"
    funcionario4.horasTrabalhadas = 15.0
    funcionario4.valorPorHora = 20.7
    listaFuncionarios.add(funcionario4)

    val funcionario5: Funcionario = Funcionario()
    funcionario5.nome = "Pitaya"
    funcionario5.sobrenome = "Sival"
    funcionario5.horasTrabalhadas = 10.0
    funcionario5.valorPorHora = 14.9
    listaFuncionarios.add(funcionario5)

    val funcionario6: Funcionario = Funcionario()
    funcionario6.nome = "Maria"
    funcionario6.sobrenome = "Joaquina"
    funcionario6.horasTrabalhadas = 30.0
    funcionario6.valorPorHora = 64.7
    listaFuncionarios.add(funcionario6)

    val funcionario7: Funcionario = Funcionario()
    funcionario7.nome = "João"
    funcionario7.sobrenome = "Marcos"
    funcionario7.horasTrabalhadas = 25.0
    funcionario7.valorPorHora = 90.1
    listaFuncionarios.add(funcionario7)

    val funcionario8: Funcionario = Funcionario()
    funcionario8.nome = "Fulana"
    funcionario8.sobrenome = "Feliz"
    funcionario8.horasTrabalhadas = 15.0
    funcionario8.valorPorHora = 80.2
    listaFuncionarios.add(funcionario8)

    val funcionario9: Funcionario = Funcionario()
    funcionario9.nome = "Marcia"
    funcionario9.sobrenome = "Sensitiva"
    funcionario9.horasTrabalhadas = 30.0
    funcionario9.valorPorHora = 70.3
    listaFuncionarios.add(funcionario9)

    val funcionario10: Funcionario = Funcionario()
    funcionario10.nome = "Etevaldo"
    funcionario10.sobrenome = "Marciano"
    funcionario10.horasTrabalhadas = 20.0
    funcionario10.valorPorHora = 60.4
    listaFuncionarios.add(funcionario10)

    listaFuncionarios.forEach { funcionario ->
        funcionario.nomeCompleto()
        println("Horas Trabalhadas: ${funcionario.horasTrabalhadas}")
        println("Valor por hora: ${funcionario.valorPorHora}")
        funcionario.calcularSalario()
        println("------------------------------------")
    }
}