import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		double c, f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira temperatura em graus (C): ");
		c = sc.nextDouble();
		f = 1.8*c+32;
		System.out.println("A temperatura em graus (F) é " + f);
		sc.close();
	}
}
