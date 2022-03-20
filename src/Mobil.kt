class Mobil {
    var warna: String = ""
    var tahunProduksi: Int = 0
}
class Mobil2 {
    var mesin = false
    var gigi = 1
    
    fun hidupkanMobil() {
        val mesinMobil = Mobil2()
        
        mesinMobil.mesin = true
    }
    fun matikanMobil() {
        val mesinMobil = Mobil2()
        
        mesinMobil.mesin = false
    }
    fun ubahGigi() {
        val gearGigi = Mobil2() 
        
        gearGigi.gigi += 1
    }
}
fun main() {
    val m1 = Mobil()
    val m2 = Mobil2()

    m1.warna = "Hitam"
    m1.tahunProduksi = 2006

    println("Warna = " + m1.warna)
    println("Tahun Produksi = " + m1.tahunProduksi)
    println(" ")

    if (m2.mesin == false) {
        m2.hidupkanMobil()
        println("Mobil telah dinyalakan")
        m2.ubahGigi()
        println("Gigi telah diubah menjadi " + m2.gigi)
    } else {
        m2.matikanMobil()
        println("Mobil telah dimatikan")
    }
}