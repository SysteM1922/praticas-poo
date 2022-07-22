import java.util.TreeSet;
import java.util.Set;

public class PasseioBicicleta extends Atividade{
    private Set<String> locais = new TreeSet<>();

    public PasseioBicicleta(int identificador, String nome, String[] locais) {
        super(identificador, nome);
        for(String s: locais){
            this.locais.add(s);
        };
    }

    public Set<String> locais(){
        return locais;
    }

    public PasseioBicicleta(int identificador, String nome) {
        super(identificador, nome);
    }

    public void addLocal(String l){
        this.locais.add(l);
    }

    public Set<String> getLocais() {
        return locais;
    }

    public void setLocais(Set<String> locais) {
        this.locais = locais;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((locais == null) ? 0 : locais.hashCode());
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
        PasseioBicicleta other = (PasseioBicicleta) obj;
        if (locais == null) {
            if (other.locais != null)
                return false;
        } else if (!locais.equals(other.locais))
            return false;
        return true;
    }
    
}
