package Ex71;

public class Apartamento extends Alojamento{
    private int numeroQuartos;
    
    public Apartamento(String codigo, String nome, String local, double precoPorNoite, double avaliacao, int numeroQuartos){
        super(codigo, nome, local, precoPorNoite, avaliacao);
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroQuartos(){return numeroQuartos;}

    public void setNumeroQuartos(int numeroQuartos){this.numeroQuartos=numeroQuartos;}

    @Override
    public String toString(){return "\n\tApartamento"+super.toString()+"\n\tQuartos: "+numeroQuartos;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + numeroQuartos;
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
        Apartamento other = (Apartamento) obj;
        if (numeroQuartos != other.numeroQuartos)
            return false;
        return true;
    }
}
