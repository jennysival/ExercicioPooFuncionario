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
    funcionario2.valorPorHora = 50.8
    funcionario2.incrementarHoras(30.0)
    listaFuncionarios.add(funcionario2)

    val funcionario3: Funcionario = Funcionario()
    funcionario3.nome = "Gabriel"
    funcionario3.sobrenome = "Sival"
    funcionario3.valorPorHora = 40.5
    funcionario3.incrementarHoras(48.0)
    listaFuncionarios.add(funcionario3)

    val funcionario4: Funcionario = Funcionario()
    funcionario4.nome = "Melancia"
    funcionario4.sobrenome = "Sival"
    funcionario4.valorPorHora = 20.7
    funcionario4.incrementarHoras(15.0)
    listaFuncionarios.add(funcionario4)

    val funcionario5: Funcionario = Funcionario()
    funcionario5.nome = "Pitaya"
    funcionario5.sobrenome = "Sival"
    funcionario5.valorPorHora = 14.9
    funcionario5.incrementarHoras(10.0)
    listaFuncionarios.add(funcionario5)

    val funcionario6: Funcionario = Funcionario()
    funcionario6.nome = "Maria"
    funcionario6.sobrenome = "Joaquina"
    funcionario6.valorPorHora = 64.7
    funcionario6.incrementarHoras(30.0)
    listaFuncionarios.add(funcionario6)

    val funcionario7: Funcionario = Funcionario()
    funcionario7.nome = "João"
    funcionario7.sobrenome = "Marcos"
    funcionario7.valorPorHora = 90.1
    funcionario7.incrementarHoras(25.0)
    listaFuncionarios.add(funcionario7)

    val funcionario8: Funcionario = Funcionario()
    funcionario8.nome = "Fulana"
    funcionario8.sobrenome = "Feliz"
    funcionario8.valorPorHora = 80.2
    funcionario8.incrementarHoras(15.0)
    listaFuncionarios.add(funcionario8)

    val funcionario9: Funcionario = Funcionario()
    funcionario9.nome = "Marcia"
    funcionario9.sobrenome = "Sensitiva"
    funcionario9.valorPorHora = 70.3
    funcionario9.incrementarHoras(30.0)
    listaFuncionarios.add(funcionario9)

    val funcionario10: Funcionario = Funcionario()
    funcionario10.nome = "Etevaldo"
    funcionario10.sobrenome = "Marciano"
    funcionario10.valorPorHora = 60.4
    funcionario10.incrementarHoras(20.0)
    listaFuncionarios.add(funcionario10)

    listaFuncionarios.forEach { funcionario ->
        funcionario.nomeCompleto()
        println("Horas Trabalhadas: ${funcionario.horasTrabalhadas}")
        println("Valor por hora: ${funcionario.valorPorHora}")
        funcionario.calcularSalario()
        println("------------------------------------")
    }
}