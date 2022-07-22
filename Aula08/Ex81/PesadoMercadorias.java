package Ex81;

public class PesadoMercadorias extends Viatura{
    private double peso, maxCarga;

    public PesadoMercadorias(String matricula, String marca, String modelo, String quadro, int cilindrada, double peso, double maxCarga){
        super(matricula, marca, modelo, quadro, cilindrada);
        this.peso=peso;
        this.maxCarga=maxCarga;
    }

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public double getMaxCarga() {return maxCarga;}
    public void setMaxCarga(double maxCarga) {this.maxCarga = maxCarga;}

    @Override
    public String toString() {
        return "\n- "+this.getClass().getSimpleName()+super.toString()+" maxCarga: " + maxCarga + ", peso: " + peso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(maxCarga);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        PesadoMercadorias other = (PesadoMercadorias) obj;
        if (Double.doubleToLongBits(maxCarga) != Double.doubleToLongBits(other.maxCarga))
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        return true;
    }

}
