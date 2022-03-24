import java.util.Scanner;

public class latihanMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Pemilihan Suara Ketua BEM Tahun 2022");
        System.out.println("================================================");
        latihan bem = new latihan();
        latihan[] arr = new latihan[bem.jumlahKandidat];

        for(int i=0; i<bem.jumlahKandidat; i++){
            arr[i] = new latihan();
            System.out.print("Nama Kandidat ke- " +(i+1)+ " : ");
            arr[i].namaKandidat = sc.nextLine();
        }
        System.out.println("================================================");
        for(int i=0; i<bem.jumlahKandidat; i++){
            System.out.print("Jumlah Suara Kandidat ke- " +(i+1)+ " : ");
            arr[i].suara = sc.nextInt();
            bem.jumlahSuara += arr[i].suara;
        }
        System.out.println("================================================");
        int hasil = bem.Hitung(bem.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if(hasil==0){
            System.out.println("Masing-masing Kandidat memiliki jumlah suara sama");
        }else{
            System.out.println("Ketua BEM yang terpilih adalah : " +arr[hasil-1].namaKandidat);
        }
    }
}
