import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Intervalo de tempo (s): ");
        int t = sc.nextInt();
        int h = t/3600;
        int m = t%3600/60;
        int s = t%3600%60;
        String sh = String.valueOf(h);
        String sm = String.valueOf(m);
        String ss = String.valueOf(s);
        if (sh.length()<2){
            sh = "0"+sh;
        }
        if (sm.length()<2){
            sm = "0"+sm;
        }
        if (ss.length()<2){
            ss = "0"+ss;
        }
        System.out.printf(sh + ":" + sm + ":" + ss);
        sc.close();
    }
}
