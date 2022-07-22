import Ex72.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class Ex72 {
    static int nj = 0;

    public static void main(String args[]) throws InterruptedException {
        Equipa eq1 = new Equipa("Equipa 1", "Jogador 1",
                new Robo[] { new Robo("Guarda-Redes 1"), new Robo("Defesa 1"), new Robo("Avancado 1") });
        Equipa eq2 = new Equipa("Equipa 2", "Jogador 2",
                new Robo[] { new Robo("Guarda-Redes 2"), new Robo("Defesa 2"), new Robo("Avancado 2") });
        Bola b = new Bola("Branca");
        Jogo j1 = new Jogo(eq1, eq2, 90);
        Jogo j2 = new Jogo(eq2, eq1, 90);
        Jogo[] jogos = new Jogo[] { j1, j2 };
        for (Jogo j : jogos) {
            simulador(b, j);
        }
    }

    public static void simulador(Bola b, Jogo j) throws InterruptedException {
        LocalDate ld = LocalDate.now();
        System.out.println("\nJogo " + ++nj + ", Dia " + ld.getDayOfMonth() + "-" + ld.getMonthValue() + "-"
                + ld.getYear() + "\n");
        printer("Início do Jogo!", 2000);
        printer("\t" + j.getGolos()[0] + " - " + j.getGolos()[1], 2000);
        for (int i = 0; i <= j.getDuracao(); i++) {
            printer(i + "'", 300);
            if ((int) (Math.random() * 5) == 0) {
                int e = (int) (Math.random() * 2);
                int ct = 0;
                int ct2;
                Robo it = new Robo("");
                for (Equipa equ : j.getEqs()) {
                    for (int k = 0; k < equ.getEq().length; k++) {
                        float x = (float) (Math.random() * (k * 1.63));
                        float y = (float) (Math.random() * 3.4);
                        if (k == 0)
                            y = (float) 1.7;
                        equ.getEq()[k].setCords(x, y);
                    }
                }
                Equipa eq = j.getEqs()[e];
                int m;
                if ((int) (Math.random() * 10) == 0) {
                    m = 0;
                    it = eq.getEq()[m];
                } else if ((int) (Math.random() * 2) == 0) {
                    m = 1;
                    it = eq.getEq()[m];
                } else {
                    m = 2;
                    it = eq.getEq()[m];
                }
                printer("\t" + it.getTipo() + " tem a bola!", 300);
                do {
                    ct = (int) (Math.random() * 4);
                    ct2 = (int) (Math.random() * 3);
                    if (ct != 0) {
                        b.setCords(it.getCords()[0], it.getCords()[1]);
                        if ((int) (Math.random() * 4) == 0) {
                            float x = it.getCords()[0];
                            float y = it.getCords()[1];
                            float X = x + (float) (Math.random() * ((float) 1.3) - (float) 0.3);
                            float Y = y + (float) (Math.random() * ((float) 1.3) - (float) 0.3);
                            if (m == 0)
                                y = (float) 1.7;
                            if (X > 4.9)
                                X = (float) 4.9;
                            if (X < 0)
                                X = 0;
                            if (Y > 3.4)
                                Y = (float) 3.4;
                            if (Y < 0)
                                Y = 0;
                            it.move(X, Y);
                            b.move(X, Y);
                            printer("\t" + it.getTipo() + " move-se de (" + x + ", " + y + ") para (" + X + ", " + Y
                                    + ")", 2000);
                        } else if ((int) (Math.random() * 3) == 0) {
                            Robo ait = it;
                            ArrayList<Robo> rnd = new ArrayList<>();
                            for (int u = 0; u < 18; u++) {
                                rnd.add(eq.getEq()[1]);
                                rnd.add(eq.getEq()[2]);
                            }
                            rnd.add(eq.getEq()[0]);
                            while (rnd.contains(ait)) {
                                rnd.remove(ait);
                            }
                            it = rnd.get((int) Math.random() * rnd.size());
                            b.move(it.getCords()[0], it.getCords()[1]);
                            printer("\t" + ait.getTipo() + " passa para " + it.getTipo(), 2000);
                        } else {
                            ct = 1;
                            ct2 = 0;
                        }
                    } else {
                        ct = 0;
                        ct2 = 0;
                    }
                } while (ct2 != 0);
                if (ct == 0)
                    printer("\t" + it.getTipo() + " perde a bola!", 2000);
                else {
                    printer("\t" + it.getTipo() + " remata!", 2000);
                    double d = Math.pow(it.getCords()[0], 2) + Math.pow(it.getCords()[1], 2);
                    double d1 = (double) (Math.random() * 1);
                    double d2 = (double) (d / (double) (Math.pow(4.9, 2) + Math.pow(1.7, 2)));
                    if (d1 <= d2) {
                        printer("\tGolo!", 2000);
                        eq.setGm(eq.getGm() + 1);
                        it.setGolos(it.getGolos() + 1);
                        ;
                        if (e == 0)
                            j.getEqs()[1].setGs(j.getEqs()[1].getGs() + 1);
                        else
                            j.getEqs()[0].setGs(j.getEqs()[0].getGs() + 1);
                        j.addGolo(e);
                    } else {
                        if ((d1 - d2) < 0.2)
                            printer("\tO Guarda Redes defende!", 2000);
                        else
                            printer("\tA bola sai desviada da baliza!", 2000);
                    }
                }
                printer("\t" + j.getGolos()[0] + " - " + j.getGolos()[1], 300);
            }
            j.setTemp(i);
        }
        System.out.println("");
        printer("Fim do Jogo!", 300);
        printer("\t" + j.getGolos()[0] + " - " + j.getGolos()[1] + "\n", 300);
        if (j.getGolos()[0] > j.getGolos()[1])
            printer(j.getEqs()[0].getNome() + " Venceu! " + j.getEqs()[0].getResp(), 2000);
        else if (j.getGolos()[0] < j.getGolos()[1])
            printer(j.getEqs()[1].getNome() + " Venceu! " + j.getEqs()[1].getResp(), 2000);
        else
            printer("Empate!", 2000);
    }

    public static void printer(String s, int t) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(t);
        System.out.println(s);
    }
}
