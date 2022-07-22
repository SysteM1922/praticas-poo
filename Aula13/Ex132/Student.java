package Ex132;

import java.lang.Math;

public class Student {
    private String Nmec, nome, ATP, AC, AP;
    private int NF;

    public Student(String nmec, String nome, String aTP, String aC, String aP) {
        this.Nmec = nmec;
        this.nome = nome;
        this.ATP = aTP;
        this.AC = aC;
        this.AP = aP;
        if(!(this.ATP==null || this.AC==null || this.AP==null))
            NF=(int)Math.round(Double.parseDouble(this.ATP)*0.3+Double.parseDouble(this.AC)*0.2+Double.parseDouble(this.AP)*0.5);
        else
            NF=-1;
    }

    public String getNmec() {
        return Nmec;
    }

    public void setNmec(String nmec) {
        Nmec = nmec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getATP() {
        return ATP;
    }

    public void setATP(String aTP) {
        ATP = aTP;
    }

    public String getAC() {
        return AC;
    }

    public void setAC(String aC) {
        AC = aC;
    }

    public String getAP() {
        return AP;
    }

    public void setAP(String aP) {
        AP = aP;
    }

    public int getNF(){
        return NF;
    }

    public void setNF(int nF) {
        NF = nF;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((AC == null) ? 0 : AC.hashCode());
        result = prime * result + ((AP == null) ? 0 : AP.hashCode());
        result = prime * result + ((ATP == null) ? 0 : ATP.hashCode());
        result = prime * result + NF;
        result = prime * result + ((Nmec == null) ? 0 : Nmec.hashCode());
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
        Student other = (Student) obj;
        if (AC == null) {
            if (other.AC != null)
                return false;
        } else if (!AC.equals(other.AC))
            return false;
        if (AP == null) {
            if (other.AP != null)
                return false;
        } else if (!AP.equals(other.AP))
            return false;
        if (ATP == null) {
            if (other.ATP != null)
                return false;
        } else if (!ATP.equals(other.ATP))
            return false;
        if (NF != other.NF)
            return false;
        if (Nmec == null) {
            if (other.Nmec != null)
                return false;
        } else if (!Nmec.equals(other.Nmec))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [AC=" + AC + ", AP=" + AP + ", ATP=" + ATP + ", NF=" + NF + ", Nmec=" + Nmec + ", nome=" + nome
                + "]";
    }
    
}
