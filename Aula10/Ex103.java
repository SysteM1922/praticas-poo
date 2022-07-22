import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character, ArrayList<Integer>> m = new HashMap<>();
        System.out.print("String: ");
        String in = sc.nextLine();
        for(int i=0; i<in.length(); i++){
            if(!m.containsKey(in.charAt(i)))
                m.put(in.charAt(i), new ArrayList<>(Arrays.asList(i)));
            else
                m.get(in.charAt(i)).add(i);
        }
        System.out.println(m);
        sc.close();
    }
}
