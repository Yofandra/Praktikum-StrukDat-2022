import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListFilm lf = new ListFilm();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int i=0;
        while(i<1){
            System.out.println("================================");
            System.out.println("Daftar Film Layar Sepanjang Masa");
            System.out.println("================================");
            System.out.println("1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info Semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.print("ID Film : ");
                String idFilm = input.nextLine();
                System.out.print("Judul Film : ");
                String judulFilm = input.nextLine();
                System.out.print("Tahun Tayang : ");
                String thTayang = input.nextLine();
                System.out.print("Director : ");
                String director = input.nextLine();
                Film film = new Film(idFilm, judulFilm, thTayang, director);
                lf.tambah(film);
            } else if (pilih==2) {
                lf.pop();
            } else if (pilih==3) {
                lf.peek();
            } else if (pilih==4) {
                lf.tampil();
            } else {
                i++;
            }
        }
    }
}
