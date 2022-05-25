# Laporan Praktikum Pertemuan 7

### oleh : Yofandra Arta Priyoga_2141720121_TI-1G  
<p> <br>

## Jawaban Pertanyaan
<p> <br>

### Percobaan 6.2
class Mahasiswa
```java
public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
```
class PencarianMhs
```java
public class PencarianMhs{
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m:listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " +x+ "ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +x);
            System.out.println("Nama\t : " +listMhs[pos].nama);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
}
```
class MahasiswaMain
```java
import java.util.Scanner;

public class MahasiswaMain{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil");
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
        System.out.println("Masukkan NIM mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
```
output
<img src= img7/1.png> 

### Jawaban Subbab 6.2
1. TampilData menampilkan semua atribut object class yang dicari sedangkan TampilPosisi menampilkan index dari object class yang di cari
2. untuk keluar dari perulangan agar posisi tidak lanjut setelah j ditemukan
3. masih berjalan karena algoritma sequential search akan melakukan scan ke setiap data dan membandingkan data lain ke data yang dicari, jadi tidak perlu urut

### Percobaan 6.3
class Mahasiswa
```java
public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
```
class PencarianMhs
```java
public class PencarianMhs{
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m:listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return(mid);
            }else if(listMhs[mid].nim>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " +x+ "ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +x);
            System.out.println("Nama\t : " +listMhs[pos].nama);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
}
```
class MahasiswaMain
```java
import java.util.Scanner;

public class MahasiswaMain{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil");
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
        System.out.println("Masukkan NIM mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        System.out.println("=============================================");
        System.out.println("Menggunakan binary search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
```
<img src= img7/2.png>  

### Jawaban Subbab 6.2
1. 
```java
if (right >= left) {
            mid = (left + right) / 2;
``` 
2. 
```java
if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
```
3. maka algoritma binary search tidak dapat dijalankan karena binary search akan mencari data berdasar nilai tengah, lalu jika lebih besar atau lebih kecil akan mengubah index sampai index mid sama seperti index data yang dicari. Jadi data harus urut
4. 
```java
int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
```
hanya mengganti ">" menjadi "<"

### Percobaan 6.4
class MergeSorting
```java
public class MergeSorting {
    public void mergeSort(int[] data) {
        sort(data,0,data.length-1);
    }

    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    private void sort(int data[], int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle+1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
```
class SortMain
```java
public class SortMain {
    
    public static void main(String[] args){
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting menggunakan merge sort");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
```
<img src= img7/3.png>   


### Latihan Praktikum
1. 
class Mahasiswa
```java
public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
```
class PencarianMhs
```java
public class PencarianMhs{
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m:listMhs){
            m.tampil();
            System.out.println("---------------------");
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

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return(mid);
            }else if(listMhs[mid].nim>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " +x+ " ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +x);
            System.out.println("Nama\t : " +listMhs[pos].nama);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
}
```
class MahasiswaMain
```java
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

        /*System.out.println("=============================================");
        System.out.println("Pengurutan data menggunakan selection sort");
        data.selectionSort();*/
        
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan NIM mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        System.out.println("=============================================");
        System.out.println("Menggunakan binary search");
        data.selectionSort();
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
```
output
<img src= img7/4.png> 

2. 
class Mahasiswa
```java
public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
```
class PencarianMhs
```java
public class PencarianMhs{
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m:listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos){
        if (pos!= -1){
            System.out.println("data : " +x+ " ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +listMhs[pos].nim);
            System.out.println("Nama\t : " +x);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
}
```
class MahasiswaMain
```java
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
```
output
<img src= img7/5.png>

3. 
class latihan3
```java
public class latihan3{
    int[] arr;
    int[] idx;
    int counter = 0;
    int max = 0;

    latihan3(int[] x, int y){
        this.arr = new int[y];
        this.idx = new int[y];
        arr = x;
    }

    void tampilarray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            int tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }

    void mencarinilaiterbesar() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    void tampiljumlahdanindex() {
        System.out.println("Nilai terbesar adalah : " + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                counter++;
                idx[i] = i;
            }
        }
        System.out.println("Jumlah nilai terbesar ada : " + counter);
        System.out.print("terdapat pada indeks : ");
        for (int i = 0; i < arr.length; i++) {
            if (idx[i] != 0) {
                System.out.print(idx[i] + " ");
            } else {
                continue;
            }
        }
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == arr[mid]) {
                return (mid);
            } else if (arr[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void TampilPosisi(int x, int pos) {
        if (pos != -1) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    counter++;
                    idx[i] = i;
                }
            }

            System.out.print("data " + x + " ditemukan sebanyak " + counter + " buah\nterletak pada indeks : " + pos);
            for (int i = 0; i < arr.length; i++) {
                if (arr[pos] == arr[i]) {
                    idx[i] = i;
                } if (idx[i] != 0 && i!=pos) {
                    System.out.print(" " + idx[i]);
                }
            }
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

}
```
class latihan3Main
```java
public class latihan3Main {
    public static void main(String[] args) {
        int[] data = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };
        latihan3 x = new latihan3(data, data.length);
        int posisi;
        x.tampilarray();
        System.out.println();
        System.out.println("Setelah disorting :");
        x.selectionSort();
        x.tampilarray();
        x.mencarinilaiterbesar();
        posisi = x.FindBinarySearch(x.max, 0, x.arr.length - 1);
        System.out.println();
        x.TampilPosisi(x.max, posisi);
    }
}
```
output
<img src= img7/6.png>