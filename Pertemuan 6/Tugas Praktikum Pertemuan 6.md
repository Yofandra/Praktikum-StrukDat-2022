# Laporan Praktikum Pertemuan 6

### oleh : Yofandra Arta Priyoga_2141720121_TI-1G  
<p> <br>

## Jawaban Pertanyaan
<p> <br>

### Percobaan 5.2
```java
public class Mahasiswa {

    String nama;
    int thnMasuk, umur;
    double ipk;
  
    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }
    void tampil(){
        System.out.println("Nama = " +nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
```
```java
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println ("Data sudah Penuh !!");
        }       
    }
    void tampil(){
        for (Mahasiswa m : listMhs){
           m.tampil();
           System.out.println("----------------------");
       }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j]= listMhs[j-1];
                    listMhs[j-1]= tmp;
                }
            }
        }
    }
    
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa ("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa ("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa ("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa ("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa ("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk : ");
        list.bubbleSort();
        list.tampil();
        
        
    }
    
}
```
<img src="output6/5.2a.png">
<img src="output6/5.2b.png">

### Jawaban Subbab 5.2
1. Di method void bubbleSort()
2. Di method void selectionSort()
3. Sebuah proses untuk melakukan penukaran nilai
4. Untuk proses penukaran nilai dimana nilai akan dibandingkan terlebih dahulu dengan indeks setelahnya, apabilanilai lebih besar maka akan ditukar
5. a. Perulangan i untuk looping array dan j untuk looping array sesudah array i agar bisa dibandingkan
<br>b. Karena ada perulangan J yang mengeloop sampai listmhs, saat i = 0 maka akan di loop sampai array.length - 0  yang berarti di loop j pertama dari 1 sampai array.length
<br>c. Untuk membandingkan dengan array i
<br>d. 49 for dan 1225 tahapan


### Percobaan 5.3
```java
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println ("Data sudah Penuh !!");
        }       
    }
    void tampil(){
        for (Mahasiswa m : listMhs){
           m.tampil();
           System.out.println("----------------------");
       }
    }
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa ("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa ("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa ("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa ("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa ("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
          
    }
    
}
```
<img src="output6/5.2a.png">
<img src="output6/5.3.png">


### Percobaan 5.4
```java
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println ("Data sudah Penuh !!");
        }       
    }
    void tampil(){
        for (Mahasiswa m : listMhs){
           m.tampil();
           System.out.println("----------------------");
       }
    }
    void insertionSort(){
        for(int i=0; i<listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }

    }
    
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa ("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa ("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa ("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa ("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa ("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
         
    }
    
}
```
<img src="output6/5.2a.png">
<img src="output6/5.4.png">


### Latihan Praktikum
```java
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
```
```java
public class TiketService {
    
    Tiket tikets[] = new Tiket[5];
    int idx;

    void tambah(Tiket t){
        if(idx < tikets.length){
            tikets[idx] = t;
            idx++;
        }else{
            System.out.println("Tiket tidak tersedia");
        }
    }

    void tampilAll() {
        for(Tiket t : tikets){
            t.tampilAll();
            System.out.println("=========================================");
        }
    }

    void bubbleSort(){
        for(int i=0; i<tikets.length-1; i++){
            for(int j=1; j<tikets.length; j++){
                if (tikets[j].harga < tikets[j-1].harga){
                    Tiket tmp = tikets[j];
                    tikets[j]= tikets[j-1];
                    tikets[j-1]= tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0; i<tikets.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<tikets.length; j++){
                if(tikets[j].harga < tikets[idxMin].harga){
                    idxMin = j;
                }
            }
            Tiket tmp = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
```
```java
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
```
output
<img src="output6/latihan1.png">
<img src="output6/latihan2.png">
<img src="output6/latihan3.png">
   

   
