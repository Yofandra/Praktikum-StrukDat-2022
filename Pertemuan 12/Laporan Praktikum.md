# Laporan Praktikum Jobsheet 12 Double Linked List
### Nama  : Yofandra Arta Priyoga
### NIM   : 2141720121
### Kelas : TI-1G
### Absen : 29

## Jawaban Pertanyaan
<p> <br>

### Output percobaan 12.2.2
<img src="Output 12/1.png">

### Jawaban Subbab 12.2.3
1. Single linked linked list hanya mengetahui next tanpa mengetahui previous
2. Atribut next untuk menunjuk node berikutnya dan previous untuk menunjuk node sebelumnya
3. Untuk menunjukkan bahwa size masih 0 dan juga head = null atau tidak menunjuk kemana pun
4. Karena menambahkan data paling depan jadi tidak ada data sebelumnya maka di isi null
5. Agar mengisi data di head sebelumnya menjadi newNode
6. Current merupakan node sebelumnya dan terkahir di kasih null karena sudah tidak ada data lagi setelahnya

### Output percobaan 12.3.2
<img src="Output 12/2.png">

### Jawaban Subbab 12.3.3
1. Maksudnya adalah untuk mengubah head ke next yaitu ke node selanjutnya terus setelah itu head.prev maka head sebelumnya yaitu head yang lama di delete
2. Dengan cara mencari pointer next = null
3. Karena menyimpan data head jadi lebih baik di removefirst
4. pointer next pada current/node sebelumnya akan menunjuk ke current/node selanjutnya, dan pointer prev pada current/node selanjutnya akan menunjuk ke current/node sebelumnya

### Output percobaan 12.4.2
<img src="Output 12/3.png">

### Jawaban Subbab 12.4.3
1. Untuk memanggil size atau untuk mengetahui banyaknya node
2. Dengan cara menginisialisasi perulangan index dari 1
3.
4. A) jika size == 0 maka true is empty jika tidak ya false
    B) mengecek apakah head == nul

### Tugas Praktikum
#### 1.
#### class Node
```java
public class Node{
    int data;
    String nama;
    Node prev, next;

    Node(Node prev, int data, String nama, Node next) {
        this.prev = prev;
        this.data = data;
        this.nama = nama;
        this.next = next;
    }
}
```
#### class DoubleService
```java
public class DoubleService {
    Node head;
    int size;

    DoubleService() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data, String nama) {
        if (isEmpty()) {
            head = new Node(null, data, nama, null);
        } else {
            Node temp = new Node(null, data, nama, head);
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void addLast(int data, String nama) {
        if (isEmpty()) {
            head = new Node(null, data, nama, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node nn = new Node(current, data, nama, null);
            current.next = nn;
            size++;
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, Tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(head.nama + " selesai divaksinisasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai Index diluar batas");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("|" + tmp.data + "\t|" + tmp.nama +"\t|");
                tmp = tmp.next;
            }
            size++;
            System.out.println("Sisa Antrian : " + (size));
            System.out.println("\nBerhasil diisi");
            size--;
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
```
#### class Main
```java
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
```
#### Output
<img src="Output 12/4a.png">
<img src="Output 12/4b.png">
<img src="Output 12/4c.png">

