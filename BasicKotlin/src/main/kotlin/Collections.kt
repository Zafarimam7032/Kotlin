@file: JvmName("Collection")

import java.util.LinkedList
import java.util.TreeMap
import java.util.TreeSet
import java.util.Vector
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.CopyOnWriteArraySet

fun collectionList(){

    var list = listOf<Int>(12,30,40)

    println(list)

    for( i in list){
        println(i)
    }

    for( (i,j) in list.withIndex()){
        println("$i : $j")
    }

    var intr = list.iterator();

    while (intr.hasNext()){
        println(intr.next())
    }
    println(list.hashCode())

    var listM = list.toMutableList()

    println(listM.hashCode())
    listM.add(50)
    println(listM.hashCode())
    println(listM)
    listM.add(60)
    println(listM.hashCode())
    println("vector ")
    var vect = Vector<Int>()
    vect.add(30)
    println(vect)

    println("LinkedList ")

    var linkedList = LinkedList<Int>()
    linkedList.add(70)
    println(linkedList)

    var concurrentList =CopyOnWriteArrayList<Int>()
    concurrentList.add(50)

    for( i in concurrentList){
        println(i)
        concurrentList.add(30)
    }

    println(concurrentList.size)
    println(concurrentList)

}

fun collectionSet(){
    var set = setOf<Int>(12,80,12)

    println(set)

    println("HashSet ")

    var hashSet = hashSetOf<Int>()
    hashSet.add(10)
    hashSet.add(10)

    println(hashSet)
    println(hashSet.size)

    println("LinkedHash Set")

    var linkedHashSet =LinkedHashSet<Int>()
    linkedHashSet.add(10)
    linkedHashSet.add(10)
    println(linkedHashSet)
    println(linkedHashSet.size)

    println("TreeSet")

    var treeset = TreeSet<String>()
    treeset.add("Kotlin")
    treeset.add("Kotlin")
    println(treeset)
    println(treeset.size)

    var conSet = CopyOnWriteArraySet<Int>()
    conSet.add(10)

    for( i in conSet){
        println(i)
        conSet.add(20)
    }
    println(conSet.size)
    println(conSet)
}

fun collectionMap(){
    var map = mapOf<Int,String>(1 to "Kotlin",2 to "GO",3 to "Java",4 to "java script")
    println(map)

    for((key,value ) in map){
        println("$key : $value")
    }
    var hashMap = HashMap<Int,String>();

    hashMap.put(1,"java")
    hashMap.put(20,"java")
    hashMap.put(5,"java")

    println(hashMap)

    var linkedHashMap = LinkedHashMap<Int,String>();

    linkedHashMap.put(2,"java")
    linkedHashMap.put(1,"java")

    println(linkedHashMap)

    var treeMap = TreeMap<Int,String>();

    treeMap.put(1,"java")
    treeMap.put(5,"java")

    println(treeMap)
}