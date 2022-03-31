public class MainTiket {
    public static void main(String[] args){

        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Lion Air", 1200000, "Jakarta", "Surabaya");
        Tiket t2 = new Tiket("Garuda", 3000000, "Surabaya", "Bali");
        Tiket t3 = new Tiket("Citilink", 1500000, "Bandung", "Banjarmasin");
        Tiket t4 = new Tiket("Garuda", 5000000, "Jakarta", "Surabaya");
        Tiket t5 = new Tiket("Citilink", 2000000, "Yogyakarta", "Surabaya");

        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);

        System.out.println("Daftar tiket sebelum proses sorting");
        list.tampilAll();

        System.out.println("\nDaftar Tiket setelah proses sorting menggunakan algoritma Bubblesort");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("\nDaftar Tiket setelah proses sorting menggunakan algoritma Selectionsort");
        list.selectionSort();
        list.tampilAll();
    }
}
