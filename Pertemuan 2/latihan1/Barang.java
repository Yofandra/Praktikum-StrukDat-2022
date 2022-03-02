public class Barang {
    String nama;
    int hargaSatuan;
    int jumlah;

    int hitungHargaTotal() {
        int hargaTotal;
        hargaTotal = hargaSatuan * jumlah;
        return hargaTotal;
    }

    int hitungDiskon() {
        int diskon;
        if (hitungHargaTotal()>100000){
            diskon = hitungHargaTotal() * 10/100;
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000){
            diskon = hitungHargaTotal() * 5/100;
        }else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar() {
        int hargaBayar=0;
        hargaBayar= hitungHargaTotal() - hitungDiskon();
        return hargaBayar;
    }
}