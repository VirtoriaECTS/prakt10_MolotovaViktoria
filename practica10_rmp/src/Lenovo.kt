//Lenovo.kt
class Lenovo (override var name:String, override var chastota_cpu:Int, override var RAM : Double, private var SDD: Double):ComputerInterface{
    override fun Q(): Double {
        return super.Q() + 0.5 * SDD
    }

    override fun get_info(): String {
        return  "Название процесора - $name\n" +
                "Тактовая частота процессора - $chastota_cpu МГц\n" +
                "Объем оперативной памяти $RAM Мб\n" +
                "Качество ${Q()} Гб\n"
    }
}