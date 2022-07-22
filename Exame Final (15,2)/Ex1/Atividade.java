import java.util.Set;
import java.util.TreeSet;

public class Atividade implements PontosdeInteresse{
    private int identificador;
    private String nome;
    private Set<String> locais = new TreeSet<>();

    public Atividade(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public Set<String> locais(){
        return locais;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        int result = 1;
        result = prime * result + identificador;
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
        Atividade other = (Atividade) obj;
        if (identificador != other.identificador)
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
        return "Atividade [num=" + identificador +", nome=" + nome + "]";
    }

}
