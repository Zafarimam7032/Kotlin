

fun loopInKotlin(){

    var num = 1..10

    for( i in num){
        println(i)
    }

    for ( j in num step 2){
        println(j)
    }

    var numrever = 1 until 10

    for ( i in numrever){
        println(i)
    }

    var revNum = 10 downTo 1

    for ( i in revNum){
        println(i)
    }

    println("while loop")
    var i=1;
    while (i<10){
        println(i)
        i++;
    }

    println("do while loop")
    var j=1;
    do {
       println(j)
        j++;
    }while(j<10)

}