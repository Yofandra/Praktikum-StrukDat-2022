public class Mahasiswa {
    String nim, nama, telf;

    public Mahasiswa(String nim, String nama, String telf){
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }

    @Override
    public String toString(){
        return nim+"\t\t"+nama+"\t\t"+telf;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+telf);
    }
}
