package Ex82;

public class Legume extends AlimentoVegetariano{

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(nome, proteinas, calorias, peso);
    }
    
    @Override
    public String toString(){return "Legume "+this.getNome()+", Proteinas: "+this.getProteinas()+", calorias: "+this.getCalorias()+", Peso: "+this.getPeso();}
        
}
