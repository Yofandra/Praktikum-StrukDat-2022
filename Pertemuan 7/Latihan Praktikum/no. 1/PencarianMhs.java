public class PencarianMhs{
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m:listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }

    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return(mid);
            }else if(listMhs[mid].nim>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1){
            System.out.println("data : " +x+ " ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +x);
            System.out.println("Nama\t : " +listMhs[pos].nama);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
}