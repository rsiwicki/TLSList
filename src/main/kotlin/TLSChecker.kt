import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;

fun main(args: Array<String>) {
    println("Starting TLS Checker >>>")

    try {
        val ciphers = SSLContext.getDefault().socketFactory.supportedCipherSuites
        for (i in 1 until ciphers.size) {
            println(ciphers[i])
        }
    } catch (e: NoSuchAlgorithmException) {
        println(e.stackTrace)
    }

}