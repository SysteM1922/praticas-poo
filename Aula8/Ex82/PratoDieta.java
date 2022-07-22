package Ex82;

public class PratoDieta extends Prato{
    private double limiteCal;

    public PratoDieta(String nome, Alimento[] composicao, double limiteCal){
        super(nome, composicao);
        this.limiteCal = limiteCal;
    }

    public PratoDieta(String nome, double limiteCal){
        super(nome);
        this.limiteCal = limiteCal;
    }

    public double getLimiteCal() {
        return limiteCal;
    }

    public void setLimiteCal(double limiteCal) {
        this.limiteCal = limiteCal;
    }

    public boolean addIngrediente(Alimento aux){
        if((aux.getCalorias()*aux.getPeso()/100+super.getCalorias())>limiteCal)
            return false;
        else{
            return super.addIngrediente(aux);
        }
    }

    @Override
    public String toString() {return super.toString()+" - Dieta ("+super.getCalorias()+" Calorias) ";}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(limiteCal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        PratoDieta other = (PratoDieta) obj;
        if (Double.doubleToLongBits(limiteCal) != Double.doubleToLongBits(other.limiteCal))
            return false;
        return true;
    }

}
