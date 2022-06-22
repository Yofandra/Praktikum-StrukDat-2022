# Laporan Praktikum Jobsheet 16 Collection
### Nama  : Yofandra Arta Priyoga
### NIM   : 2141720121
### Kelas : TI-1G
### Absen : 29

## Jawaban Pertanyaan
<p> <br>

### Output percobaan 16.2.1
<img src="Output16/p1.png">

### Jawaban Subbab 16.2.3
1. Karena saat deklarasi ArrayList tidak dituliskan tipe data yang spesifik
2. 
```java
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
```
5. fungsi "push" untuk menambah elemen di posisi depan

### Output percobaan 16.3.1
<img src="Output16/p2.png">

### Jawaban Subbab 16.3.2
1. fungsi add menambahkan elemen di bagian paling belakang, sedangkan fungsi push menambahkan elemen di posisi terdepan.
2. Stack tidak akan terisi elemen baru, karena semua elemen stack baru saja dihapus dengan fungsi pop.
3. Baris kode tersebut akan melakukan print elemen stack dengan menggunakan format dan memanfaatkan syntax foreach untuk melakukan perulangan.
4. maka terjadi error, karena yang dapat dijadikan object adalah percabangan dari List, bukan List itu sendiri.

### Output percobaan 16.4.1
<img src="Output16/p3.png">

### Jawaban Subbab 16.4.2
1. menggunakan konseppenggunaan parameter array yang panjangnya akan mengikuti banyaknya nilai parameter yang dimasukkan,            kelebihannya adalah fleksibilitas penambahan elemen jika tidak diketahui dengan pasti berapa banyak elemen yang harus ditambahkan.

### Tugas Praktikum
1. 
Class Film
```java
public class Film {
    String idFilm, judulFilm, thTayang, director;

    public Film(){
    }

    public Film(String idFilm, String judulFilm, String thTayang, String director){
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.thTayang = thTayang;
        this.director = director;
    }

    @Override
    public String toString(){
        return "Film{" + "ID Film=" + idFilm + ", Judul Film=" + judulFilm + ", Tahun Tayang=" + thTayang + ", Director=" + director +'}';
    }
}
```
Class ListFilm
```java
import java.util.List;
import java.util.Stack;
import java.util.Iterator;

public class ListFilm {
    List<Film> Films = new Stack<>();

    public void tambah(Film film){
        Films.add(film);
    }

    public void pop(){
        for(Iterator<Film> it = Films.iterator(); it.hasNext();){
            Film film = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+film.idFilm+", Judul Film="+film.judulFilm+", Tahun Tayang="+film.thTayang+", Director="+film.director+"}");
            }
        }
        Films.remove(Films.size()-1);
    }

    public void peek(){
        for(Iterator<Film> it = Films.iterator(); it.hasNext();){
            Film film = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+film.idFilm+", Judul Film="+film.judulFilm+", Tahun Tayang="+film.thTayang+", Director="+film.director+"}");
            }
        }
    }

    public void tampil(){
        Films.stream().forEach(film ->{
            System.out.println("" + film.toString());
        });
    }

}
```
Class Main
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListFilm lf = new ListFilm();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int i=0;
        while(i<1){
            System.out.println("================================");
            System.out.println("Daftar Film Layar Sepanjang Masa");
            System.out.println("================================");
            System.out.println("1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info Semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.print("ID Film : ");
                String idFilm = input.nextLine();
                System.out.print("Judul Film : ");
                String judulFilm = input.nextLine();
                System.out.print("Tahun Tayang : ");
                String thTayang = input.nextLine();
                System.out.print("Director : ");
                String director = input.nextLine();
                Film film = new Film(idFilm, judulFilm, thTayang, director);
                lf.tambah(film);
            } else if (pilih==2) {
                lf.pop();
            } else if (pilih==3) {
                lf.peek();
            } else if (pilih==4) {
                lf.tampil();
            } else {
                i++;
            }
        }
    }
}
```
Output
<img src="Output16/lp1a.png">
<img src="Output16/lp1b.png">
<img src="Output16/lp1c.png">
<img src="Output16/lp1d.png">

2.
Class Mahasiswa
```java
public class Mahasiswa {
    String nim, nama, telf;

    public Mahasiswa(String nim, String nama, String telf){
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }

    @Override
    public String toString(){
        return nim+"\t\t"+nama+"\t\t"+telf;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+telf);
    }
}
```
Class MataKuliah
```java
public class MataKuliah {
    String kode, matkul, sks;

    public MataKuliah(String kode, String matkul, String sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }

    @Override
    public String toString(){
        return kode+"\t\t"+matkul+"\t\t"+sks;
    }

    public void print(){
        System.out.println(kode+"\t\t"+matkul+"\t\t"+sks);
    }


}
```
Class Nilai
```java
public class Nilai {
    String nim, nama, matkul, sks;
    Double nilai;

    public Nilai(String nim, String nama, String matkul, String sks, Double nilai){
        this.nim = nim;
        this.nama = nama;
        this.matkul = matkul;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public String toString(){
        return nim+"\t\t"+nama+"\t\t"+matkul+"\t"+sks+"\t"+nilai;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+matkul+"\t"+sks+"\t"+nilai);
    }

}
```
Class DaftarNilai
```java
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class DaftarNilai {
    List<Mahasiswa> mahasiswam = new ArrayList<>();
    List<MataKuliah> matkulm = new ArrayList<>();
    List<Nilai> nilain = new ArrayList<>();

    public void add(Nilai nilai){
        nilain.add(nilai);
    }

    public void tampil(){
        nilain.stream().forEach(nilai -> {
            System.out.println("" + nilai.toString());
        });
    }

    public void get(String nim){
        for(Iterator<Nilai> it = nilain.iterator(); it.hasNext();){
            Nilai nilai = it.next();
            if (nim.equals(nilai.nim)) {
                System.out.println("Nim\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                nilai.print();
                System.out.println("Total SKS " + nilai.sks + " telah diambil.");
            }
        }
    }

    public void sort(){
        Double[] sr = new Double[nilain.size()];
        int x=0;
        for (Nilai nilai : nilain) {
            sr[x] = nilai.nilai;
            x++;
        }
        for (int i = 0; i < sr.length-1; i++) {
            for (int j = 1; j < sr.length-i; j++) {
                if(sr[j-1] > sr[j]){
                    Double temp = sr[j-1];
                    sr[j-1] = sr[j];
                    sr[j] = temp; 
                }
            }
        }
        for(int i=0; i<sr.length; i++){
            for (Nilai nilai : nilain) {
                if(nilai.nilai==sr[i]){
                    nilai.print();
                }
            }
        }
    }
    
}
```
Class Main
```java
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
```
Output
<img src="Output16/lp2a.png">
<img src="Output16/lp2b.png">
<img src="Output16/lp2c.png">
<img src="Output16/lp2d.png">


