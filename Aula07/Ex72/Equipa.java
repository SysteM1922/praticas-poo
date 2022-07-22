package Ex72;

import java.util.Arrays;

public class Equipa {
    private String nome, resp;
    private int gm, gs = 0;
    private Robo[] eq;
    
    public Equipa(String nome, String resp, Robo[] eq) {
        this.nome = nome;
        this.resp = resp;
        this.eq = eq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public int getGm() {
        return gm;
    }

    public void setGm(int gm) {
        this.gm = gm;
    }

    public int getGs() {
        return gs;
    }

    public void setGs(int gs) {
        this.gs = gs;
    }

    public Robo[] getEq() {
        return eq;
    }

    public void setEq(Robo[] eq) {
        this.eq = eq;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(eq);
        result = prime * result + gm;
        result = prime * result + gs;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((resp == null) ? 0 : resp.hashCode());
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
        Equipa other = (Equipa) obj;
        if (!Arrays.equals(eq, other.eq))
            return false;
        if (gm != other.gm)
            return false;
        if (gs != other.gs)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (resp == null) {
            if (other.resp != null)
                return false;
        } else if (!resp.equals(other.resp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Equipa [eq=" + Arrays.toString(eq) + ", gm=" + gm + ", gs=" + gs + ", nome=" + nome + ", resp=" + resp
                + "]";
    }
    
}
