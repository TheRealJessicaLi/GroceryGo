package go.grocery.grocerygo.SelectGroceries

class SummaryListItem {
    private lateinit var str1: String
    private lateinit var str2: String

    fun CustomObject(str1: String, str2: String){
        this.str1 = str1
        this.str2 = str2
    }

    fun getstr1(): String {
        return str1
    }

    fun getstr2(): String {
        return str2
    }
}