package Ex71;

public class Carro{
    public String codigo;
    private char classe;
    private boolean disponibilidade;
    private String combustivel;
    private String pessoa=null;

    public Carro(String codigo, char classe, String combustivel){
        this.codigo=codigo;
        this.classe=classe;
        this.disponibilidade=true;
        this.combustivel=combustivel;
    }

    public String getCodigo(){return codigo;}
    public char getClasse(){return classe;}
    public boolean getDisponibilidade(){return disponibilidade;}
    public String getCombustivel(){return combustivel;}
    public String getPessoa(){return pessoa;}

    public void setCodigo(String codigo){this.codigo=codigo;}
    public void setClasse(char classe){this.classe=classe;}
    public void setDisponibilidade(boolean disponibilidade){this.disponibilidade=disponibilidade;}
    public void setCombustivel(String combustivel){this.combustivel=combustivel;}
    public void setPessoa(String pessoa){this.pessoa=pessoa;}
    
    @Override
    public String toString(){return "\n\tCarro: "+codigo+"\n\tClasse: "+classe+"\n\tCombustivel: "+combustivel+"\n\tDisponibilidade: "+disponibilidade+"\n\tResponsavel: "+pessoa;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + classe;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((combustivel == null) ? 0 : combustivel.hashCode());
        result = prime * result + (disponibilidade ? 1231 : 1237);
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (classe != other.classe)
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (combustivel == null) {
            if (other.combustivel != null)
                return false;
        } else if (!combustivel.equals(other.combustivel))
            return false;
        if (disponibilidade != other.disponibilidade)
            return false;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        return true;
    }
    
}
