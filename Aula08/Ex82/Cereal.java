package Ex82;

public class Cereal extends AlimentoVegetariano{

    public Cereal(String nome, double proteinas, double calorias, double peso) {
        super(nome, proteinas, calorias, peso);
    }
    
    @Override
    public String toString(){return "Cereal "+this.getNome()+", Proteinas: "+this.getProteinas()+", calorias: "+this.getCalorias()+", Peso: "+this.getPeso();} 
}
