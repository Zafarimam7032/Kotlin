class KotlinConstructor constructor(id :Int) {

     constructor(id :Int,name : String) : this(id) {
        this.name=name;
    }

    constructor( id :Int, fname :String,lName :String) : this(id) {
        this.fname=fname
        this.lName=lName
    }


     var id :Int? = id
     var name :String?=null
    var fname :String?=null
     var lName :String?=null

    fun display(){
        println("Information : $id name : $name")
    }

    fun show(){
        println("full Name : $fname $lName")
    }


}