fun main()
{
    var standard=standardLibraryFuntion()
    standard.LetFun()
    println("************************")
    standard.ApplyFun()
    println("************************")
    standard.AlsoFun()
    println("************************")
    standard.RunFun()
    println("************************")
    standard.TakeIfFun()
    println("************************")
    standard.withFun()
    println("************************")

    var infix=infixFunctionNotation()

    infix.square(9)
    infix.add("rasheed")
    infix.infix()
    println("************************")
    var a=member()
    a.Lambda()
    a.higherfunc("A Computer Science portal for Geeks",::print)
    a.LocalFun()
   /*
    memberFun
    userDefinedFUN
    lnfixFunctionNotation*/
}