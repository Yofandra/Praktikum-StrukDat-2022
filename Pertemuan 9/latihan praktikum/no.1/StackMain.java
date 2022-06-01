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

    
