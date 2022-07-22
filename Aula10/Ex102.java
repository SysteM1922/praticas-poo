import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.lang.Math;
import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] k = {"Branco", "Verde", "Azul", "Amarelo", "Vermelho"};
        ArrayList<ArrayList<String>> v = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("Cor da Neve", "Cor da parede", "Cor da cadeira")),
            new ArrayList<>(Arrays.asList("Cor das Ervas", "Cor da Base")),
            new ArrayList<>(Arrays.asList("Cor do Céu", "Cor da Colcha", "Cor da Mola", "Cor das calças")),
            new ArrayList<>(Arrays.asList("Cor da mesa do comboio", "Cor do tapete")),
            new ArrayList<>(Arrays.asList("Cor da Ferrugem", "Cor dos fones"))));
        Map<String, ArrayList<String>> m = new TreeMap<>();
        for(int i=0; i<k.length; i++)
            m.put(k[i], v.get(i));
        System.out.println(m.toString());

        String t = k[(int) (Math.random()*k.length)];
        System.out.println(t+" = "+random(m, t));
        
        System.out.print("Termo: ");
        t = sc.next();
        System.out.println(t+" = "+random(m, t));
        sc.close();
    }

    public static String random(Map<String, ArrayList<String>> m, String t){
        ArrayList<String> v = m.get(t);
        String r = v.get((int) (Math.random()*v.size()));
        return r;
    }
}
