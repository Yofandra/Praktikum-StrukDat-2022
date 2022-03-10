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