package com.example.banco

class CaixaEletronico {
    var saldo = 0.0

    fun iniciar() {
        while (true) {
            println("======================================")
            println("Qual opção deseja executar?")
            println("1 -> Sacar")
            println("2 -> Depositar")
            println("3 -> Visualizar Extrato")
            println("0 -> Sair")
            println("======================================")

            when (readLine()) {
                "1" -> sacar()
                "2" -> depositar()
                "3" -> visExtrato()
                "0" -> {
                    println("Até logo!")
                    break
                }
                else -> println("Opção inexistente, tente novamente.")
            }
        }
    }

    fun sacar() {
        print("Quanto deseja sacar? ")
        val valor = readLine()?.toDoubleOrNull() //converter p double ou null se entrar valor invalido
        if (valor == null || valor <= 0) {
            println("Valor inválido, tente novamente.")
            return
        }
        if (valor > saldo) {
            println("Saldo insuficiente!")
        } else {
            saldo -= valor
            println("Saque realizado com sucesso!")
        }
    }

    fun depositar() {
        print("Quanto deseja depositar? ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor == null || valor <= 0) {
            println("Valor inválido!")
            return
        }
        saldo += valor
        println("Depósito realizado com sucesso!")
    }

    fun visExtrato() {
        println("Seu saldo atual é: R$ $saldo")
    }
}

fun main() {
    val caixa = CaixaEletronico()
    caixa.iniciar()
}

