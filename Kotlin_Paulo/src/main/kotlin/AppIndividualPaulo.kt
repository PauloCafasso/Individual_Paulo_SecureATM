import Ram
import Repositorio
import java.util.*

fun main() {
    val repositorio = Repositorio()
    repositorio.iniciarConexao()

    Timer().schedule(object : TimerTask() {
        override fun run() {
            repositorio.inserir(chamarCaptura(repositorio))
        }
    }, 2000)
}

fun chamarCaptura(repositorio: Repositorio):Ram {

    val captura:Ram = repositorio.capturarRam()

    println("captura sendo realizada com sucesso")
    println(captura.valor)
    println(captura.data_registro)

    main()

    return captura
}