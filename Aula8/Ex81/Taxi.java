package Ex81;

public class Taxi extends Automovel {
    private int licenca;

    public Taxi(String matricula, String marca, String modelo, int cilindrada, String quadro, double bagageira, int licenca){
        super(matricula, marca, modelo, cilindrada, quadro, bagageira);
        this.licenca=licenca;
    }

    public int getLicenca() {return licenca;}
    public void setLicenca(int licenca) {this.licenca = licenca;}

    @Override
    public String toString() {
        return super.toString()+", licenca: " + licenca;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + licenca;
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
        Taxi other = (Taxi) obj;
        if (licenca != other.licenca)
            return false;
        return true;
    }

}
