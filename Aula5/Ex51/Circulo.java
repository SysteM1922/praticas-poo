package Ex51;
import java.lang.Math;

public class Circulo {
    private Ponto c;
    private double r;
    public Circulo (Ponto c, double r){
        this.c = c;
        this.r = r;
    }
    public Circulo(){
        this.c=new Ponto();
        this.r=0;
    }
    public Ponto getC(){return c;}
    public double getR(){return r;}
    public String toString(){return "Circulo: centro="+c+"; raio="+r;}
    public void setC(Ponto c){this.c=c;}
    public void setR(double r){this.r=r;}
    public boolean equals(Circulo cir1){
        if (this.toString().equals(cir1.toString()))
            return true;
        else
            return false;
    }
    public double area(){return Math.pow(r, 2)*Math.PI;}
    public double perimetro(){return 2*Math.PI*r;}
    public boolean intercetam(Circulo cir2){
        if ((this.getR()+cir2.getR())>=(Math.sqrt(Math.pow(this.getC().getX()-cir2.getC().getX(), 2)+Math.pow(this.getC().getY()-cir2.getC().getY(),2))))
            return true;
        else
            return false;
    }
}
