import java.util.Scanner;

public class tugas2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int menu;
        do{
            System.out.println("PROGRAM PENGHITUNG RUMUS KECEPATAN, JARAK, WAKTU");
            System.out.println("-------------------------------------------------");
            System.out.println("Menu :");
            System.out.println("1. Rumus Kecepatan");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Waktu");
            System.out.println("4. Keluar Dari Program");
            System.out.println("Pilihan Menu Anda(1 / 2 / 3 / 4)");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                    System.out.println("Menu 1. Menampilkan Perhitungan Rumus Kecepatan");
                    kecepatan();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Menampilkan Perhitungan Rumus Jarak");
                    jarak();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Menampilkan Perhitungan Rumus Waktu");
                    waktu();
                }break;
                case 4 : {
                    System.out.println("Exit");
                }
            }
        }while(menu > 0 && menu <= 3);
    }

    private static void kecepatan(){
        double hasil, s, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        s = sc.nextDouble();
        System.out.print("Masukkan waktu: ");
        t = sc.nextDouble();
        hasil = s/t;
        System.out.println("Kecepatan (v): " + hasil);
        System.out.println();
    }

    private static void jarak(){
        double hasil, v, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan: ");
        v = sc.nextDouble();
        System.out.print("Masukkan waktu: ");
        t = sc.nextDouble();
        hasil = v*t;
        System.out.println("Jarak (s): " + hasil);
        System.out.println();
    }

    private static void waktu(){
        double hasil, s, v;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        s = sc.nextDouble();
        System.out.print("Masukkan kecepatan: ");
        v = sc.nextDouble();
        hasil = s/v;
        System.out.println("Waktu (v): " + hasil);
        System.out.println();
    }
}