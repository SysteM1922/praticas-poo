import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nP = -1;
        double nT = -1;
        double nF;
        System.out.print("notaP: ");
        nP = sc.nextDouble();
        while (0>nP || nP>20){ 
            System.out.println("Valor da nota deve estar entre 0 e 20!");
            System.out.print("notaP: ");
            nP = sc.nextDouble();
        }
        System.out.print("notaT: ");
        nT = sc.nextDouble();
        while (0>nT || nT>20){ 
            System.out.println("Valor da nota deve estar entre 0 e 20!");
            System.out.print("notaT: ");
            nT = sc.nextDouble();
        }
        if (nP<7.0 || nT<7.0)
            nF = 66;
        else
            nF = 0.4*nT + 0.6*nP;
        System.out.printf("Nota final: %.0f", nF);
        sc.close();
    }
}
