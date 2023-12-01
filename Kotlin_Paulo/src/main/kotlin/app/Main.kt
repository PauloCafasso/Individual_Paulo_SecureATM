package app

import java.util.*
import Repositorio
import java.util.*
import Ram
import chamarCaptura
import main

open class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {



                val repositorio = Repositorio()
                repositorio.iniciarConexao()

                Timer().schedule(object : TimerTask() {
                    override fun run() {
                        repositorio.inserir(chamarCaptura(repositorio))
                    }
                }, 2000)

            print("Qual ATM deve ser monitorado?")
            val fk_atm = Scanner.nextLine()

            fun chamarCaptura(repositorio: Repositorio):Ram {

                val captura:Ram = repositorio.capturarRam()

                println("captura sendo realizada com sucesso")
                println(captura.valor)
                println(captura.data_registro)

                Main()

                return captura
            }

        }
    }
}