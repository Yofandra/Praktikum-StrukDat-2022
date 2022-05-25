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

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if(listMhs[j].nama.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos){
        if (pos!= -1){
            System.out.println("data : " +x+ " ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +listMhs[pos].nim);
            System.out.println("Nama\t : " +x);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
}