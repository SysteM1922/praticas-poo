package Ex52;
import java.util.ArrayList;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;
    private ArrayList<Integer> idLivros = new ArrayList<>();

    public Utilizador(String nome, int nMec, String curso){
        this.nome=nome;
        this.nMec=nMec;
        this.curso=curso;
    }
    public Utilizador(String nome){
        this.nome=nome;
    }

    public String getNome(){return nome;}
    public int getnMec(){return nMec;}
    public String getCurso(){return curso;}
    public ArrayList<Integer> getIdLivros(){return idLivros;}

    public void setIdLivros(int Id){this.idLivros.add(Id);}
    public void setNome(String nome){this.nome=nome;}
    public void setnMec(int nMec){this.nMec=nMec;}
    public void setCurso(String curso){this.curso=curso;}

    public void removeIdLivros(int id){
        for(int c=0; c<this.idLivros.size(); c++){
            if(this.idLivros.get(c)==id){
                this.idLivros.remove(c);
                break;
            }
        }
    }

    public String toString(){return "Aluno "+nMec+"; "+nome+"; "+curso;}
}
