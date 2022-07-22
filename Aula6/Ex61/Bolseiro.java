package Ex61;

public class Bolseiro extends Aluno{
    private int vBolsa;
    public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc){
        super(nome, cc, dataNasc, dataInsc);
        this.vBolsa = 0;
    }

    public Bolseiro(String nome, int cc, Data dataNasc){
        super(nome, cc, dataNasc);
        this.vBolsa = 0;
    }

    public void setBolsa(int vBolsa){this.vBolsa = vBolsa;}

    public int getBolsa(){return vBolsa;}

    @Override public String toString(){return super.toString() + ", Valor da bolsa: " + vBolsa;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + vBolsa;
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
        Bolseiro other = (Bolseiro) obj;
        if (vBolsa != other.vBolsa)
            return false;
        return true;
    }
    
}