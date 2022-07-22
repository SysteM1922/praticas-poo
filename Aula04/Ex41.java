import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        System.out.println(str);
        String mstr = str.toLowerCase();
        String[] words = str.split("\s");
        System.out.println(mstr);
        System.out.println("Em minúsculas: "+ mstr);
        System.out.println("Último caractér: "+ str.charAt(str.length()-1));
        System.out.print("Três primeiros caractéres: ");
        for (int i=0; i < 3; i++ )
            System.out.print(str.charAt(i) + ", ");
        System.out.print("\nPalavras na frase: ");
        for (int e=0; e<words.length; e++)
            System.out.print(words[e]+ ", ");
        System.out.println("\nVerificar se a(s) palavra(s) está contida na frase");
        String w = sc.nextLine();
        if (str.contains(w))
            System.out.println("Contém!");
        else
            System.out.println("Não contém!");
        System.out.println("Adicionar Texto?");
        String pl = sc.nextLine();
        System.out.print("Nova String: "+str.concat(pl));
        sc.close();
    }
}
