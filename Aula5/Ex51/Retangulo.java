package Ex51;

public class Retangulo {
    private double c;
    private double a;
    public Retangulo (double c, double a){
        this.c = c;
        this.a = a;
    }
    public Retangulo(){
        this.c=0;
        this.a=0;
    }
    public double getC(){return c;}
    public double getA(){return a;}
    public String toString(){return "Retangulo: comprimento="+c+"; altura="+a;}
    public void setC(double c){this.c=c;}
    public void setA(double a){this.a=a;}
    public boolean equals(Retangulo ret){
        if (this.toString().equals(ret.toString()))
            return true;
        else
            return false;
    }
    public double area(){return c*a;}
    public double perimetro(){return c*2+a*2;}
}