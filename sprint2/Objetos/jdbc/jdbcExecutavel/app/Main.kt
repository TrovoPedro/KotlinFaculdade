package app

import dominio.Carro
import repositorio.CarroRepositorio

open class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {


            val repositorio = CarroRepositorio()
            repositorio.configurar() //iniciando a configuração de conexão com o banco
            repositorio.criarTabela() // criando uma tebela

            while (true) {
                println(
                    """
            1- Inserir
            2- Listar carros
            3- Buscar por id
            4- Vender por id
            5- Sair
        """.trimIndent()
                )
                println("Digite uma opção: ")
                var opcao = readln().toInt()

                when (opcao) {
                    1 -> {
                        val nomeCarro = Carro()
                        println("Insira o nome do carro: ")
                        nomeCarro.setNome(readln())

                        repositorio.inserir(nomeCarro)
                    }

                    2 -> {
                        println(repositorio.listar())
                    }

                    3 -> {
                        println("Informe o id para buscar o carro: ")
                        var idEncontrado = readln().toInt()

                        if (repositorio.existePorId(idEncontrado)) {
                            val carroEncontrado = repositorio.buscarPorId(idEncontrado)

                            println(
                                """
                    Nome: ${carroEncontrado.nome}
                    Vendido: ${if (carroEncontrado.vendido) "Sim" else "Não"}
                """.trimIndent()
                            )
                        } else {
                            println("O id não existe")
                        }
                    }

                    4 -> {
//                opcao 1 println("Informe o id do carro a ser vendido: ")
//                val idVendido = readln().toInt()
//
//                if(repositorio.existePorId(idVendido)){
//                    val vendido = repositorio.venderPorId(idVendido)
//
//                    if (vendido){
//                        println("Carro vendido com suceso")
//                    }else{
//                        println("Deu ruim")
//                    }
//                }else{
//                    println("Id não existente")
//                }

                        // opção 2, verificando direto usando o metodo de update

                        println("Informe o id do carro a ser vendido: ")
                        val idVendido = readln().toInt()

                        val vendido = repositorio.venderPorId(idVendido)
                        if (vendido) {
                            println("Vendido com sucesso")
                        } else {
                            println("Deu ruim")
                        }
                    }

                    5 -> break
                    else -> println("Opção inváldia")

                }
            }
        }
    }
}