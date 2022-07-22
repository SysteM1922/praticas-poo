package Ex81;

public class PesadoPassageiros extends Viatura{
    private double peso;
    private int maxPassageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, String quadro, int cilindrada, double peso, int maxPassageiros){
        super(matricula, marca, modelo, quadro, cilindrada);
        this.peso=peso;
        this.maxPassageiros=maxPassageiros;
    }

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public int getMaxPassageiros() {return maxPassageiros;}
    public void setMaxPassageiros(int maxPassageiros) {this.maxPassageiros = maxPassageiros;}

    @Override
    public String toString() {
        return "\n- "+this.getClass().getSimpleName()+super.toString()+" maxPassageiros: " + maxPassageiros + ", peso: " + peso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + maxPassageiros;
        long temp;
        temp = Double.doubleToLongBits(peso);
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
        PesadoPassageiros other = (PesadoPassageiros) obj;
        if (maxPassageiros != other.maxPassageiros)
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        return true;
    }

}
