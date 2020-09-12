class  standardLibraryFuntion{
    data class employee(var empName: String, var empAge: Int, var job: String)

    fun LetFun() {
        employee("mohammed", 22, " manegar").let {
            println(it)
            it.job = "programmer"
            it.empAge = 22
            println(it)
        }
    }
    fun ApplyFun() {
        employee("ahmed", 20, "programmer").apply {
            println(this)
            this.job = "mdb"
            this.empAge = 23
            println(this)
        }
    }
    fun RunFun() {
        employee("alaa", 20, "Accountant").run {
            println(this)
            this.job = "mdb"
            this.empAge = 23
            println(this)
        }
    }
    fun withFun() {


        val a = employee("aymen", 24, "programer")
        with(a) {
            println("with function is called ${this.toString()}")
            a.job = "manegar"
            a.empName = "waheb"
            println("with function is called ${this.toString()}")
        }
    }
    fun AlsoFun() {


        employee("azoz", 25, "Translator").also {
            println("also function is called befor : ${it.toString()}")
            it.job = "manegar"
            it.empAge = 223
            println("also  function is called after: ${it.toString()}")
        }

    }
    fun TakeIfFun() {


        employee("rasheed", 22, "programmer").takeIf {
            it.empAge == 23

        }

    }
}