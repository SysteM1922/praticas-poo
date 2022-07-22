import Ex61.*;

public class Ex61 {
    public static void main(String[] args) {
    Aluno al = new Aluno ("Andreia Melo", 9855678, new Data(18, 7, 1990), new Data (1, 9, 2018));
    Aluno a2 = new Aluno ("Guilherme Antunes", 34576589, new Data(19, 3, 2002));
    Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Data(11, 5, 1985));
    bls.setBolsa(1050);
   
    System.out.println("Aluno: " + al.getName());
    System.out.println(al);
   
    System.out.println("Bolseiro: " + bls.getName() + ", NMec: " + bls.getNMec() + ", Bolsa: " + bls.getBolsa());
    System.out.println(bls);

    System.out.println(a2);
    }
} 
