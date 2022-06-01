# Laporan Praktikum Jobsheet 7 Pertemuan 9
### Nama  : Yofandra Arta Priyoga
### NIM   : 2141720121
### Kelas : TI-1G
### Absen : 29

## Jawaban Pertanyaan
<p> <br>

### Percobaan 7.2
Class Pakaian
```java
public class Pakaian{

    String jenis, warna, merk, ukuran;
    double harga;

    Pakaian (String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
}
```
Class Stack
```java
public class Stack {
    
    int size;
    int top;
    Pakaian data[];

    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Pakaian pkn){
        if (!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " +x.jenis+ " " +x.warna+ " " +x.merk+ " " +x.ukuran+ " " +x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " +data[top].jenis+ " " +data[top].warna+ " " +data[top].merk+ " " +data[top].ukuran+ " " +data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i>=0; i--){
            System.out.println(data[i].jenis+ " " +data[i].warna+ " " +data[i].merk+ " " +data[i].ukuran+ " " +data[i].harga);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i=top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

}
```
class StackMain
```java
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args){

        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);

        char pilih;
        do{
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.println("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        }while (pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();;
    }
}
```
Output
<img src= img9/1.png> 

### Jawaban Subbab 7.2
1. 5
```java
Stack stk = new Stack(5);
```
2. Data Pakaian
3. Sebagai perulangan untuk menambahkan data pada array pakaian

### Percobaan 7.3
Class Postfix
```java
public class Postfix {

    int n, top;
    char stack[];

    public Postfix(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push (char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c){
        if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9') || (c==' ' || c=='.')){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsOperator(char c){
        if (c=='^' || c=='%' || c=='/' ||c=='*' ||c=='-' ||c=='+' ){
            return true;
        }else{
            return false;
        }
    }

    public int derajat(char c){
        switch(c){
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q){
        String P="";
        char c;
        for (int i = 0; i<n; i++){
            c=Q.charAt(i);
            if (IsOperand(c)){
                P=P+c;
            }
            if(c=='('){ 
                push(c);
            }
            if (c==')'){
                while (stack[top] != '('){
                    P=P+pop();
                }
                pop();
            }
            if (IsOperator(c)){
                while (derajat(stack[top])>=derajat(c)){
                    P=P+pop();
                }
                push(c);
            }
        }
        return P;
    }
    
}
```
class PostfixMain
```java
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " +P);
    }
}
```
output
<img src= img9/2.png> 

### Jawaban Subbab 7.3
1. Method derajat digunakan untuk mengetahui seberapa besar nilai operator yang digunakan. Sebuah data (operator) yang bertipe char akan masuk ke dalam method derajat lalu di cek satu persatu dalam sintaks switch case. Jika operator sama dengan ^ maka akan mereturn nilai 3 atau nilai tertinggi dari sebuah derajat operator. Jika operator tidak sama dengan ^, namun sama dengan % maka akan mereturn nilai 2. Jika operator tidak sama dengan ^ dan %, namun sama dengan / maka akan mereturn nilai 2. Jika operator tidak sama dengan ^,%, dan /, namun sama dengan * maka akan mereturn nilai 2. Jika operator tidak sama dengan – atau + maka akan mereturn nilai 1. Dan jika tidak ada kesamaan operator yang diinputkan dengan perbandingan dalam switch case maka akan mereturn nilai 0. Hal ini dilakukan untuk member keputusan apakah operator yang dimasukkan.
2. Untuk menyimpan data char i ke dalam variable Q melalui sintaks charAt(i) 
3. 
<img src= img9/5.png> 

