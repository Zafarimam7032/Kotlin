import java.security.KeyStore.TrustedCertificateEntry

fun conditionalStatement() {

    println("Conditional statement")

    var check: Boolean = true

    if (check) {
        println("true statement")
    }
    if (!check) {
        println("this is true statement")
    } else {
        println("this is false statement")
    }

}

fun switchCase() {

 var num : Int =1
    when(num){

     1-> println("first step");
     2-> println("second step")
     else -> println("not found")
    }

}