package Ex81;

public class Automovel extends Viatura{
    private double bagageira;

    public Automovel(String matricula, String marca, String modelo, int cilindrada, String quadro, double bagageira){
        super(matricula, marca, modelo, quadro, cilindrada);
        this.bagageira=bagageira;
    }

    public double getBagageira() {return bagageira;}
    public void setBagageira(double bagageira) {this.bagageira = bagageira;}

    @Override
    public String toString() {
        return "\n- " + this.getClass().getSimpleName() + super.toString() + ", bagageira: " + bagageira;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(bagageira);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Automovel other = (Automovel) obj;
        if (Double.doubleToLongBits(bagageira) != Double.doubleToLongBits(other.bagageira))
            return false;
        return true;
    }

}
