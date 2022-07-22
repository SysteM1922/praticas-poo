import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        int digits = countDigits(str);
        System.out.println("Dígitos: "+digits);
        int spaces = countSpaces(str);
        System.out.println("Espaços: "+spaces);
        boolean uc = isUpper(str);
        if (uc == true)
            System.out.println("A string contém maiúsculas.");
        else
            System.out.println("A string não contém maiúsculas.");
        String ns = assertSpaces(str);
        System.out.println("String asssertada: "+ns);
        boolean ip = isPalindrome(str);
        if (ip == true)
            System.out.print("A string é um palíndromo");
        else
            System.out.print("A string não é um palíndromo");
        sc.close();
    }

    public static int countDigits(String s){
        int c = 0;
        for (int i=0; i<s.length(); i++){
            char t = s.charAt(i);
            if (Character.isDigit(t)==true)
                c++;
        } 
        return c;
    }

    public static int countSpaces(String s){
        int c = 0;
        for (int i=0; i<s.length(); i++){
            char t = s.charAt(i);
            if (t==' ')
                c++;
        }
        return c;
    }

    public static boolean isUpper(String s){
        boolean v = false;
        for(int i=0; i<s.length(); i++){
            char t = s.charAt(i);
            if(Character.isUpperCase(t)){
                v = true;
                break;
            }
        }
        return v;
    }

    public static String assertSpaces(String s){
        s = s.replaceAll("\s+", " ");
        return s;
    }

    public static boolean isPalindrome(String s){
        boolean v;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0;i--)
            sb.append(s.charAt(i));
        String ns = sb.toString();
        if (ns.equals(s))
            v = true;
        else
            v = false;
        return v;
    }
}
