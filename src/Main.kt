import SyntaxType.Companion.getSyntaxLabel
import java.io.File

// Feito por: Arthur Lima e Vinicius Hoffmann

//C:\Users\souza.arthur\Documents\my-projects\rotulador\src\fazer_leitura.php

fun main() {

    println("=================================")
    println("======== ROTULADOR PHP ==========")
    println("=================================")

    println("Digite o caminho do arquivo PHP que deseja fazer a leitura (Exemplo: C:\\Users\\souza.arthur\\Documents\\my-projects\\rotulador\\src\\arquivo.php): ")
    val filePath = readLine()

    try {
        var lineNumber = 0

        File(filePath).forEachLine { line ->
            lineNumber++
            println("Linha $lineNumber: ${getSyntaxLabel(line).description}")
        }

    } catch (ex: Exception) {
        println("Ops... o caminho do arquivo que você informou, não foi encontrado")
    }

}