4. Tanda kurung tidak ditampilkan dalam konversi karena hanya sebagai pembatas atau menanda dalam sintaks infix yang dirubah ke postfix. Jika ditemukan ‘(‘ dalam infix maka akan dimasukkan kedalam stack, lalu dilanjutkan pengecekan ke operand dan operator berikutnya, lalu diambil keputusan apakah masuk ke dalam stack atau postfix. Setelah itu akan ditemukan ‘)’ dalam infix. Disiniah terdapat kondisi apabila belum ditemukan ‘(‘ sebagai Top of Stack maka operator yang berada di atas ‘(‘akan di push ke postfix hingga ‘(‘ merupakan Top of Stack setelah itu ‘(‘ dihapuskan dari stack tanpa dimasukkan ke dala postfix.

### Tugas
1. 
class Pakaian
```java
public class Pakaian{

    String jenis, warna, merk, ukuran;
    double harga;

    Pakaian (String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
}
```
class Stack
```java
public class Stack {
    
    int size;
    int top;
    Pakaian data[];

    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Pakaian pkn){
        if (!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " +x.jenis+ " " +x.warna+ " " +x.merk+ " " +x.ukuran+ " " +x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " +data[top].jenis+ " " +data[top].warna+ " " +data[top].merk+ " " +data[top].ukuran+ " " +data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i>=0; i--){
            System.out.println(data[i].jenis+ " " +data[i].warna+ " " +data[i].merk+ " " +data[i].ukuran+ " " +data[i].harga);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i=top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin(){
        double minHarga = data[0].harga;
        int idx = 0;
        for(int i=0; i<=top; i++){
            if(minHarga > data[i].harga){
                minHarga = data[i].harga;
                idx = i;
            }
        }
        System.out.println("Harga pakaian paling murah adalah " +data[idx].jenis+ " " +data[idx].warna+ " " +data[idx].merk+ " "
        +data[idx].ukuran+ " " +data[idx].harga);
    }

}
```
class StackMain
```java
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Masukkan banyak stack: ");
        int n = sc.nextInt();
        Stack stk = new Stack(n);
        for(int i=0; i<n; i++){
            System.out.print("Jenis: ");
            String jenis = sc1.nextLine();
            System.out.print("Warna: ");
            String warna = sc1.nextLine();
            System.out.print("Merk: ");
            String merk = sc1.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc1.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            stk.push(p);
        }
        String ulang;
        do{
            System.out.println("------MENU------");
            System.out.println("1. Menampilkan isi stack");
            System.out.println("2. Menampilkan elemen teratas");
            System.out.println("3. Menampilkan elemen terendah");
            System.out.println("4. Data yang keluar");
            System.out.println("5. Kosongkan stack");
            System.out.println("6. Keluar menu");
            System.out.println("Masukkan pilihan : ");
            int pilih = sc1.nextInt();

            switch(pilih){
                case 1:
                stk.print();
                break;
                case 2:
                stk.peek();
                stk.print();
                break;
                case 3:
                stk.getMin();
                stk.print();
                break;
                case 4:
                stk.pop();
                stk.print();
                break;
                case 5:
                stk.clear();
                stk.print();
                break;
                case 6:
                System.exit(0);
                break;

                default:
                System.out.println("Maaf, anda salah memasukkan menu pilihan");
            }
            System.out.println("Apakah ingin kembali ke menu? [Y/T]");
            ulang = sc.next();
        }while(ulang.equalsIgnoreCase("Y"));
    }
}
```
Output
<img src= img9/3.png>

2. 
class Struk
```java
public class Struk{

    int nomor, jumlah; 
    String tanggal;
    double harga;

    Struk (int nomor, String tanggal, int jumlah, double harga){
        this.nomor = nomor;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.harga = harga;
    }
}
```
class Stack
```java
public class Stack {
    
    int size;
    int top;
    Struk data[];

    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Struk str){
        if (!IsFull()){
            top++;
            data[top] = str;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            Struk x = data[top];
            top--;
            System.out.println("Data yang keluar: " +x.nomor+ " " +x.tanggal+ " " +x.jumlah+ " " +x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " +data[top].nomor+ " " +data[top].tanggal+ " " +data[top].jumlah+ " " +data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i>=0; i--){
            System.out.println(data[i].nomor+ " " +data[i].tanggal+ " " +data[i].jumlah+ " " +data[i].harga);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i=top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin(){
        double minHarga = data[0].harga;
        int idx = 0;
        for(int i=0; i<=top; i++){
            if(minHarga > data[i].harga){
                minHarga = data[i].harga;
                idx = i;
            }
        }
        System.out.println("Total harga Struk paling murah adalah " +data[idx].nomor+ " " +data[idx].tanggal+ " " +data[idx].jumlah+ " "
        +data[idx].harga);
    }

}
```
class StackMain
```java
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Masukkan banyak stack: ");
        int n = sc.nextInt();
        Stack stk = new Stack(n);
        for(int i=0; i<n; i++){
            System.out.print("Nomor transaksi: ");
            int nomor = sc.nextInt();
            System.out.print("Tanggal pembelian: ");
            String tanggal = sc1.nextLine();
            System.out.print("Jumlah barang: ");
            int jumlah = sc.nextInt();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Struk s = new Struk(nomor, tanggal, jumlah, harga);
            stk.push(s);
        }
        String ulang;
        do{
            System.out.println("------MENU------");
            System.out.println("1. Menampilkan isi stack");
            System.out.println("2. Menampilkan elemen teratas");
            System.out.println("3. Menampilkan elemen terendah");
            System.out.println("4. Data yang keluar");
            System.out.println("5. Kosongkan stack");
            System.out.println("6. Keluar menu");
            System.out.println("Masukkan pilihan : ");
            int pilih = sc1.nextInt();

            switch(pilih){
                case 1:
                stk.print();
                break;
                case 2:
                stk.peek();
                stk.print();
                break;
                case 3:
                stk.getMin();
                stk.print();
                break;
                case 4:
                stk.pop();
                stk.print();
                break;
                case 5:
                stk.clear();
                stk.print();
                break;
                case 6:
                System.exit(0);
                break;

                default:
                System.out.println("Maaf, anda salah memasukkan menu pilihan");
            }
            System.out.println("Apakah ingin kembali ke menu? [Y/T]");
            ulang = sc.next();
        }while(ulang.equalsIgnoreCase("Y"));
    }
}
```
Output
<img src= img9/4.png>

