class Mobil {
    var warna: String = ""
    var tahunProduksi: Int = 0
}
fun main() {
    val m1 = Mobil()
    m1.warna = "Hitam"
    m1.tahunProduksi = 2006

    println("Warna = " + m1.warna)
    println("Tahun Produksi = " + m1.tahunProduksi)
}