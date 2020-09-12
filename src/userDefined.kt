class userDefinedFun {

    fun userDefine() {
        var user = "rasheed"
        println(user)

    }
    fun userDefine2(): Int {

    var    x = 5
        var y=x+5
        return y
    }
    fun anonymousFun() {

        val r: () -> String = {

            var ano = "anonymous function"
            ano
        }

        println("this is an  explicit anonymous function")

    }
}