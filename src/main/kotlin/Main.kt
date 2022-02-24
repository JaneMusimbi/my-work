fun main() {
    add(7,6,8,9,2)
    var y=(7+6+8+9+2)
    println(y)
    var x=("Hey" +"jane")
    println(x)
    var division=(15%6)
    println(division)
    var fact=("I love reading")
    println(fact)
}

fun add(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int):Int{
    var y=(num1+num2+num3+num4+num5)
    return(y)
}
fun greeting(name:String):String{
    var x=("Hey"+name)
    return(x)

}fun modulus(num1:Int,num2:Int):Int{
    var division=(num1%num2)
    return(division)
}

fun fact(name:String):String{
    var playing=("fun fact about me ")
    return(playing)

}
