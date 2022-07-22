package Ex122;
import java.util.Comparator;

public class ComparadorRT implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        return Integer.compare(m1.getRt(), m2.getRt());
    }
}
