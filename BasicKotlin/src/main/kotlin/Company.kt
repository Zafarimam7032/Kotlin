open class Company {

    open fun demo(){
        println("this is company Function");
    }

    fun show() :String{
        return "this is show method of company class"
    }



    companion object{
        @JvmStatic
        fun display(){
            println("this is static method of Company")
        }
    }
}