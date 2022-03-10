# Laporan Praktikum Pertemuan 3

### oleh : Yofandra Arta Priyoga_2141720121_TI-1G  
<p> <br>

## Jawaban Pertanyaan
<p> <br>

### Subbab 3.2
1. Kalau untuk atribut harus tetapi kalau method tidak harus karena pada percobaan 3.2 menunjukkan bahwa tidak terjadi masalah jika di class array of object tidak terdapat method
2. Untuk membuat objek PersegiPanjang ke index array 1
3. Agar ppArray menampung 3 objek PersegiPanjang
4. Untuk instansiasi objek pada index array 1 dengan mengisi atribut panjang = 80 dan lebar = 40
5. Karena menggambarkan class dan objek itu sendiri dan lebih fleksibel

### Subbab 3.3
1. Bisa
2.  ```java
    barang[][] brg = new barang[1][2];
    brg[1][1]=new barang
    ```
3. Karena be,um membuat objek pada index array 5
4.  ```java
    System.out.print("Masukkan panjang array : ");
    int panjangArray = sc.nextInt();
    PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];
    ```
5. Boleh, namun kurang efektif dan efisien

### Subbab 3.4
1. dapat
    ```java
    public class turnamen{
        int hari;
        public turnamen(){

        }
        public turnamen(int t) {
            hari = t;
        }
    }
    ```
2.  ```java
    public class Segitiga {
        public int alas;
        public int tinggi;

        public Segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }
    }    
    ```
3. ```java
    public class Segitiga {
        public int alas;
        public int tinggi;

        public Segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }
        int hitungLuas(){
            int luas = (alas * tinggi) / 2;
            return luas;
        }
        double hitungKeliling(){
            double sisi = Math.sqrt(((alas*0.5)*(alas*0.5))+(tinggi*tinggi));
            double keliling = alas + sisi*2;
        }
    }    
    ```
4.  ``` java
        public class SegitigaMain{
            public static void main(String[] args){
                Segitiga[] sgt = new Segitiga[4];
                for (int i=0 ; i<sgt.length ; i++){
                    sgt[i] = new Segitiga();
                }
                sgt[0].alas = 10;
                sgt[0].tinggi = 4;
                sgt[1].alas = 20;
                sgt[1].tinggi = 10;
                sgt[2].alas = 15;
                sgt[2].tinggi = 6;
                sgt[3].alas = 25;
                sgt[3].tinggi = 10;
            }
        }
    ```
5.  ```java
    for (int i = 0 ; i < sgt.length ; i++){
        System.out.println("Luas Segitiga ke - " + (i+1) + " adalah : " + 
        sgt[i].hitungLuas());
        System.out.println("Keliling Segitiga ke - " + (i+1) + " adalah : " + 
        sgt[i].hitungKeliling());
    }

### Latihan Praktikum
1. class Kubus
    ```java
    class Kubus{
        int sisi;

        Kubus (int s){
            sisi = s;
        }

        int luasPermukaan(){
            return sisi*sisi*6;

        }
        int volume(){
            return sisi*sisi*sisi;
        }
    }
    ```
    class LimasSegiempat
    ```java
    public class LimasSegiempat{
        double sisi, tinggi;

        LimasSegiempat (double s, double t){
            sisi = s;
            tinggi = t;
        }

        double luasPermukaan() {
            double luasAlas = sisi*sisi;
            double luasSelimut = 4*(0.5*sisi*tinggi);
            double luas = luasAlas + luasSelimut;
            return luas;
        }

        double volumeLimas() {
            double luasAlas = sisi*sisi;
            double volume = (luasAlas*tinggi)/3;
            return volume;
        }
    }
    ```
    class Bola
    ```java
    public class Bola{
        double jari;

        Bola(double r) {
            jari = r;
        }

        double luasPermukaan() {
            double luas = 4*Math.PI*jari*jari;
            return luas;
        }

        double volume() {
            double volume = (4*Math.PI*jari*jari*jari) /3;
            return volume;
        }
    }
    ```
    class Main
    ```java
    import java.util.Scanner;

    public class BangunRuang{
        public static void main(String[] args){
            Kubus[] kbArray = new Kubus[3];
            LimasSegiempat[] lsArray =  new LimasSegiempat[3];
            Bola[] blArray = new Bola[3];
            Scanner sc = new Scanner(System.in);

            System.out.println("BANGUN KUBUS");
            for(int i=0; i<3; i++){
                System.out.print("Masukkan sisi kubus ke " + (i+1) +" = ");
                int sisi = sc.nextInt();
                kbArray[i]= new Kubus(sisi);
            }

            for(int i=0; i<3; i++){
                System.out.println("Luas permukaan kubus ke "+ (i+1) +" = "+ kbArray[i].luasPermukaan());
                System.out.println("Volume kubus ke "+ (i+1) +" = "+ kbArray[i].volume());
            }
            
            System.out.println("\nBANGUN LIMAS SEGIEMPAT");
            for(int i=0; i<3; i++){
                System.out.print("Masukkan sisi limas ke " + (i+1) +" = ");
                double sisi = sc.nextInt();
                System.out.print("Masukkan tinggi limas ke " + (i+1) +" = ");
                double tinggi = sc.nextInt();
                lsArray[i]= new LimasSegiempat(sisi, tinggi);
            }
            
            for(int i=0; i<3; i++){
                System.out.println("Luas permukaan limas ke "+ (i+1) +" = "+ lsArray[i].luasPermukaan());
                System.out.println("Volume limas ke "+ (i+1) +" = "+ lsArray[i].volumeLimas());
            }

            System.out.println("\nBANGUN BOLA");
            for(int i=0; i<3; i++){
                System.out.print("Masukkan jari-jari bola ke " + (i+1) +" = ");
                double jari = sc.nextInt();
                blArray[i]= new Bola(jari);
            }
            
            for(int i=0; i<3; i++){
                System.out.println("Luas permukaan bola ke "+ (i+1) +" = "+ blArray[i].luasPermukaan());
                System.out.println("Volume bola ke "+ (i+1) +" = "+ blArray[i].volume());
            }
        }
    }
    ```
    output

    <img src="img/1.png">
    <p> <br>

2. class tanah
    ```java
    public class tanah{
        int panjang, lebar;

        tanah(int p, int l){
            panjang = p;
            lebar = l;
        }

        int luasTanah() {
            int luas = panjang*lebar;
            return luas;
        }
    }
    ```
    class Main

    ```java
    import java.util.Scanner;

    public class tanahMain{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jumlah tanah yang akan dihitung: ");
            int jumlah = sc.nextInt();
            tanah[] tn = new tanah[jumlah];

            for(int i=0; i<jumlah; i++){
                System.out.print("Masukkan panjang tanah " + (i+1) + " = ");
                int panjang = sc.nextInt();
                System.out.print("Masukkan lebar tanah " + (i+1) + " = ");
                int lebar = sc.nextInt();
                tn[i]= new tanah(panjang,lebar);
            }

            int max = 0;
            for(int i=0; i<jumlah; i++){
                System.out.println("Luas tanah " + (i+1) + " = " + tn[i].luasTanah());
                if (tn[i].luasTanah()>max)
                    max = tn[i].luasTanah();
            }
            System.out.println("Tanah terluas = " +max );

        }
    }

    


