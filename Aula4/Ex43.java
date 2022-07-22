import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza uma frase: ");
        String s = sc.nextLine();
        String[] arr = s.split("\s");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if (arr[i].length()>3)
                sb.append(arr[i].toUpperCase().charAt(0));
        }
        String a = sb.toString();
        System.out.print("Acrónimo: "+a);
        sc.close();
    }
}
