//ComputerAbstract.kt
abstract class ComputerAbstract(var name: String, var chastota_cpu:Int, var RAM:Double) {
    constructor(name: String, chastota_cpu: Int):this (name, chastota_cpu, RAM = 0.0)

    open fun Q():Double{
        return 0.1 * chastota_cpu + RAM
    }

    open fun get_info():String{
        return  "Название процесора - $name\n" +
                "Тактовая частота процессора - $chastota_cpu МГц\n" +
                "Объем оперативной памяти $RAM Мб\n" +
                "Качество ${Q()} Гб\n"
    }
}