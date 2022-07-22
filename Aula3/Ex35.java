import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        double m;
        do{
            System.out.println("Montante deve ser positivo e múltiplo de 1000!");
            System.out.print("Montante: ");
            m = sc.nextDouble();
        } while(m%1000 != 0 || m<=0);
        double t;
        do{
            System.out.println("Taxa deve estar entre 0 e 5%!");
            System.out.print("Taxa: ");
            t = sc.nextDouble();
        } while(t>5 || t<0);
        for(int i = 12; i>=0; i--){
            System.out.println("Mês "+ c + ": " + m);
            m = m+t*m/100;
            c++;
        }
        sc.close();
    }
}
