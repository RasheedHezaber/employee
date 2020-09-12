class member{

    fun Lambda() {

        val company = { println("GeeksforGeeks")}

        // invoking function method1
        company()

        // invoking function method2
        company.invoke()
    }

    inline fun higherfunc( str : String, mycall :(String)-> Unit){
        //inovkes the print() by passing the string str
        mycall(str)
    }

    fun LocalFun() {
        var funType = ""
        funType = "this is a local function"
        fun printtype() {
            println(funType)

        }
        printtype()
    }
}

