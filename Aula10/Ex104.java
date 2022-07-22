import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Ex104 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("src/Aula10/words.txt"));
        Set<String> s = new HashSet<>();
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if(word.length()>2)
                s.add(word);
        }
        System.out.println("\nPalavras com mais de 2 caracteres 's':");
        System.out.println(s);
        System.out.println("\nPalavras terminadas em 's':");
        for(String st: s){
            if(st.endsWith("s"))
                System.out.println(st);
        }
        Set<String> re = new HashSet<>();
        System.out.println("");
        for(String st: s){
            for(int i=0; i<st.length(); i++){
                if(!Character.isLetter(st.charAt(i))){
                    re.add(st);
                    break;
                }
            }
        }
        for(String r: re)
            s.remove(r);
        System.out.println(s);
    }
}
