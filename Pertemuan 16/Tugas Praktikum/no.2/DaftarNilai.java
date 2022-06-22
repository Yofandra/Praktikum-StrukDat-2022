import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class DaftarNilai {
    List<Mahasiswa> mahasiswam = new ArrayList<>();
    List<MataKuliah> matkulm = new ArrayList<>();
    List<Nilai> nilain = new ArrayList<>();

    public void add(Nilai nilai){
        nilain.add(nilai);
    }

    public void tampil(){
        nilain.stream().forEach(nilai -> {
            System.out.println("" + nilai.toString());
        });
    }

    public void get(String nim){
        for(Iterator<Nilai> it = nilain.iterator(); it.hasNext();){
            Nilai nilai = it.next();
            if (nim.equals(nilai.nim)) {
                System.out.println("Nim\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                nilai.print();
                System.out.println("Total SKS " + nilai.sks + " telah diambil.");
            }
        }
    }

    public void sort(){
        Double[] sr = new Double[nilain.size()];
        int x=0;
        for (Nilai nilai : nilain) {
            sr[x] = nilai.nilai;
            x++;
        }
        for (int i = 0; i < sr.length-1; i++) {
            for (int j = 1; j < sr.length-i; j++) {
                if(sr[j-1] > sr[j]){
                    Double temp = sr[j-1];
                    sr[j-1] = sr[j];
                    sr[j] = temp; 
                }
            }
        }
        for(int i=0; i<sr.length; i++){
            for (Nilai nilai : nilain) {
                if(nilai.nilai==sr[i]){
                    nilai.print();
                }
            }
        }
    }
    
}
