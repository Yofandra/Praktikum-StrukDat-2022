public class Film {
    String idFilm, judulFilm, thTayang, director;

    public Film(){
    }

    public Film(String idFilm, String judulFilm, String thTayang, String director){
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.thTayang = thTayang;
        this.director = director;
    }

    @Override
    public String toString(){
        return "Film{" + "ID Film=" + idFilm + ", Judul Film=" + judulFilm + ", Tahun Tayang=" + thTayang + ", Director=" + director +'}';
    }
}
