package Ex52;

public class Livro {
    private int id;
    private String titulo;
    private String tipoEmprestimo;
    private static int idcontador = 100;
    private String estado;

    public Livro(String titulo, String tipoEmprestimo){
        this.setId();
        this.titulo=titulo;
        this.tipoEmprestimo=tipoEmprestimo;
        this.estado = "DISPONIVEL";
    }
    public Livro(String titulo){
        this.setId();
        this.titulo=titulo;
        this.tipoEmprestimo="NORMAL";
        this.estado = "DISPONIVEL";
    }

    public int getId(){return id;}
    public String getTitulo(){return titulo;}
    public String getTipoEmprestimo(){return tipoEmprestimo;}
    public String getEstado(){return estado;}

    public void setEstado(String estado){this.estado=estado;}
    public void setId(){this.id=idcontador++;}
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setTipoEmprestimo(String tipoEmprestimo){this.tipoEmprestimo=tipoEmprestimo;}

    public String toString(){return "Livro "+id+"; "+titulo+"; "+tipoEmprestimo;}
}
