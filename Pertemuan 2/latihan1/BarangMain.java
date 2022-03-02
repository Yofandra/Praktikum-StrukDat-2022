public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.nama = "novel";
        b1.hargaSatuan = 20000;
        b1.jumlah = 6;

        System.out.println("Harga total = " + b1.hitungHargaTotal());
        System.out.println("Diskon = " + b1.hitungDiskon());
        System.out.println("Harga bayar = " + b1.hitungHargaBayar());
    }
}