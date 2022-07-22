import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;

public class Ex131 {
    public static void main (String[] args) throws IOException{
        Scanner input = new Scanner(new File("src/Aula13/qdv.txt"));
        Map<String, ArrayList<Double>> info = new HashMap<>();
        while(input.hasNextLine()){
            String line=input.nextLine();
            if(!line.startsWith("#")){
                String[] dados = line.split("\t");
                if(!info.containsKey(dados[0]))
                    info.put(dados[0], new ArrayList<>());
                info.get(dados[0]).add(Double.parseDouble(dados[1].replace(",", ".")));
            }
        }
        double m=0;
        for(ArrayList<Double> v:info.values()){
            int c=0;
            for(Double d: v){
                m+=d;
                c+=1;
            }
            m/=c;
        }
        System.out.printf("Média: %3.2f\n",m);
        System.out.println("Localidades: "+info.keySet());
        for(String c: info.keySet()){
            double v=0;
            for(Double d: info.get(c)){
                v+=d;
            }
            System.out.printf(c+"(%2d): %3.2f\n",info.get(c).size(),v/info.get(c).size());
        }
    }
}
