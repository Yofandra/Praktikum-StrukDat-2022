import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[6];
        MataKuliah[] mk = new MataKuliah[5];
        DaftarNilai dn = new DaftarNilai();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        mhs[0] = new Mahasiswa("20001", "Thomas", "021xxx");
        mhs[1] = new Mahasiswa("20002", "Arthur", "021xxx");
        mhs[2] = new Mahasiswa("20003", "John", "021xxx");
        mhs[3] = new Mahasiswa("20004", "Momo", "021xxx");
        mhs[4] = new Mahasiswa("20005", "Sana", "021xxx");
        mhs[5] = new Mahasiswa("20006", "Mina", "021xxx");

        mk[0] = new MataKuliah("0001", "Internet of Things", "\t\t3");
        mk[1] = new MataKuliah("0002", "Algoritma dan Struktur Data", "\t2");
        mk[2] = new MataKuliah("0003", "Algoritma dan Pemrograman", "\t2");
        mk[3] = new MataKuliah("0004", "Praktikum Algoritma dan Struktur Data", "3");
        mk[4] = new MataKuliah("0005", "Praktikum Algoritma dan Pemrograman", "3");

        int i=0;
        while(i<1){
            System.out.println("***********************************************");
            System.out.println("SISTEM PEMGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.println("Masukkan Data :");
                System.out.print("Kode : ");
                String kd = input.nextLine();
                System.out.print("Nilai : ");
                double nilai = input.nextDouble();
                input.nextLine();

                System.out.println("DAFTAR MAHASISWA");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tTelf");
                for (int j=0; j<mhs.length; j++) {
                    mhs[j].print();
                }
                System.out.print("Pilih Mahasiswa By NIM : ");
                String nim = input.nextLine();
                Mahasiswa x = null;
                for(int j=0; j<mhs.length; j++){
                    if(nim.equals(mhs[j].nim)){
                        x = mhs[j];
                    }
                }

                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("Kode\t\tMata Kuliah\t\t\t\t\tSKS");
                for (int j=0; j<mk.length; j++) {
                    mk[j].print();
                }
                System.out.print("Pilih Mata Kuliah By Kode : ");
                String kode = input.nextLine();
                MataKuliah y = null;
                for(int j=0; j<mk.length; j++){
                    if(kode.equals(mk[j].kode)){
                        y = mk[j];
                    }
                }

                
                Nilai nilaiobj = new Nilai(x.nim, x.nama, y.matkul, y.sks, nilai);
                dn.add(nilaiobj);

            } else if (pilih==2) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                dn.tampil();

            } else if (pilih==3) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                dn.tampil();

                System.out.print("Masukkan Data Mahasiswa[NIM] : ");
                String nim = input.nextLine();
                dn.get(nim);

            } else if (pilih==4) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                dn.sort();

            } else {
                i++;
            }
        }
    }
}
