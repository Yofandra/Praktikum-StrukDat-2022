public class NodeFilm {
    int idFilm;
    String Judul;
    double rate;
    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, int idFilm, String judul, double rate,NodeFilm next) {
        this.prev = prev;
        this.idFilm = idFilm;
        this.Judul = judul;
        this.rate = rate;
        this.next = next;
    }
}
