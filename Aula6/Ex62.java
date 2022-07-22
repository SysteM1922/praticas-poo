import Ex62.*;

public class Ex62 {
    public static void main(String[] args){
        Ponto p1 = new Ponto(3.4, 5.1);
        Ponto p2 = new Ponto(3.4, 5.1);
        Ponto p3 = new Ponto(3, 6.7);
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        p1.setX(2.3);
        p1.setY(4.5);
        System.out.println(p1);

        Circulo c1 = new Circulo(new Ponto(), 2);
        Circulo c2 = new Circulo(new Ponto(), 2);
        Circulo c3 = new Circulo(new Ponto(1,1), 3);
        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
        System.out.println(c3.area());
        System.out.println(c3.perimetro());
        System.out.println(c1.intercetam(c3));
        c1.setC(new Ponto(3,3));
        c1.setR(1);
        System.out.println(c1);
        System.out.println(c1.intercetam(c2));

        c1.setRandomCor();
        System.out.println(c1);


        Retangulo r1 = new Retangulo(2, 4);
        Retangulo r2 = new Retangulo(2, 4);
        Retangulo r3 = new Retangulo(3, 7);
        System.out.println(r1);
        System.out.println(r1.toString());
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));
        System.out.println(r1.area());
        System.out.println(c1.perimetro());
        r1.setC(4);
        r1.setA(5);
        System.out.println(r1);

        r1.setRandomCor();
        System.out.println(r1);

        Triangulo t1 = new Triangulo(2, 4, 3);
        Triangulo t2 = new Triangulo(2, 4, 3);
        Triangulo t3 = new Triangulo(3, 7, 5);
        System.out.println(t1);
        System.out.println(t1.toString());
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t2.equals(t3));
        System.out.println(t1.area());
        System.out.println(t1.perimetro());
        t1.setL1(4);
        t1.setL2(5);
        t1.setL3(8);
        System.out.println(t1);

        t1.setCor("Rosa");
        System.out.println(t1);
    }    
}