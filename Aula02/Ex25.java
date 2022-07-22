import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade 1º Trajeto (m/s): ");
        double v1 = sc.nextDouble();
        System.out.print("Distância 1º Trajeto (m): ");
        double d1 = sc.nextDouble();
        System.out.print("Velocidade 2º Trajeto (m/s): ");
        double v2 = sc.nextDouble();
        System.out.print("Distância 2º Trajeto (m): ");
        double d2 = sc.nextDouble();
        double vm = (d1+d2)/(d1/v1 + d2/v2);
        System.out.print("Velocidade Média (m/s): " + vm );
        sc.close();
    }
}
