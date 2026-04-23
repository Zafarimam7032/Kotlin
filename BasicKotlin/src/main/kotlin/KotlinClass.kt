 class KotlinClass {

    fun display():String {
        this.show()
        return  "this is class method with return type string"

    }

    private fun show(){
        println("this is show private  method")
    }

    fun show(name : String){
        println("this is protected method")
    }

}