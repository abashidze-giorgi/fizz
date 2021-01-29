import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)
    try {
        val i = callScanner(scanner)
    } catch (ex: ScannerException) {
        println("I warned you")
    }
    catch (ex: NullPointerException) {
            println("I said pass scanner not null")
    }
    finally {
        scanner.close()
    }
}

fun callScanner(scanner: Scanner?) {
    println("This Scanner Hates Letter Z and won't react nicely if you pass it as input")
    if (scanner == null)
        throw NullPointerException()
    if (scanner.next() == "Z") {
        throw ScannerException()
    }
}

class ScannerException: Exception()

class NullPointerException: Exception()