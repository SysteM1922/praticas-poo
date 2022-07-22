import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int v1 = sc.nextInt();
        int v2 = v1;
        boolean c = true;
        for (int i = 0; v1>i; v1--)
            if (v2%v1==0 && v1!=v2 && v1!=1){
                c = false;
                break;
            }
        if (c==true)
            System.out.print("É número primo.");
        else
            System.out.print("Não é número primo.");
        sc.close();
    }
}
