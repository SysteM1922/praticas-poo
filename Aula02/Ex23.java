import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de água (kg): ");
        double m = sc.nextDouble();
        System.out.print("Temperatura Inicial (C): ");
        double ti = sc.nextDouble();
        System.out.print("Temperatura Final (C): ");
        double tf = sc.nextDouble();
        double q = m*(tf-ti)*4184;
        System.out.print("São necessários " + q + " J");
        sc.close();
    }
}
