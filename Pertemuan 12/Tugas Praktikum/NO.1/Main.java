import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DoubleService ds = new DoubleService();
        ds.addLast(146, "Rosi");
        ds.addLast(135, "Johan");
        ds.addLast(124, "Mely");
        int ulang = 0;

        do {
            System.out.println("=================================");
            System.out.println(" PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("=================================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("---------------------------------");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data PenerimaVaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomer Antrian : ");
                    int antri = sc.nextInt();
                    System.out.println("Nama Penerima : ");
                    String nama = sc1.nextLine();
                    System.out.println("|" + antri + "|" + nama + "\t|");
                    ds.addFirst(antri, nama);
                    break;

                case 2:
                    ds.removeFirst();
                    ds.print();
                    break;

                case 3:
                    System.out.println("|No.\t|Nama\t|");
                    ds.print();
                    break;
            }

                if (pilih == 4) {
                    System.out.println("Anda telah keluar!");
                    break;
                }
            } while (ulang != 0 || ulang < 3);
            sc.close();
            sc1.close();
    }
}
