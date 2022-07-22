import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class AgenciaTuristica {
    private String nome, endereço;
    private Set<Atividade> atividades = new HashSet<Atividade>(){};

    public AgenciaTuristica(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public Set<Atividade> atividades(){
        return this.atividades;
    }

    public Set<String> getAllItems(){
        Set<String> se = new TreeSet<>();
        for(Atividade a: atividades){se.add(a.getNome());};
        return se;
    };

    public void add(Atividade a){
        this.atividades.add(a);
    }

    public int totalItems(){
        int e=0;
        for(Atividade a:atividades){
            e+=a.locais().size();
        }
        return e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atividades == null) ? 0 : atividades.hashCode());
        result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
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
        AgenciaTuristica other = (AgenciaTuristica) obj;
        if (atividades == null) {
            if (other.atividades != null)
                return false;
        } else if (!atividades.equals(other.atividades))
            return false;
        if (endereço == null) {
            if (other.endereço != null)
                return false;
        } else if (!endereço.equals(other.endereço))
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
        return "Agencia Turistica "+nome+ "\n\t"+"Atividades: "+atividades;
    }
}
