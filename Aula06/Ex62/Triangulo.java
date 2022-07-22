package Ex62;

public class Triangulo extends FiguraGeometrica{
    private double l1;
    private double l2;
    private double l3;
    public Triangulo (double l1, double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    public Triangulo(){
        this.l1=0;
        this.l2=0;
        this.l3=0;
    }
    public double getL1(){return l1;}
    public double getL2(){return l2;}
    public double getL3(){return l3;}
    public String toString(){return "Triangulo: lado1="+l1+"; lado2="+l2+"; lado3="+l3+"; "+super.toString();}
    public void setL1(double l1){this.l1=l1;}
    public void setL2(double l2){this.l2=l2;}
    public void setL3(double l3){this.l3=l3;}
    public boolean equals(Triangulo tri){
        if (this.toString().equals(tri.toString()))
            return true;
        else
            return false;
    }
    public double area(){return (l1*l2)/2;}
    public double perimetro(){return l1+l2+l3;}

    public String getCor(){return super.getCor();}
    public void setCor(String color){super.setCor(color);}
    public void setRandomCor(){super.setRandomCor();}
}
