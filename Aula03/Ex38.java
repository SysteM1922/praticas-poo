import java.lang.Math;

public class Ex38 {
    public static void main(String[] args){
        System.out.println("NotaT NotaP Pauta");
        for (int a = 16; a>0; a--){
            double p;
            double n1 = (double)Math.floor(Math.random()*21);
            double n2 = (double)Math.floor(Math.random()*21);
            double [] v = {n1, n2};
            if (n1<7.0 || n2<7.0)
                p = 66;
            else
                p=0.4*v[0]+0.6*v[1];
            System.out.printf("%5.1f %5.1f %5.0f\n", v[0], v[1], p);
        }
    }
}
