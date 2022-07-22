package Ex81;

public class Motociclo extends Viatura{
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int cilindrada, String tipo){
        super(matricula, marca, modelo, null, cilindrada);
        this.tipo=tipo;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    @Override
    public String toString() {
        return "\n- Motociclo"+super.toString()+", tipo: " + tipo;
    }

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
        Motociclo other = (Motociclo) obj;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }
    
}
