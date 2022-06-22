public class MataKuliah {
    String kode, matkul, sks;

    public MataKuliah(String kode, String matkul, String sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }

    @Override
    public String toString(){
        return kode+"\t\t"+matkul+"\t\t"+sks;
    }

    public void print(){
        System.out.println(kode+"\t\t"+matkul+"\t\t"+sks);
    }


}
