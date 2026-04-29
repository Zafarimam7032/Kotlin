class Employee :Company() {

    override fun demo(){
        println("this is Employee Method")
    }



    companion object {
        @JvmStatic
        fun display(){
            println("this is static method of Employee")
        }
        @JvmStatic
        fun main(a: Array<String>) {
            val com :Company = Employee()
            println(com.show())
            com.demo()
            display()
            Company.display()
          var obj :DataClass =  DataClass(1,"Zafar")
            println(obj.getId())

        }
    }
}