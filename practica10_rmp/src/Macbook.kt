//Macbook.kt
class Macbook(name:String, chastota_cpu:Int, RAM: Double, private var SDD:Double):ComputerAbstract(name, chastota_cpu, RAM) {
    constructor(name: String, RAM: Double, SDD: Double): this(name, chastota_cpu = 8, RAM, SDD)

    override fun Q(): Double {
        return super.Q() + 0.5 * SDD
    }

    override fun get_info(): String {
        return super.get_info()
    }
}