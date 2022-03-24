# Laporan Praktikum Pertemuan 3

### oleh : Yofandra Arta Priyoga_2141720121_TI-1G  
<p> <br>

## Jawaban Pertanyaan
<p> <br>

### Percobaan 4.2
```java
public class Faktorial{

    public int nilai;

    public int faktorialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto = fakto*i;
        }
        return fakto;
    }

    public int faktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
}
```
```java
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" +(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("===================================================");
    }
}
```
output
<img src="output/faktorial.png">

### Jawaban Subbab 4.2
1. jika nilai n sama dengan 1, maka program akan return 1. Jika tidak nilai n dikurangi 1, diamana setiap perulangan pada method dikalikan dengan nilai sebelumnya kemudian program akan me return variable fakto
2.  - Divide : faktorialDC(n-1), pengurangan pada nilai n
    - Conquer : n*faktorialDC(n-1), penyelesaian dengan rekursif
    - Combine : n*faktorial(n-1), pengombinasian dengan perkalian
3. memungkinkan
4. 
```java
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" +(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        long start = System.currentTimeMillis();
        System.out.println("======================================");
        System.out.println("Hasil Fkatorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari Nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialBF(fk[i].nilai));

        }
        long time = System.currentTimeMillis();
        long elapsedtime = time - start;
        System.out.println("Waktu " + String.valueOf(elapsedtime) + "ms");
        long start1 = System.currentTimeMillis();
        System.out.println("=========================================");
        System.out.println("Hasil Faktorial dengan Devide and Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari Nilai " + fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("===============================================");

        long time1 = System.currentTimeMillis();
        long elapsedtime1 = time1 - start;
        System.out.println("Waktu " + String.valueOf(elapsedtime1) + "ms");
        System.out.println("=================================================");
    }
}
```
5.
<img src="output/faktorial2.png">
<img src="output/faktorial3.png">
<img src="output/faktorial4.png">

### Percobaan 4.3
```java
public class Pangkat {

    public int nilai, pangkat;

    public int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i=0; i<n; i++){
            hasil=hasil*a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        }else{
            if(n%2==1)//bilangan ganjil
                return(pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else//bilangan genap
                return(pangkatDC(a,n/2)*pangkatDC(a,n/2));
        }
    }
}
```
```java
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen uang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat [] png = new Pangkat[elemen];

        for(int i=0; i<elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===================================================");
    }
}
```
output
<img src="output/pangkat.png">

### Jawaban Subbab 4.3
1. pada method pangkatBF() menggunakan fungsi iterative sedangkan method pangkatDC() menggunakan fungsi rekursif
2. apabila bilangan ganjil maka return ada tambahan akan dikalikan a sedangkan jika bilangan genap maka tidak
3. sudah, terdapat pada method pangkatDC. Atau lebih jelasnya seperti dibawah ini:
```java
return (pangkat(a,n/2) * pangkatDC(a,n/2));
```
4. 
```java
public class Pangkat {

    public int nilai, pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    public int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i=0; i<n; i++){
            hasil=hasil*a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        }else{
            if(n%2==1)//bilangan ganjil
                return(pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else//bilangan genap
                return(pangkatDC(a,n/2)*pangkatDC(a,n/2));
        }
    }
}
```
```java
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen uang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat [] png = new Pangkat[elemen];

        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            int bil = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            int pang = sc.nextInt();
            png[i] = new Pangkat(bil, pang);
        }

        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===================================================");
    }
}
```
output
<img src="output/pangkat2.png">


### Percobaan 4.4
```java
public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for(int i=0; i<elemen; i++){
            total = total+arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if(l==r)
            return arr[l];
        else if(l<r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr,l,mid-1);
            double rsum = totalDC(arr,mid+1,r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
```
```java
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("=========================================================");
        for (int i=0; i<sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke-" +(i+1)+ " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("=========================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " +sm.elemen+ " bulan adalah = " +sm.totalBF(sm.keuntungan));
        System.out.println("=========================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " +sm.elemen+ " bulan adalah = " +sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
    
}
```
output
<img src="output/sum.png">

### Jawaban Subbab 4.4
1. pada method totalBF() kode program lebih ringkas dan sederhana sedangkan pada method totalDC() kode program lebih panjang
2. dengan mengganti "println" menjadi "printf" dan juga teknik pembatasan karakter yaitu seperti dibawah ini:
```java
System.out.printf("%2f", "Total keuntungam selama 
"+sm.elemen+" bulan adalah : "+sm.totalBF(sm.keuntungan));
```
3. Return value tersebut berguna untuk mengembalikan nilai dari variable lsum 
,variable rsum dan juga arr [mid] yang mana masing-masing nya di jumlah kan 
terlebih dahulu. 
4. untuk menampung nilai dari perhitungan (l+r)/2 dimana nantinya akan digunakan sebagai pengisian nilai pada 
parameter di method totalDC()


### Latihan Praktikum
```java
public class latihan {
    public int suara;
    public int jumlahSuara = 0;
    public int jumlahKandidat = 4;
    public  String namaKandidat;
    public static int control = 0; 
    public static int nilai = 1; 
    public static int accept = 0; 
    public static int accept2 = 0;
    public static int array[] = new int[10000];

    public static int Hitung(int js, int a, int b, int c, int d){
        if(nilai==5){
            nilai = 1;
        }
        if(nilai==1 && a>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a-1, b, c, d);
        }else if(nilai==2 && b>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a, b-1, c, d);
        }else if(nilai==3 && c>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a, b, c-1, d);
        }else if(nilai==4 && d>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a, b, c, d-1);
        }else if(a==0 && b==0 && c==0 && d==0){
            if (array[accept] == array[accept + 1] && accept + 1 < js){
                return array[accept];
            }else if(accept +2<js){
                accept += 2;
                return Hitung(js,a,b,c,d);
            }else{
                return 0;
            }
        }else{
            nilai++;
            return Hitung(js,a,b,c,d);
        }
    }
}
```
```java
import java.util.Scanner;

public class latihanMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Pemilihan Suara Ketua BEM Tahun 2022");
        System.out.println("================================================");
        latihan bem = new latihan();
        latihan[] arr = new latihan[bem.jumlahKandidat];

        for(int i=0; i<bem.jumlahKandidat; i++){
            arr[i] = new latihan();
            System.out.print("Nama Kandidat ke- " +(i+1)+ " : ");
            arr[i].namaKandidat = sc.nextLine();
        }
        System.out.println("================================================");
        for(int i=0; i<bem.jumlahKandidat; i++){
            System.out.print("Jumlah Suara Kandidat ke- " +(i+1)+ " : ");
            arr[i].suara = sc.nextInt();
            bem.jumlahSuara += arr[i].suara;
        }
        System.out.println("================================================");
        int hasil = bem.Hitung(bem.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if(hasil==0){
            System.out.println("Masing-masing Kandidat memiliki jumlah suara sama");
        }else{
            System.out.println("Ketua BEM yang terpilih adalah : " +arr[hasil-1].namaKandidat);
        }
    }
}
```
output
<img src="output/latihan.png">

