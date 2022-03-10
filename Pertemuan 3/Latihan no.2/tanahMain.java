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
