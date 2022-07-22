import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ano: ");
        int a = sc.nextInt();
        System.out.print("Mês: ");
        int m = sc.nextInt();
        if(m==2){
            if((a%4==0 && a%100!=0) || (a%400==0))
                n=29;
            else
                n=28;
        }
        else if (m==4 || m==6 || m==9 || m==11)
            n=30;
        else
            n=31;
        System.out.print("O mês tem "+ n + " dias.");
        sc.close();
    }
}
