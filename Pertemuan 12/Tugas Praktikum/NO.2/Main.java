import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("=================================");
        System.out.println(" Data film layar lebar");
        System.out.println("=================================");
        System.out.println("1. Tambah Data awal");
        System.out.println("2. Tambah Data akhir");
        System.out.println("3. Tambah Data index tertentu");
        System.out.println("4. Hapus Data awal");
        System.out.println("5. Hapus Data akhir");
        System.out.println("6. Hapus Data index tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari Id Film");
        System.out.println("9. Urut data rating film desc");
        System.out.println("10. Keluar");
        }
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            Film fm = new Film();
            int idFilm, index;
            String Judul;
            double rate;
            String ulang;
            do {
                menu();
                System.out.println("Pilih menu: ");
                int pilih = sc.nextInt();
                sc.nextLine();
                switch (pilih) {
                case 1:
                    System.out.println("===================");
                    System.out.println("id Film: ");
                    idFilm = sc.nextInt();
                    System.out.println("Judul film: ");
                    Judul = sc1.nextLine();
                    System.out.println("rating film");
                    rate = sc.nextDouble();
                    fm.addFirst(idFilm, Judul, rate);
                    break;

                case 2:
                    System.out.println("===================");
                    System.out.println("id Film: ");
                    idFilm = sc.nextInt();
                    System.out.println("Judul film: ");
                    Judul = sc1.nextLine();
                    System.out.println("rating film");
                    rate = sc.nextDouble();
                    fm.addLast(idFilm, Judul, rate);
                    break;

                case 3:
                    System.out.println("===================");
                    System.out.println("id Film: ");
                    idFilm = sc.nextInt();
                    System.out.println("Judul film: ");
                    Judul = sc1.nextLine();
                    System.out.println("rating film");
                    rate = sc.nextDouble();
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    index = sc.nextInt();
                    fm.add(idFilm, Judul, rate, index);
                    break;

                case 4:
                    System.out.println("======================");
                    fm.removeFirst();
                    break;

                case 5:
                    System.out.println("=========================");
                    fm.removeLast();
                    break;

                case 6:
                    System.out.println("=========================");
                    index = sc.nextInt();
                    fm.remove(index);
                    break;

                case 7:
                    System.out.println("=========================");
                    fm.print();

                case 8:
                    System.out.println("=========================");
                    System.out.println("Id Film: ");
                    idFilm = sc.nextInt();
                    fm.cari(idFilm);
                    break;

                case 9:
                    System.out.println("=========================");
                    System.out.println("Urutan rating film");
                    System.out.println("=========================");
                    fm.BubleShort();
                    break;

                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf anda salah memasukkan menupilihan");
                }
                System.out.println("Apakah anda ingin kembali ke menuutama? [Y/T]");
                ulang = sc.next();
            } while (ulang.equalsIgnoreCase("Y"));
            sc.close();
            sc1.close();
        }
}
