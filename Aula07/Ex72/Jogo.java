package Ex72;

import java.util.Arrays;

public class Jogo {
    private Equipa[] eqs;
    private double duracao;
    private double temp;
    private int gc, gf;
    
    public Jogo(Equipa eq1, Equipa eq2, double duracao) {
        this.eqs = new Equipa[]{eq1, eq2};
        this.duracao = duracao;
        this.temp = 0;
        this.gc = 0;
        this.gf = 0;
    }

    public void addGolo(int i){
        if(i==0)
            this.setGc(this.getGc()+1);
        else
            this.setGf(this.getGf()+1);
    }

    public int[] getGolos(){
        return new int[]{this.getGc(), this.getGf()};
    }

    public Equipa[] getEqs() {
        return eqs;
    }

    public void setEqs(Equipa[] eqs) {
        this.eqs = eqs;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(duracao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + Arrays.hashCode(eqs);
        result = prime * result + gc;
        result = prime * result + gf;
        temp = Double.doubleToLongBits(this.temp);
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
        Jogo other = (Jogo) obj;
        if (Double.doubleToLongBits(duracao) != Double.doubleToLongBits(other.duracao))
            return false;
        if (!Arrays.equals(eqs, other.eqs))
            return false;
        if (gc != other.gc)
            return false;
        if (gf != other.gf)
            return false;
        if (Double.doubleToLongBits(temp) != Double.doubleToLongBits(other.temp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Jogo [duracao=" + duracao + ", eqs=" + Arrays.toString(eqs) + ", gc=" + gc + ", gf=" + gf + ", temp="
                + temp + "]";
    }

}
