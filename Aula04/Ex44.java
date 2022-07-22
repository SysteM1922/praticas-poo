import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        int[] values = scanner();
        int d = month(values);
        int[] val = { values[0], values[1], values[2], d };
        impress(val);
    }

    public static int[] scanner() {
        System.out.print("Dia da semana começa o mês (Segunda Feira = 2): ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.print("Mês: ");
        int m = sc.nextInt();
        System.out.print("Ano: ");
        int a = sc.nextInt();
        int[] r = { d, m, a };
        sc.close();
        return r;
    }

    public static int month(int[] m) {
        int nd = 0;
        String m31 = "4,6,9,11";
        if (m31.contains(String.valueOf(m[1])))
            nd = 30;
        else if (m[1] == 2) {
            if ((m[2] % 4 == 0 && m[2] % 100 != 0) || (m[2] % 400 == 0))
                nd = 29;
            else
                nd = 28;
        } else
            nd = 31;
        return nd;
    }

    public static void impress(int[] v) {
        String mes = "";
        switch (v[1]) {
        case (1):
            mes = "January";
            break;
        case (2):
            mes = "February";
            break;
        case (3):
            mes = "March";
            break;
        case (4):
            mes = "April";
            break;
        case (5):
            mes = "May";
            break;
        case (6):
            mes = "June";
            break;
        case (7):
            mes = "July";
            break;
        case (8):
            mes = "August";
            break;
        case (9):
            mes = "September";
            break;
        case (10):
            mes = "October";
            break;
        case (11):
            mes = "November";
            break;
        case (12):
            mes = "December";
            break;
        }
        for (int i = 20; i - (mes.length() + String.valueOf(v[2]).length() + 1) > 0; i -= 2)
            System.out.print(" ");
        System.out.printf("%s %d", mes, v[2]);
        System.out.println("\nSu Mo Tu We Th Fr Sa");
        for (int i = -v[0] + 2; i <= v[3]; i++) {
            if (i < 1)
                System.out.print("   ");
            else if ((i + v[0] - 1) % 7 == 0)
                System.out.printf("%2d\n", i);
            else
                System.out.printf("%2d ", i);
        }
    }

}
