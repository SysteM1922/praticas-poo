import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.io.PrintWriter;
import Ex132.*;

public class Ex132 {
    public static void main (String[] args) throws IOException{
        Scanner input = new Scanner(new File("src/Aula13/notas.txt"));
        Set<Student> students = new HashSet<>();
        while(input.hasNextLine()){
            String line = input.nextLine();
            if(!line.startsWith("*")){
                String[] dados = new String[5];
                String[] l = line.split("\t");
                for(int i=0; i<l.length; i++){
                    dados[i]=l[i];
                }
                students.add(new Student(dados[0], dados[1], dados[2], dados[3], dados[4]));
            }
        }
        PrintWriter pw = new PrintWriter(new File("src/Aula13/Results.txt"));
        for(int i=0; i<=20; i++){
            int n=0;
            for(Student s: students){
                if(s.getNF()==i)
                    n+=1;
            }
            pw.println(i+" : "+n);
        }
        double mf=0;
        int n=0;
        for(Student s: students){
            if(s.getNF()>=0){
                mf+=s.getNF();
                n+=1;
            }
        }
        mf=mf/n;
        pw.printf("Média final : %2.2f\n", mf);
        pw.close();
    }
}
