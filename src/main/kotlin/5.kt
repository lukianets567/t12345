fun main(){
    println("Вкажіть сумму в ГРН")
    var g = readln()
    var a: Int = g.toInt()
    println("USD" + " " + "or" + " " + "EUR")
    var b = readln()

    convert(a,b)
}
fun convert(a: Int, b: String){
    var Cusd = (40)
    var Ceur = (42)
    when(b){
        "USD" -> println(a * Cusd)
        "EUR" -> println(a * Ceur)
        else -> println("ERROR")
    }


}
