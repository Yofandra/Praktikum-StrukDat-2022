public class Tiket {

    String maskapai, asal, tujuan;
    int harga;

    Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampilAll(){
        System.out.println("Maskapai = " +maskapai);
        System.out.println("Harga Tiket = " +harga);
        System.out.println("Asal Penerbangan = " +asal);
        System.out.println("Tujuan Penerbangan = " +tujuan);
    }
}
