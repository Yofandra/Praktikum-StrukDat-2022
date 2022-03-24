public class latihan {
    public int suara;
    public int jumlahSuara = 0;
    public int jumlahKandidat = 4;
    public  String namaKandidat;
    public static int control = 0; 
    public static int nilai = 1; 
    public static int accept = 0; 
    public static int accept2 = 0;
    public static int array[] = new int[10000];

    public static int Hitung(int js, int a, int b, int c, int d){
        if(nilai==5){
            nilai = 1;
        }
        if(nilai==1 && a>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a-1, b, c, d);
        }else if(nilai==2 && b>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a, b-1, c, d);
        }else if(nilai==3 && c>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a, b, c-1, d);
        }else if(nilai==4 && d>0){
            array[control]=nilai;
            control++;
            nilai++;
            return Hitung(js, a, b, c, d-1);
        }else if(a==0 && b==0 && c==0 && d==0){
            if (array[accept] == array[accept + 1] && accept + 1 < js){
                return array[accept];
            }else if(accept +2<js){
                accept += 2;
                return Hitung(js,a,b,c,d);
            }else{
                return 0;
            }
        }else{
            nilai++;
            return Hitung(js,a,b,c,d);
        }
    }
}
