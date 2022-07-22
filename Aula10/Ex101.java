import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Ex101{
    public static void main(String[]  args){
        Map<String, String> hm = new HashMap<>();
        Map<String, String> tm = new TreeMap<>();
        Map<String, String> lhm = new LinkedHashMap<>();
        String[][] e = {{"Branco", "Cor da Neve"}, {"Verde", "Cor das Ervas"}, {"Azul", "Cor do Céu"}, {"Amarelo", "Cor da mesa do comboio"}, {"Vermelho", "Cor da Ferrugem"}};
        double[] HM = checkPerformance(hm, e);
        double[] TM = checkPerformance(tm, e);
        double[] LHM = checkPerformance(lhm, e);

        System.out.println("Map\t\tadd\tsearch\tremove");
        System.out.printf("\nHashMap\t\t%4.2f%10.2f%8.2f",HM[0], HM[1], HM[2]);
        System.out.printf("\nTreeMap\t\t%4.2f%10.2f%8.2f",TM[0], TM[1], TM[2]);
        System.out.printf("\nLinkedHashMap\t%4.2f%10.2f%8.2f",LHM[0], LHM[1], LHM[2]);

        Map<String, String> mp = new HashMap<>();
        for(String[] s: e)
            mp.put(s[0], s[1]);
        System.out.println("\n\n"+mp.toString());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }

    private static double[] checkPerformance(Map<String, String> m, String[][] s) {
        double start, stop, delta, add, remove, search;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(String[] st: s){
            m.put(st[0], st[1] );
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        add = delta;
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(String[] k: s) {
            if (!m.containsKey(k[0]))
                continue;
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        search = delta;
        // Remove
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<m.size(); i++){
            m.remove(s[i][0]);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        remove = delta;

        return new double[]{add, search, remove};
    }
}
