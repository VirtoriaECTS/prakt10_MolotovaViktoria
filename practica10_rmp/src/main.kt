//main.kt
fun main(){
    val computer1 = Macbook("Макбук", 15000, 12000.5, 1.512)
    println(computer1.get_info())

    val computer2 = Lenovo("Леново", 3000, 10000.0, 0.512)
    println(computer2.get_info())
}