#### 2.
#### class NodeFilm
```java
public class NodeFilm {
    int idFilm;
    String Judul;
    double rate;
    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, int idFilm, String judul, double rate,NodeFilm next) {
        this.prev = prev;
        this.idFilm = idFilm;
        this.Judul = judul;
        this.rate = rate;
        this.next = next;
    }
}
```
#### class Film
```java
public class Film {
    NodeFilm head;
    int size;

    public Film() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int idFilm, String judul, double rate) {
        if (isEmpty()) {
            head = new NodeFilm(null, idFilm, judul, rate, null);
        } else {
            NodeFilm newNode = new NodeFilm(null, idFilm, judul, rate,
            head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int idFilm, String Judul, double rate) {
        if (isEmpty()) {
            addFirst(idFilm, Judul, rate);
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current, idFilm, Judul,
            rate, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int idFilm, String judul, double rate, int index)throws Exception {
        if (isEmpty()) {
            add(idFilm, judul, rate, index);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index terlalu banyak");
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
            i++;
            }
            if (current.prev == null) {
                NodeFilm newNode = new NodeFilm(null, idFilm, judul,rate, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeFilm newNode = new NodeFilm(current.prev, idFilm,judul, rate, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data film masih kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            NodeFilm tmp = head;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data film dihapus");
            System.out.println("Id Film :" + tmp.idFilm);
            System.out.println("Judul Film : " + tmp.Judul);
            System.out.println("rate Film : " + tmp.rate);
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data film masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeFilm current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("Data film berhasil dihapus");
        System.out.println("Id Film :" + current.idFilm);
        System.out.println("Judul Film : " + current.Judul);
        System.out.println("rate Film : " + current.rate);
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index terlalu banyak");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            System.out.println("Data film berhasil dihapus");
            System.out.println("Id Film :" + current.idFilm);
            System.out.println("Judul Film : " + current.Judul);
            System.out.println("rate Film : " + current.rate);
        }
    }

    public void print() {
        if (!isEmpty()) {
            NodeFilm tmp = head;
            while (tmp != null) {
                System.out.println("Id Film :" + tmp.idFilm);
                System.out.println("Judul Film : " + tmp.Judul);
                System.out.println("rate Film : " + tmp.rate);
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Data Kosong");
        }
    }

    public void cari(int idfilm) throws Exception {
        NodeFilm tmp = head;
        while (tmp != null) {
            if (idfilm == tmp.idFilm) {
                System.out.println("Id Film :" + tmp.idFilm);
                System.out.println("Judul Film : " + tmp.Judul);
                System.out.println("rate Film : " + tmp.rate);
            }
            tmp = tmp.next;
        }
    }

    void BubleShort() throws Exception {
        if (isEmpty()) {
            throw new Exception("data film kosong");
        } else {
            NodeFilm current = null, index = null;
            double temp;
            String tmp;
            int templ;
            for (current = head; current.next != null; current =current.next) {
                for (index = current.next; index != null; index =index.next) {
                    if (current.rate < index.rate) {
                        temp = current.rate;
                        tmp = current.Judul;
                        templ = current.idFilm;
                        current.rate = index.rate;
                        current.Judul = index.Judul;
                        current.idFilm = index.idFilm;
                        index.rate = temp;
                        index.Judul = tmp;
                        index.idFilm = templ;
                    }
                }
            }
        }
    }
}
```
#### class Main
```java
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("=================================");
        System.out.println(" Data film layar lebar");
        System.out.println("=================================");
        System.out.println("1. Tambah Data awal");
        System.out.println("2. Tambah Data akhir");
        System.out.println("3. Tambah Data index tertentu");
        System.out.println("4. Hapus Data awal");
        System.out.println("5. Hapus Data akhir");
        System.out.println("6. Hapus Data index tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari Id Film");
        System.out.println("9. Urut data rating film desc");
        System.out.println("10. Keluar");
        }
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            Film fm = new Film();
            int idFilm, index;
            String Judul;
            double rate;
            String ulang;
            do {
                menu();
                System.out.println("Pilih menu: ");
                int pilih = sc.nextInt();
                sc.nextLine();
                switch (pilih) {
                case 1:
                    System.out.println("===================");
                    System.out.println("id Film: ");
                    idFilm = sc.nextInt();
                    System.out.println("Judul film: ");
                    Judul = sc1.nextLine();
                    System.out.println("rating film");
                    rate = sc.nextDouble();
                    fm.addFirst(idFilm, Judul, rate);
                    break;

                case 2:
                    System.out.println("===================");
                    System.out.println("id Film: ");
                    idFilm = sc.nextInt();
                    System.out.println("Judul film: ");
                    Judul = sc1.nextLine();
                    System.out.println("rating film");
                    rate = sc.nextDouble();
                    fm.addLast(idFilm, Judul, rate);
                    break;

                case 3:
                    System.out.println("===================");
                    System.out.println("id Film: ");
                    idFilm = sc.nextInt();
                    System.out.println("Judul film: ");
                    Judul = sc1.nextLine();
                    System.out.println("rating film");
                    rate = sc.nextDouble();
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    index = sc.nextInt();
                    fm.add(idFilm, Judul, rate, index);
                    break;

                case 4:
                    System.out.println("======================");
                    fm.removeFirst();
                    break;

                case 5:
                    System.out.println("=========================");
                    fm.removeLast();
                    break;

                case 6:
                    System.out.println("=========================");
                    index = sc.nextInt();
                    fm.remove(index);
                    break;

                case 7:
                    System.out.println("=========================");
                    fm.print();

                case 8:
                    System.out.println("=========================");
                    System.out.println("Id Film: ");
                    idFilm = sc.nextInt();
                    fm.cari(idFilm);
                    break;

                case 9:
                    System.out.println("=========================");
                    System.out.println("Urutan rating film");
                    System.out.println("=========================");
                    fm.BubleShort();
                    break;

                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf anda salah memasukkan menupilihan");
                }
                System.out.println("Apakah anda ingin kembali ke menuutama? [Y/T]");
                ulang = sc.next();
            } while (ulang.equalsIgnoreCase("Y"));
            sc.close();
            sc1.close();
        }
}
```
#### Output
<img src="Output 12/5a.png">
<img src="Output 12/5b.png">
<img src="Output 12/5c.png">