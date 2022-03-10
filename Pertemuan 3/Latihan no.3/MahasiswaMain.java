import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] ms = new Mahasiswa[3];
        for(int i=0; i<3; i++){
        ms[i] = new Mahasiswa();
        }
        for(int i=0; i<3; i++){
            System.out.println("\nMasukkan data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            ms[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM : ");
            ms[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            ms[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            ms[i].ipk = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println("Data Mahasiswa ke " +(i+1));
            System.out.println("nama : "+ms[i].nama);
            System.out.println("NIM : " +ms[i].nim);
            System.out.println("Jenis kelamin : " +ms[i].jenisKelamin);
            System.out.println("Nilai IPK : " +ms[i].ipk);
        }
    }
}
