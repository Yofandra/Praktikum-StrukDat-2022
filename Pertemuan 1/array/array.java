public class array{
    public static void main(String[] args){

        int [][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9 }
        };
        int aglonema = 0;
        int keladi = 0;
        int alocasia = 0;
        int mawar = 0;
        int totalPendapatan;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (j == 0) {
                    aglonema += bunga[i][j] ;
                } else if (j == 1) {
                    keladi += bunga[i][j] ;
                } else if (j == 2) {
                    alocasia += bunga[i][j] ;
                } else {
                    mawar += bunga[i][j] ;
                }
            }
        }
        totalPendapatan = 9*75000 + 5*50000 + 60000*15 + 2*10000;
        System.out.println("A. Jumlah Stock Bunga Berdasarkan Jenis Bunga") ;
        System.out.println("Jumlah Stock Bunga Aglonema\t : " + aglonema) ;
        System.out.println("Jumlah Stock Bunga Keladi\t : " + keladi) ;
        System.out.println("Jumlah Stock Bunga Alocasia\t : " + alocasia) ;
        System.out.println("Jumlah Stock Bunga Mawar\t : " + mawar + "\n") ;
        System.out.println("B. Pendapatan RoyalGarden1 jika Semua Bunga Terjual Habis") ;
        System.out.println("Pendapatan RoyalGarden1 adalah Rp " + totalPendapatan) ;

    }
}