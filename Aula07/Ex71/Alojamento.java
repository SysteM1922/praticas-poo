package Ex71;

public class Alojamento{
    private String codigo;
    private String nome;
    private String local;
    private double precoPorNoite;
    private boolean disponibilidade;
    private double avaliacao;
    private String pessoa=null;

    public Alojamento(String codigo, String nome, String local, double precoPorNoite, double avaliacao){
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.disponibilidade = true;
        this.precoPorNoite = precoPorNoite;
        this.avaliacao = avaliacao;
    }

    public String getCodigo(){return this.codigo;}
    public String getNome(){return this.nome;}
    public String getLocal(){return this.local;}
    public double getPrecoPorNoite(){return this.precoPorNoite;}
    public double getAvaliacao(){return this.avaliacao;}
    public boolean getDisponibilidade(){return this.disponibilidade;}
    public String getPessoa(){return this.pessoa;}
    public String getTipo(){return this.getTipo();}
    public int getNumeroQuartos(){return this.getNumeroQuartos();}

    public void setCodigo(String codigo){this.codigo = codigo;}
    public void setNome(String nome){this.nome = nome;}
    public void getLocal(String local){this.local = local;}
    public void setDisponibilidade(boolean disponibilidade){this.disponibilidade = disponibilidade;}
    public void setPrecoPorNoite(double precoPorNoite){this.precoPorNoite = precoPorNoite;}
    public void setAvaliacao(double avaliacao){this.avaliacao = avaliacao;}
    public void setPessoa(String pessoa){this.pessoa=pessoa;}
    public void setTipo(String tipo){this.setTipo(tipo);}
    public void setNumeroQuartos(int numeroQuartos){this.setNumeroQuartos(numeroQuartos);}

    @Override
    public String toString(){return "\n\tCodigo: "+codigo+"\n\tNome: "+nome+"\n\tLocal: "+local+"\n\tPreco por noite: "+precoPorNoite+"\n\tAvaliacao: "+avaliacao+"\n\tDisponibilidade: "+disponibilidade+"\n\tHospede: "+pessoa;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(avaliacao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + (disponibilidade ? 1231 : 1237);
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        temp = Double.doubleToLongBits(precoPorNoite);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Alojamento other = (Alojamento) obj;
        if (Double.doubleToLongBits(avaliacao) != Double.doubleToLongBits(other.avaliacao))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (disponibilidade != other.disponibilidade)
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        if (Double.doubleToLongBits(precoPorNoite) != Double.doubleToLongBits(other.precoPorNoite))
            return false;
        return true;
    }
    
}
