//ComputerInterface.kt
interface ComputerInterface {
    var name:String
    var chastota_cpu:Int
    var RAM:Double

    fun Q():Double{
        return 0.1 * chastota_cpu + RAM
    }
    fun get_info():String
}