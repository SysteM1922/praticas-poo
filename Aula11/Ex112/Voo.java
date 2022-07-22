package Ex112;

public class Voo {
    private String horas, voo, companhia, origem, atraso, obs;

    public Voo(String horas, String voo, String origem, String atraso) {
        this.horas = horas;
        this.voo = voo;
        this.origem = origem;
        this.atraso = atraso;
        this.obs = "Previsto: "+convertIS(novaHora(convertSI(horas), convertSI(atraso)));
        this.companhia = Companhia(voo);
    }

    public Voo(String horas, String voo, String origem) {
        this.horas = horas;
        this.voo = voo;
        this.origem = origem;
        this.atraso = "";
        this.obs = "";
        this.companhia = Companhia(voo);
    }

    public int[] convertSI(String h){
        int[] hi=new int[2];
            hi[0]=Integer.parseInt((h.split(":"))[0]);
            hi[1]=Integer.parseInt((h.split(":"))[1]);
        return hi;
    }

    public String convertIS(int[] s){
        String s0, s1;
        if(s[0]<10)
            s0="0"+String.valueOf(s[0]);
        else
            s0=String.valueOf(s[0]);
        if(s[1]<10)
            s1="0"+String.valueOf(s[1]);
        else
            s1=String.valueOf(s[1]);
        return s0+":"+s1;
    }

    public int[] novaHora(int[] h1, int[] h2){
        int[] nh = {h1[0]+h2[0], h1[1]+h2[1]};
        nh[0]=nh[0]+nh[1]/60;
        if(nh[0]>=24)
            nh[0]=nh[0]-24;
        nh[1]=nh[1]%60;
        return nh;
    }

    public String Companhia(String v) {
        return v.substring(0, 2);
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getAtraso() {
        return atraso;
    }

    public void setAtraso(String atraso) {
        this.atraso = atraso;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atraso == null) ? 0 : atraso.hashCode());
        result = prime * result + ((companhia == null) ? 0 : companhia.hashCode());
        result = prime * result + ((horas == null) ? 0 : horas.hashCode());
        result = prime * result + ((obs == null) ? 0 : obs.hashCode());
        result = prime * result + ((origem == null) ? 0 : origem.hashCode());
        result = prime * result + ((voo == null) ? 0 : voo.hashCode());
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
        Voo other = (Voo) obj;
        if (atraso == null) {
            if (other.atraso != null)
                return false;
        } else if (!atraso.equals(other.atraso))
            return false;
        if (companhia == null) {
            if (other.companhia != null)
                return false;
        } else if (!companhia.equals(other.companhia))
            return false;
        if (horas == null) {
            if (other.horas != null)
                return false;
        } else if (!horas.equals(other.horas))
            return false;
        if (obs == null) {
            if (other.obs != null)
                return false;
        } else if (!obs.equals(other.obs))
            return false;
        if (origem == null) {
            if (other.origem != null)
                return false;
        } else if (!origem.equals(other.origem))
            return false;
        if (voo == null) {
            if (other.voo != null)
                return false;
        } else if (!voo.equals(other.voo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Voo [atraso=" + atraso + ", companhia=" + companhia + ", horas=" + horas + ", obs=" + obs + ", origem="
                + origem + ", voo=" + voo + "]";
    }
}
