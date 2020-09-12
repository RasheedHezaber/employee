class  infixFunctionNotation
{
    infix fun add(s: String) {
        // perform some action here
    }

    fun build() {
        this add "abc"   // Works fine, calls the infix function
        add("abc")       // Works fine, note this is not an infix call
        add ("abc")       // error: the receiver must be specified
    }
    infix fun square(number: Int): Int {
        return number * number
    }
        fun infix(){
    var a = 8
    var b = 4

    println(++a)      // call using infix notation
    println(a.inc())  // call using dot and parenthesis
    println(--b)      // call using infix notation
    println(b.dec())  // call using dot and parenthesis
}
}
