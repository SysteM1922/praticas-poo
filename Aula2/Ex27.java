import java.util.Scanner;
import java.lang.Math;

public class Ex27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenadas P1 (x): ");
        double p1x = sc.nextDouble();
        System.out.print("Coordenadas P1 (y): ");
        double p1y = sc.nextDouble();
        System.out.print("Coordenadas P2 (x): ");
        double p2x = sc.nextDouble();
        System.out.print("Coordenadas P2 (y): ");
        double p2y = sc.nextDouble();
        double d = Math.sqrt(Math.pow((p2x-p1x), 2)+Math.pow((p2y-p1y), 2));
        System.out.print("Distância entre P1 e P2 é " + d);
        sc.close();
    }
}
