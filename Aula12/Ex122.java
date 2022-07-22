import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import Ex122.*;

public class Ex122 {
    public static void main (String[] args) throws IOException{
        Scanner input = new Scanner(new File("src/Aula12/movies.txt"));
        Set<Movie> list = new TreeSet<>();
        input.nextLine();
        while(input.hasNextLine()){
            String[] mv = input.nextLine().split("\t");
            list.add(new Movie(Double.parseDouble(mv[1]), mv[0], mv[2], mv[3], Integer.parseInt(mv[4])));
        }
        input.close();
        for(Movie m: list){System.out.println(m);}
        System.out.println("\n");

        TreeSet<Movie> comparadorScore = new TreeSet<>(new ComparadorScore().reversed());
        comparadorScore.addAll(list);
        System.out.println("Ordenar por Score");
        for(Movie m: comparadorScore){System.out.println(m);}
        System.out.println("\n");

        TreeSet<Movie> comparadorRT = new TreeSet<>(new ComparadorRT());
        comparadorRT.addAll(list);
        System.out.println("Ordenar por Running Time");
        for(Movie m: comparadorRT){System.out.println(m);}
        System.out.println("\n");

        Set<String> genres = new HashSet<>();
        for(Movie m: list){genres.add(m.getGenre());}
        System.out.println("Genres");
        System.out.println(genres);

        PrintWriter pw = new PrintWriter(new File("src/Aula12/myselection.txt"));
        for(Movie m: list){
            if(m.getGenre().equals("comedy") && m.getScore()>60)
                pw.println(m.getName()+"\t"+m.getScore()+"\t"+m.getRating()+"\t"+m.getGenre()+"\t"+m.getRt());
        }
        pw.close();
    }
}
