package Ex71;

public class QuartoHotel extends Alojamento{
    private String tipo;

    public QuartoHotel(String codigo, String nome, String local, double precoPorNoite, double avaliacao, String tipo){
        super(codigo, nome, local, precoPorNoite, avaliacao);
        this.tipo=tipo;
    }

    public String getTipo(){return this.tipo;}

    public void setTipo(String tipo){this.tipo=tipo;}

    @Override
    public String toString(){return "\n\tQuarto de Hotel"+super.toString()+",\n\tTipo: "+tipo;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        QuartoHotel other = (QuartoHotel) obj;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }
}
