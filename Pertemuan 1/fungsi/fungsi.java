public class fungsi{
    public static void main(String[] args){

        stockBungaTabel();
        stockBungaCabang();
    }
        static void stockBungaTabel(){
            int[][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
            };
            System.out.println("1. Stock bunga sesuai tabel");
            System.out.println("                     Algonema         Keladi          Alocasia        Mawar");
            System.out.println("RoyaleGarden1" + "\t|\t" + bunga[0][0] + "\t|\t" + bunga[0][1] + "\t|\t" + bunga[0][2] + "\t|\t" + bunga[0][3] );
            System.out.println("RoyaleGarden2" + "\t|\t" + bunga[1][0] + "\t|\t" + bunga[1][1] + "\t|\t" + bunga[1][2] + "\t|\t" +bunga[1][3]);
            System.out.println("RoyaleGarden3" + "\t|\t" + bunga[2][0] + "\t|\t" + bunga[2][1] + "\t|\t" + bunga[2][2] + "\t|\t" + bunga[2][3]);
            System.out.println("RoyaleGarden4" + "\t|\t" + bunga[3][0] + "\t|\t" + bunga[3][1] + "\t|\t" + bunga[3][2] + "\t|\t" + bunga[3][3]);
            System.out.println();
        }

        static void stockBungaCabang(){
            int[][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
            };
            int aglonema = 0;
            int keladi = 0;
            int alocasia = 0;
            int mawar = 0;
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
            System.out.println("2. Jumlah stock berdasarkan jenis bunga di seluruh cabang ") ;
            System.out.println("Jumlah btock bunga Aglonema \t: " + aglonema) ;
            System.out.println("Jumlah btock bunga Keladi \t: " + keladi) ;
            System.out.println("Jumlah btock bunga Alocasia \t: " + alocasia) ;
            System.out.println("Jumlah btock bunga Mawar \t: " + mawar  ) ;
        }
}
