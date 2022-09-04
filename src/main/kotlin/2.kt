fun main(){
    println("Вкажіть довжину")
    var h = readln()
    var a: Int = h.toInt()
    println("Вкажіть ширину")
    var j = readln()
    var b: Int = j.toInt()
    S(a,b)
}

fun S(a: Int, b: Int){
    println(a * b)
}
