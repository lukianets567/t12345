fun main(){
    println("Вкажіть свій вік")
    var h = readln()
    var a: Int = h.toInt()
    fff(a)
}

fun fff(a: Int){
    when(a){
        in 1..17 -> println("-")
        in 18..100 -> println("+")
        else -> println("Некоректне значення")
    }

}