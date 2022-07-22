package Ex82;

public class Ementa implements DiaSemana{
    private String nome, local;
    private static Prato[] pratos = new Prato[DiaSemana.values().length];

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void addPrato(Prato prato, String dia){
        for(int i = 0; i<DiaSemana.values().length; i++){
            if(DiaSemana.values()[i]==dia)
                pratos[i]=prato;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public static Prato[] getPratos() {
        return pratos;
    }

    public static void setPratos(Prato[] pratos) {
        Ementa.pratos = pratos;
    }
    
    public static String[] values(){
        return dias;
    };

    public static String getEnum(int i){
        return dias[i];
    }

    @Override
    public String toString(){
        String out="";
        int i = 0;
        for(Prato p: pratos){
            out+=p+", dia "+getEnum(i)+"\n";
            i++;
        }
        return out;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((local == null) ? 0 : local.hashCode());
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
        Ementa other = (Ementa) obj;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
}
