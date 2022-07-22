package Ex62;

public class Retangulo extends FiguraGeometrica{
    private double comp;
    private double a;
    public Retangulo (double comp, double a){
        this.comp = comp;
        this.a = a;
        
    }
    public Retangulo(){
        this.comp=0;
        this.a=0;
    }
    public double getComp(){return comp;}
    public double getA(){return a;}
    public String toString(){return "Retangulo: comprimento="+comp+"; altura="+a+"; "+super.toString();}
    public void setC(double comp){this.comp=comp;}
    public void setA(double a){this.a=a;}
    public boolean equals(Retangulo ret){
        if (this.toString().equals(ret.toString()))
            return true;
        else
            return false;
    }
    public double area(){return comp*a;}
    public double perimetro(){return comp*2+a*2;}

    public String getCor(){return super.getCor();}
    public void setCor(String color){super.setCor(color);}
    public void setRandomCor(){super.setRandomCor();}
}