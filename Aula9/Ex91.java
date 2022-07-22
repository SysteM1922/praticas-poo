import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
import Ex61.*;

public class Ex91 {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        
        System.out.println(c2.contains("Calor"));
        System.out.println(c2.contains("Chuva"));
        System.out.println(c2.contains("Bitoque"));

        System.out.println(c2.indexOf("Vento"));
        System.out.println(c2.indexOf("Chuva"));

        c2.add("Chuva");
        System.out.println(c2.lastIndexOf("Chuva"));

        System.out.println(c2.subList(1,3));

        System.out.println(c2.set(2, "Granizo"));
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Gui", 300, new Data(19, 3, 2002)));
        c3.add(new Pessoa("Rodri", 301, new Data(17, 7, 2004)));
        c3.add(new Pessoa("Ana", 200, new Data(7, 1, 2002)));
        c3.add(new Pessoa("Mariana", 303, new Data(15, 7, 2002)));
        c3.add(new Pessoa("Nelson", 100, new Data(30, 8, 1975)));
        c3.add(new Pessoa("Nelson", 100, new Data(30, 8, 1975)));
        c3.add(new Pessoa("Ana", 200, new Data(8, 1, 2002)));
        Iterator<Pessoa> it = c3.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        Set<Data> c4 = new TreeSet<>(); 
        c4.add(new Data(19, 3, 2002));
        c4.add(new Data(17, 7, 2004));
        c4.add(new Data(7, 1, 2002));
        c4.add(new Data(15, 7, 2002));
        c4.add(new Data(30, 8, 1975));
        c4.add(new Data(31, 8, 1975));
        Iterator<Data> dt = c4.iterator();
        while(dt.hasNext())
            System.out.println(dt.next());
    }
}

