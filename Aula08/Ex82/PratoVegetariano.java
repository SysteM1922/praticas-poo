package Ex82;

public class PratoVegetariano extends Prato{

    public PratoVegetariano(String nome, AlimentoVegetariano[] composicao){
        super(nome, composicao);
    }

    public PratoVegetariano(String nome){
        super(nome);
    }

    public boolean addIngrediente(Alimento aux){
        if(!(aux instanceof AlimentoVegetariano))
            return false;
        else
            return super.addIngrediente(aux);
    }

    @Override
    public String toString(){return super.toString()+" - Prato Vegetariano";}
}
