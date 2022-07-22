import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Ex111 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("src/Aula11/aula11/major.txt"));
            TreeMap<String, TreeMap<String, Integer>> pares = new TreeMap<>();
            ArrayList<String> words = new ArrayList<>();
            while(input.hasNextLine()){
                String[] line = input.nextLine().split("[\\\t\n .,:'‘’;?!-*{}=+&/()\\[\\]”“\"\']+");
                for(String word: line){
                    if(word.length()>=3)
                        words.add(word.toLowerCase());
                }
            }
            for(int c=0; c<words.size()-1; c++){
                if(!pares.containsKey(words.get(c)))
                    pares.put(words.get(c), new TreeMap<>());
                if(pares.get(words.get(c)).containsKey(words.get(c+1)))
                    pares.get(words.get(c)).put(words.get(c+1), pares.get(words.get(c)).get(words.get(c+1))+1);
                else
                    pares.get(words.get(c)).put(words.get(c+1), 1);
            }
            for(String key: pares.keySet())
                System.out.println(key+"="+pares.get(key));
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
