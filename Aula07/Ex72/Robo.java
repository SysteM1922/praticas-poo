package Ex72;

public class Robo extends ObjetoMovel {
    private String tipo;
    private int id;
    private int golos;
    private static int r = 0;
    
    public Robo(String tipo) {
        this.id = ++r;
        this.tipo = tipo;
        this.golos = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGolos() {
        return golos;
    }

    public void setGolos(int golos) {
        this.golos = golos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + golos;
        result = prime * result + id;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Robo other = (Robo) obj;
        if (golos != other.golos)
            return false;
        if (id != other.id)
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Robo [golos=" + golos + ", id=" + id + ", tipo=" + tipo + "]";
    }

}
