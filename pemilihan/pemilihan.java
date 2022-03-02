import java.util.Scanner;

public class pemilihan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nilaiTugas, nilaiUAS, nilaiUTS;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        nilaiAkhir = (nilaiTugas*0.2) + (nilaiUTS*0.35) + (nilaiUAS*0.45);
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        System.out.print("Nilai Huruf: ");
        if(nilaiAkhir>=81 && nilaiAkhir<=100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }else if(nilaiAkhir>=74 && nilaiAkhir<=80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf: " + nilaiHuruf); 
        }else if(nilaiAkhir>=66 && nilaiAkhir<=73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf: " + nilaiHuruf);      
        }else if(nilaiAkhir>=61 && nilaiAkhir<=65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }else if(nilaiAkhir>=51 && nilaiAkhir<=60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }else if(nilaiAkhir>=40 && nilaiAkhir<=50){
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }else{
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }
        System.out.println("==============================");
        if(nilaiHuruf.equals("D") || nilaiHuruf.equals("E")){
            System.out.print("ANDA TIDAK LULUS");
        }else{
            System.out.print("SELAMAT LULUS");
        }

    }
}