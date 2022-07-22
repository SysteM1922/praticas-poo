package Ex61;
import java.time.LocalDate;

public class Data implements Comparable<Data>{
    private int dia;
    private int mes;
    private int ano;

    public Data(int d, int mes, int ano){
        this.dia = d;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){
        LocalDate dAtual = LocalDate.now();
        this.dia = dAtual.getDayOfMonth();
        this.mes = dAtual.getMonthValue();
        this.ano = dAtual.getYear();
    }

    public int compareTo(Data d){
        if (d.ano < ano){return -1;}
        else if (d.ano > ano){return 1;}
        else{
            if(d.mes < mes){return -1;}
            else if(d.mes > mes){return 1;}
            else{
                if(d.dia < dia){return -1;}
                else if(d.dia > dia){return 1;}
                else{return 0;}
            }
        }
    };

    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAno(){return ano;}
    
    @Override public String toString(){return dia + "/" + mes + "/" + ano;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + dia;
        result = prime * result + mes;
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
        Data other = (Data) obj;
        if (ano != other.ano)
            return false;
        if (dia != other.dia)
            return false;
        if (mes != other.mes)
            return false;
        return true;
    }

    
}
