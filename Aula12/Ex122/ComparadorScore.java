package Ex122;
import java.util.Comparator;

public class ComparadorScore implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        return Double.compare(m1.getScore(), m2.getScore());
    }
}
