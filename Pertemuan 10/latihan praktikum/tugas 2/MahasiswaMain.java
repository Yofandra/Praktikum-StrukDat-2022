import java.util.Scanner;

public class MahasiswaMain {
    
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("s. Cek semua antrian");
        System.out.println("6. Cek posisi antrian data mahasiswa");
        System.out.println("7. Cek data mahasiswa pada posisi tertentu");
        System.out.println("==========================================");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc.nextInt();
        Queue x = new Queue(jumlah);

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    x.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa data = x.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen !=0 && data.ipk !=0){
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama + " " + data.absen 
                        + " " + data.ipk);
                        break;
                    }
                case 3: 
                    x.Peek();
                    break;
                case 4:
                    x.PeekRear();
                    break;
                case 5:
                    x.Print();
                    break;
                case 6:
                    System.out.print("Masukkan nim mahasiswa yang dicari ");
                    String nimCari = sc.nextLine();
                    x.PeekPosition(nimCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi data yang ingin dicari ");
                    int position = sc.nextInt();
                    x.PrintMahasiswa(position);
                    break; 
            }   
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 );
    }
}
