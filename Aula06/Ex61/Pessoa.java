package Ex61;

public class Pessoa {
    private String nome;
    private int cc;
    private Data dataNasc;

    public Pessoa(String nome, int cc, Data dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName(){return nome;}
    public int getCC(){return cc;}
    public Data getDataNasc(){return dataNasc;}

    @Override public String toString(){return nome + ", CC: " + cc + ", Data: " + dataNasc;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cc;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Pessoa other = (Pessoa) obj;
        if (cc != other.cc)
            return false;
        if (dataNasc == null) {
            if (other.dataNasc != null)
                return false;
        } else if (!dataNasc.equals(other.dataNasc))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    

}