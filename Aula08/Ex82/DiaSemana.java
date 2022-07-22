package Ex82;

public interface DiaSemana {
    String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

    public static String[] values(){
        return dias;
    };

    public static String getEnum(int i){
        return dias[i];
    }

}
