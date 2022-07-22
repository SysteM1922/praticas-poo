package Ex82;

import java.util.Arrays;

public class Prato implements Comparable<Prato>{
    private String nome;
    private Alimento[] composicao = new Alimento[0];
    private double calorias = 0;

    public Prato(String nome, Alimento[] comp) {
        this.nome = nome;
        this.composicao = comp;
    }

    public Prato(String nome){
        this.nome = nome;
    }

    public boolean addIngrediente(Alimento aux){
        Alimento[] nova = new Alimento[composicao.length+1];
        for(int i = 0; i<composicao.length-1; i++){
            if(composicao[i]!=null){
                if (composicao[i].equals(aux))
                    return false;
            
                else{
                    if(i==composicao.length)
                        nova[i]=aux;
                    else
                        nova[i]=composicao[i];
                    
                }
            }
        }
        this.calorias += aux.getCalorias()*aux.getPeso()/100;
        composicao = nova;
        return true;
    }

    public int compareTo(Prato p){
        if(this.calorias > p.getCalorias()){return 1;}
        else if(this.calorias < p.getCalorias()){return -1;}
        else{return 0;}
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Alimento[] getComposicao() {
        return composicao;
    }

    public void setComposicao(Alimento[] composicao) {
        this.composicao = composicao;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString(){return "Prato "+this.getNome()+" composto por: "+this.getComposicao().length+" Ingredientes";}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(composicao);
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
        Prato other = (Prato) obj;
        if (!Arrays.equals(composicao, other.composicao))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
