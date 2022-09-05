fun main(){
    println("Вкажіть свій вік")
    var h = readln()
    var a: Int = h.toInt()
    fff(a)
}

fun fff(a: Int){
    when(a){
        in 1..25 -> println("-")
        in 26..300 -> println("+")
        else -> println("Некоректне значення")
    }

}