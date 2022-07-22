package Ex82;

public class Carne extends Alimento implements VariedadeCarne{
    private String variedade;

    public Carne(String variedade, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    public String getVariedade() {
        return variedade;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    @Override
    public String toString(){return this.getVariedade()+", Proteinas: "+this.getProteinas()+", calorias: "+this.getCalorias()+", Peso: "+this.getPeso();}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((variedade == null) ? 0 : variedade.hashCode());
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
        Carne other = (Carne) obj;
        if (variedade == null) {
            if (other.variedade != null)
                return false;
        } else if (!variedade.equals(other.variedade))
            return false;
        return true;
    }
    
}
