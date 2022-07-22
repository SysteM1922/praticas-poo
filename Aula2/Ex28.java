import java.util.Scanner;
import java.lang.Math;

public class Ex28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Comprimento Cateto 1: ");
        double c1 = sc.nextDouble();
        System.out.print("Comprimento Cateto 2: ");
        double c2 = sc.nextDouble();
        double h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.printf("Hipotenusa: %.2f\n", h);
        double a = Math.acos(c1/h)*180/Math.PI;
        System.out.printf("Ângulo entre H e C1 (º): %.2f", a);
        sc.close();
    }
}
