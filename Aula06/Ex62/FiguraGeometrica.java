package Ex62;

public class FiguraGeometrica {
    String cor;
    public FiguraGeometrica(){
        setRandomCor();
    }

    public void setRandomCor(){
        String[] cores = {"Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Lilás", "Roxo"};
        this.cor = cores[(int)(Math.random()*cores.length)];
    }

    public String getCor(){return cor;}
    public void setCor(String color){this.cor = color;}

    public String toString(){return "Figura de cor: " + cor;}
}
