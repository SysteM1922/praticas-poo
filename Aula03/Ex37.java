import java.util.Scanner;
import java.util.Random;

public class Ex37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random nr = new Random();
        double i;
        String r;
        do {
            int c = 0;
            double n = nr.nextInt(100);
            do {
                System.out.print("Tentativa: ");
                i = sc.nextDouble();
                c++;
                if (i>n)
                    System.out.println("Valor demasiado alto!");
                else if (i<n)
                    System.out.println("Valor demasiado baixo!");
                else
                    System.out.println("Valor Correto!");
            } while (i!=n);
            System.out.println("Número de tentativas: "+ c);
            System.out.println("Pretende continuar? Prima (S)im");
            r = sc.next();

            if (r.equals("S") || r.equals("Sim"))
                System.out.println("A iniciar de novo...");
            else
                System.out.print("Fim");
        } while (r.equals("S") || r.equals("Sim"));
        sc.close();
    }
}
