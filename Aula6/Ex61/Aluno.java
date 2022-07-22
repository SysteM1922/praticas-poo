package Ex61;

public class Aluno extends Pessoa{
    private int nMec;
    private Data dataInsc;
    private static int contador = 100;

    public Aluno(String nome, int cc, Data dataNasc, Data dataInsc){
        super(nome, cc, dataNasc);
        setNMec();
        this.dataInsc = dataInsc;
    }

    public Aluno(String nome, int cc, Data dataNasc){
        super(nome, cc, dataNasc);
        setNMec();
        this.dataInsc= new Data();
    }

    public void setNMec(){this.nMec = contador++;}

    public int getNMec(){return nMec;}
    public Data getDataInsc(){return dataInsc;}
    public String getName(){return super.getName();}
    public int getCC(){return super.getCC();}
    public Data getDataNasc(){return super.getDataNasc();}

    @Override public String toString(){return super.toString() + ", Número Mecanográfico: " + nMec + ", Data de Inscrição " + dataInsc;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dataInsc == null) ? 0 : dataInsc.hashCode());
        result = prime * result + nMec;
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
        Aluno other = (Aluno) obj;
        if (dataInsc == null) {
            if (other.dataInsc != null)
                return false;
        } else if (!dataInsc.equals(other.dataInsc))
            return false;
        if (nMec != other.nMec)
            return false;
        return true;
    } 

}
