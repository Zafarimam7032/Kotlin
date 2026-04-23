class KotlinConstructor constructor(id :Int) {

     constructor(id :Int,name : String) : this(id) {
        this.name=name;
    }

    constructor( id :Int, fname :String,lName :String) : this(id) {
        this.fname=fname
        this.lName=lName
    }


    private var id :Int? = id
    private var name :String?=null
    private var fname :String?=null
    private var lName :String?=null

    fun display(){
        println("Information : $id name : $name")
    }

    fun show(){
        println("full Name : $fname $lName")
    }


}