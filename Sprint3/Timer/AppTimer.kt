package Timer

import java.time.LocalDateTime
import java.util.Timer
import java.util.TimerTask

/*exemplo simples
fun main2() {
    // Thread
    println("Início da execução ${LocalDateTime.now()}")

    Timer().schedule(object : TimerTask(){
        override fun run() {
            println("Agora são ${LocalDateTime.now()}")
            exitProcess(0)
        }
    }, 2000)

    println("Fim da execução ${LocalDateTime.now()}")

}*/

fun main() {
    mostrarHora();
}

fun mostrarHora(){
    Timer().schedule(object : TimerTask(){
        override fun run() {
            println("Agora são ${LocalDateTime.now()}")
            mostrarHora()
        }
    }, 2000)
}
