
data class DataClass(
   private var id: Int = 0,
   private var name: String? = null


){
    fun getId() :Int{
        return  id;
    }
    fun getName() : String? {
        return  name;
    }
}
