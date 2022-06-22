public class Nilai {
    String nim, nama, matkul, sks;
    Double nilai;

    public Nilai(String nim, String nama, String matkul, String sks, Double nilai){
        this.nim = nim;
        this.nama = nama;
        this.matkul = matkul;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public String toString(){
        return nim+"\t\t"+nama+"\t\t"+matkul+"\t"+sks+"\t"+nilai;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+matkul+"\t"+sks+"\t"+nilai);
    }

}
    

