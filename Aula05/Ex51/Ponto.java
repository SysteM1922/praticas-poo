package Ex51;

public class Ponto {
    private double x;
    private double y;
    public Ponto(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public Ponto(){
        this.x=0;
        this.y=0;
    }
    public double getX(){return x;}
    public double getY() {return y;}
    public String toString() {return "Ponto: x="+x+"; y="+y;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public boolean equals(Ponto p){
        if (this.toString().equals(p.toString()))
            return true;
        else
            return false;
    }
}
