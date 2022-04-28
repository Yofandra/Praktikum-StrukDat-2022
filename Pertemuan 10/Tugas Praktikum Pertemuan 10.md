# Laporan Praktikum Jobsheet 8 Pertemuan 10
### Nama  : Yofandra Arta Priyoga
### NIM   : 2141720121
### Kelas : TI-1G
### Absen : 29

## Jawaban Pertanyaan
<p> <br>

### Jawaban Subbab 8.2.2
1. Agar tidak ada nilai pada front dan rear pada awalnya.
2. Ketika rear berada di index terakhir dari array maka rear nya akan di atur ke 0, jadi rear tidak akan melewati batas maksimal dari indeks array
3. -
4. Karena indeks terdepan bisa jadi bukan indeks 0, indeks terdepan adalah front jadi yang di tampilkan adalah dimulai dari indeks front
5. Ketika i sudah berada dalam indeks terakhir, i akan kembali ke indeks 0. Jadi sistem tidak melakukan print di luar indeks array
6. 
 ```java
System.out.print("Masukkan data baru: ");
int dataMasuk = sc.nextInt();
Q.Enqueue(dataMasuk);
break;
```
dan
```java
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```

### Jawaban Subbab 8.3.3
1. Ketika masuk ke case 2 dan data[front] mempunyai isi, maka sistem akan melakukan print data yang telah didequeue tersebut
2. Modifikasi dari class Queue :
```java
public void peekRear() {
    if (!IsEmpty()) {
        System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
                + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
    } else {
        System.out.println("Queue masih kosong");
    }
}
```
Modifikasi dari class QueueMain : 
```java
public static void menu() {
    System.out.println("Pilih Menu:");
    System.out.println("1. Antrian Baru");
    System.out.println("2. Antrian Keluar");
    System.out.println("3. Cek Antrian Terdepan");
    System.out.println("4. Cek Semua Antrian");
    System.out.println("5. Cek Antrian Paling Belakang");
    System.out.println("-------------------");
}
```
```java
        case 5:
            antri.peekRear();
            break;
    }

} while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
```

### Tugas 8.4
1. 
class Queue
```java
public class Queue{
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    } 

    public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: "+ data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.println(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen  = " + size);
        }
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if (rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue(){
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekPosition(int datacari){
        int i = front;
        int posisi = 1;
        System.out.print("Data di posisi: ");
        while(i != rear){
            if (data[i]==datacari){
                System.out.print(posisi + " ");
            }
            i = (i+1)%max;
            posisi++;    
        }
        if(data[i] == datacari){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void peekAt(int position){
        int idxCari = front;
        System.out.print("Data pada posisi " +position+ " adalah: ");
        for (int i=0; i<position-1; i++){
            idxCari=(idxCari+1)%max;
        }
        System.out.println(data[idxCari] + " ");
    }
    
}
```

class QueueMain
```java
import java.util.Scanner;

public class QueueMain{

    public static void menu(){
        System.out.println("Masukkan operasi yang dinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("---------------------");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: "+ dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan data yang di cari: ");
                    int dataCari = sc.nextInt();
                    Q.peekPosition(dataCari);
                    break;
                case 7:
                    System.out.println("Masukkan index data yang di cari");
                    int position = sc.nextInt();
                    Q.peekAt(position);
                    break;
            }    
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 );
    }

}
```

output
<img src="output10/1.1.png">
<img src="output10/1.2.png">

2.
class Mahasiswa
```java
public class Mahasiswa {
    
    String nim;
    String nama;
    int absen;
    double ipk;

    Mahasiswa(String nim, String nama, int absen, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }

    Mahasiswa(){

    }
}
```
class Queue
```java
public class Queue {
    
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size==0){
            return  true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(Mahasiswa antri){
        if(IsFull()){
            System.out.println("Antrian sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = antri;
            size++;
        }
    }

    public Mahasiswa Dequeue(){
        Mahasiswa antri = new Mahasiswa();
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            antri = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return antri;
    }

    public void Print(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].absen 
                + " " + data[i].ipk);
                i = (i+1)%max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].absen 
            + " " + data[i].ipk);
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Peek(){
        if(!IsEmpty()){
            System.out.println("Antrian terdepan: " +data[front].nim + " " + data[front].nama + " " + data[front].absen 
            + " " + data[front].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    public void PeekRear(){
        if(!IsEmpty()){
            System.out.println("Antrian paling belakang: " +data[rear].nim + " " + data[rear].nama + " " + data[rear].absen 
            + " " + data[rear].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    public void PeekPosition(String nimCari){
        int i = front;
        int posisi = 1;
        System.out.print("Data mahasiswa di posisi: ");
        while(i != rear){
            if (data[i].nim.equals(nimCari)){
                System.out.print(posisi + " ");
            }
            i = (i+1)%max;
            posisi++;    
        }
        if(data[i].nim.equals(nimCari)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void PrintMahasiswa(int position){
        int idxCari = front;
        System.out.print("Data mahasiswa pada posisi " +position+ " adalah: ");
        for (int i=0; i<position-1; i++){
            idxCari=(idxCari+1)%max;
        }
        System.out.println(data[idxCari].nim + " " + data[idxCari].nama + " " + data[idxCari].absen 
            + " " + data[idxCari].ipk);
    }
}
```
class MahasiswaMain
```java
import java.util.Scanner;

public class MahasiswaMain {
    
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("s. Cek semua antrian");
        System.out.println("6. Cek posisi antrian data mahasiswa");
        System.out.println("7. Cek data mahasiswa pada posisi tertentu");
        System.out.println("==========================================");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc.nextInt();
        Queue x = new Queue(jumlah);

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    x.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa data = x.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen !=0 && data.ipk !=0){
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama + " " + data.absen 
                        + " " + data.ipk);
                        break;
                    }
                case 3: 
                    x.Peek();
                    break;
                case 4:
                    x.PeekRear();
                    break;
                case 5:
                    x.Print();
                    break;
                case 6:
                    System.out.print("Masukkan nim mahasiswa yang dicari ");
                    String nimCari = sc.nextLine();
                    x.PeekPosition(nimCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi data yang ingin dicari ");
                    int position = sc.nextInt();
                    x.PrintMahasiswa(position);
                    break; 
            }   
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 );
    }
}
```

output
<img src="output10/2.1.png">
<img src="output10/2.2.png">
<img src="output10/2.3.png">
<img src="output10/2.4.png">
