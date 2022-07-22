import Ex112.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.File;

public class Ex112 {
    public static void main(String[] args) throws IOException{
        Scanner input1 = new Scanner(new File("src/Aula11/aula11/voos.txt"));
        Scanner input2 = new Scanner(new File("src/Aula11/aula11/companhias.txt"));
        PrintWriter out = new PrintWriter(new File("src/Aula11/aula11/Infopublico.txt"));
        ArrayList<Voo> voos = new ArrayList<>();
        HashMap<String, String> companhias = new HashMap<>();
        HashMap<String, HashSet<int[]>> atrasos = new HashMap<>();
        TreeMap<Integer, ArrayList<String>> atrasoMedio = new TreeMap<>();
        TreeMap<Integer, ArrayList<String>> cidades = new TreeMap<>(Collections.reverseOrder());
        TreeMap<String, Integer> cidades0 = new TreeMap<>();
        input1.nextLine();
        while(input1.hasNextLine()){
            String[] voo = input1.nextLine().split("\t");
            if(voo.length==3)
                voos.add(new Voo(voo[0], voo[1], voo[2]));
            else
                voos.add(new Voo(voo[0], voo[1], voo[2], voo[3]));
        }
        while(input2.hasNextLine()){
            String[] ls = input2.nextLine().split("\t");
            companhias.put(ls[0], ls[1] );
        }
        System.out.printf("%-8s%-10s%-20s%-22s%-8s%-16s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        out.printf("%-8s%-10s%-20s%-22s%-8s%-16s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        for(int i=1; i<voos.size(); i++ ){
            System.out.printf("%-8s%-10s%-20s%-22s%-8s%-16s\n", voos.get(i).getHoras(), voos.get(i).getVoo(), voos.get(i).getCompanhia(), voos.get(i).getOrigem(), voos.get(i).getAtraso(), voos.get(i).getObs());
            out.printf("%-8s%-10s%-20s%-22s%-8s%-16s\n", voos.get(i).getHoras(), voos.get(i).getVoo(), voos.get(i).getCompanhia(), voos.get(i).getOrigem(), voos.get(i).getAtraso(), voos.get(i).getObs());
        }
        out.close();
        System.out.print("\n");
        for(Voo voo:voos){
            if(!atrasos.containsKey(voo.getCompanhia()))
                atrasos.put(voo.getCompanhia(), new HashSet<>());
            if(!voo.getAtraso().equals(""))
                atrasos.get(voo.getCompanhia()).add(voo.convertSI(voo.getAtraso()));
            else
                atrasos.get(voo.getCompanhia()).add(new int[]{0, 0});
        }
        
        for(String co: atrasos.keySet()){
            int at=0;
            for(int[] atr: atrasos.get(co)){
                at+=atr[0]*60+atr[1];
            }
            at/=atrasos.get(co).size();
            if(!atrasoMedio.containsKey(at))
                atrasoMedio.put(at, new ArrayList<>());
            atrasoMedio.get(at).add(co);
        }
        System.out.printf("%-10s%-12s\n", "Companhia", "Atraso Médio");
        for(int i:atrasoMedio.keySet()){
            for(int c=0; c<atrasoMedio.get(i).size(); c++){
                String prt="";
                if(i>=60 && i<600)
                    prt+="0"+String.valueOf(i/60)+":"+String.valueOf(i%60);
                else if(i>=600)
                    prt+=String.valueOf(i/60)+":"+String.valueOf(i%60);
                else if(i<10)
                    prt+="00:0"+String.valueOf(i);
                else
                prt+="00:"+String.valueOf(i);
                System.out.printf("%-10s%-12s\n", atrasoMedio.get(i).get(c), prt);
            }
        }
        PrintWriter out1 = new PrintWriter(new File("src/Aula11/aula11/cidades.txt"));
        for(Voo v:voos){
            if(!cidades0.containsKey(v.getOrigem()))
                cidades0.put(v.getOrigem(), 1);
            else
                cidades0.put(v.getOrigem(), cidades0.get(v.getOrigem())+1);
        }
        for(String s:cidades0.keySet()){
            if(!cidades.containsKey(cidades0.get(s)))
                cidades.put(cidades0.get(s), new ArrayList<>());
            cidades.get(cidades0.get(s)).add(s);
        }
        out1.printf("%-22s%-4s\n", "Origem", "Voos");
        for(int i: cidades.keySet()){
            for(String s: cidades.get(i))
                out1.printf("%-22s%-4s\n", s, i);
        }
        out1.close();
    }
}
