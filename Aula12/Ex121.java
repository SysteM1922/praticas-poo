import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.IOException;

public class Ex121 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("src/Aula11/aula11/major.txt"));
        Set<String> palavras = new HashSet<>();
        int c = 0;
        while(input.hasNextLine()){
            String[] linha = input.nextLine().split("[\\\t\n .,:'‘’;?!-*{}=+&/()\\[\\]”“\"\']+");
            for(String p:linha){
                c+=1;
                palavras.add(p.toLowerCase());
            }
        }
        System.out.println("Número Total de Palavras: "+c);
        System.out.println("Número de Diferentes Palavras: "+palavras.size());
    }
}
