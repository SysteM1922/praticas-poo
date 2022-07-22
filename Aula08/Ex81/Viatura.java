package Ex81;

public class Viatura implements KmPercorridosInterface{
    private String matricula, marca, modelo, quadro;
    private int cilindrada, ultimoTrajeto=0, quilometrosPercorridos=0; 

    public Viatura(String matricula, String marca, String modelo, String quadro, int cilindrada){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.quadro=quadro;
        this.cilindrada=cilindrada;
    }

    public Viatura(String matricula, String marca, String modelo, int cilindrada){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.cilindrada=cilindrada;
    }

    public void trajeto(int quilometros){
        quilometrosPercorridos+=quilometros;
        ultimoTrajeto=quilometros;
    }
    public int ultimoTrajeto(){
        return ultimoTrajeto;
    }
    public int distanciaTotal(){
        return quilometrosPercorridos;
    }

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public String getQuadro() {return quadro;}
    public void setQuadro(String quadro) {this.quadro = quadro;}
    public int getCilindrada() {return cilindrada;}
    public void setCilindrada(int cilindrada) {this.cilindrada = cilindrada;}
    public int getUltimoTrajeto() {return ultimoTrajeto;}
    public void setUltimoTrajeto(int ultimoTrajeto) {this.ultimoTrajeto = ultimoTrajeto;}
    public int getQuilometrosPercorridos() {return quilometrosPercorridos;}
    public void setQuilometrosPercorridos(int quilometrosPercorridos) {this.quilometrosPercorridos = quilometrosPercorridos;}

    @Override
    public String toString() {return ": cilindrada: " + cilindrada + ", marca: " + marca + ", matricula: " + matricula + ", modelo: " + modelo + ", quadro: " + quadro + ", quilometrosPercorridos: " + quilometrosPercorridos + ", ultimoTrajeto: " + ultimoTrajeto;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cilindrada;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((quadro == null) ? 0 : quadro.hashCode());
        result = prime * result + quilometrosPercorridos;
        result = prime * result + ultimoTrajeto;
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
        Viatura other = (Viatura) obj;
        if (cilindrada != other.cilindrada)
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (quadro == null) {
            if (other.quadro != null)
                return false;
        } else if (!quadro.equals(other.quadro))
            return false;
        if (quilometrosPercorridos != other.quilometrosPercorridos)
            return false;
        if (ultimoTrajeto != other.ultimoTrajeto)
            return false;
        return true;
    }

    
}
