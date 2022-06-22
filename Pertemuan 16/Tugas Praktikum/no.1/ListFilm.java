import java.util.List;
import java.util.Stack;
import java.util.Iterator;

public class ListFilm {
    List<Film> Films = new Stack<>();

    public void tambah(Film film){
        Films.add(film);
    }

    public void pop(){
        for(Iterator<Film> it = Films.iterator(); it.hasNext();){
            Film film = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+film.idFilm+", Judul Film="+film.judulFilm+", Tahun Tayang="+film.thTayang+", Director="+film.director+"}");
            }
        }
        Films.remove(Films.size()-1);
    }

    public void peek(){
        for(Iterator<Film> it = Films.iterator(); it.hasNext();){
            Film film = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+film.idFilm+", Judul Film="+film.judulFilm+", Tahun Tayang="+film.thTayang+", Director="+film.director+"}");
            }
        }
    }

    public void tampil(){
        Films.stream().forEach(film ->{
            System.out.println("" + film.toString());
        });
    }

}
