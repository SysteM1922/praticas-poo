import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class Gastronomia extends Atividade{
    private List<Restaurante> restaurantes = new ArrayList<>();

    public Gastronomia(int identificador, String nome, List<Restaurante> restaurantes) {
        super(identificador, nome);
        this.restaurantes = restaurantes;
        Set<String> r = new TreeSet<>();
        for(Restaurante re: restaurantes){
            r.add(re.getNome());
        }
        super.setLocais(r);
    }

    public Gastronomia(int identificador, String nome) {
        super(identificador, nome);
    }

    public Set<String> locais(){
        Set<String> r = new TreeSet<>();
        for(Restaurante re: restaurantes){
            r.add(re.getNome());
        }
        return r;
    }

    public void add(Restaurante r){
        restaurantes.add(r);
    }

    public List<Restaurante> getLista(){
        return restaurantes;
    }

    public int totalRestaurantes(){
        return restaurantes.size();
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((restaurantes == null) ? 0 : restaurantes.hashCode());
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
        Gastronomia other = (Gastronomia) obj;
        if (restaurantes == null) {
            if (other.restaurantes != null)
                return false;
        } else if (!restaurantes.equals(other.restaurantes))
            return false;
        return true;
    }
    
}
