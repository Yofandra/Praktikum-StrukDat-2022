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