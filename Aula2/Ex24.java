import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante Investido (€): ");
        double m = sc.nextDouble();
        System.out.print("Taxa de Juro Mensal (%): ");
        double t = sc.nextDouble();
        for(int i=0; i<3; i++){
            m=m+(m*t/100);
        };
        System.out.print("Ao fim de 3 meses o valor será " + m);
        sc.close();
    }
}
