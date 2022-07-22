import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Contar a partir de: ");
        int l = sc.nextInt();
        for(int v = 0; l>=v; l--)
            System.out.println(l);
        sc.close();
    }
}
