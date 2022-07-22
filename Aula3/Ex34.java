import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        double n1 = sc.nextDouble();
        double n;
        double max = n1;
        double min = n1;
        do{
            System.out.print("Número: ");
            n = sc.nextDouble();
            if(n>max)
                max=n;
            if(n<min)
                min=n;
        }while (n1!=n);
        System.out.println("Número máximo da lista: "+ max);
        System.out.println("Número máximo da lista: "+ min);
        sc.close();
    }
    
}
