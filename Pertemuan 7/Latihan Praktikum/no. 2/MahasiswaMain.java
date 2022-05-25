import java.util.Scanner;

public class MahasiswaMain{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa ");
        for(int i=0; i<jumMhs; i++){
            System.out.println("---------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan Nama mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}