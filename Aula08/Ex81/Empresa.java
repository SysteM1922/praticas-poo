package Ex81;

public class Empresa {
    private String nome, cPostal, email;
    private Viatura[] viaturas;

    public Empresa(String nome, String cPostal, String email, Viatura[] viaturas) {
        this.nome = nome;
        this.cPostal = cPostal;
        this.email = email;
        this.viaturas = viaturas;
    }

    public Viatura maisKm(){
        Viatura v = new Viatura("", "", "", "", 0);
        int km = 0;
        for(Viatura vi: viaturas){
            if(vi.distanciaTotal()>km){
                km=vi.distanciaTotal();
                v=vi;
            }
        }
        return v;
    }

    @Override
    public String toString() {
        String out="";
        for(Viatura v: viaturas){out+=v.toString();}
        return "Empresa: cPostal: " + cPostal + ", email: " + email + ", nome: " + nome + "\nViaturas: " + out;
    }
    
}
