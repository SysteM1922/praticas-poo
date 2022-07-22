import Ex81.*;

public class Ex81 {
    public static void main(String args[]){
        Motociclo v1 = new Motociclo("AA-00-AA", "Honda", "Sport Touring", 1833, "Desportivo");
        Automovel v2 = new Automovel("BB-11-BB", "Mercedes", "Benz", 1950, "9BWHE21JX2406831", 200);
        Taxi v3 = new Taxi("CC-22-CC", "BM", "W", 1800, "6PWHE21JX2405327", 120, 63986839);
        PesadoMercadorias v4 = new PesadoMercadorias("DD-33-DD", "Scania", "S", "9EMHE21JX2391831", 4400, 8000, 17000);
        PesadoPassageiros v5 = new PesadoPassageiros("EE-55-EE", "Volvo", "9500","3AVHE21JX2406847", 3700, 6000, 47);
        v1.trajeto(20);
        v2.trajeto(70);
        v3.trajeto(840);
        v4.trajeto(34);
        v5.trajeto(97);
        Viatura[] viaturas ={v1, v2, v3, v4, v5};
        Empresa emp = new Empresa("Carlos Alberto Ltda", "2500-107", "carrosdocarlitos@cal.pt", viaturas); 
        System.out.println(emp);

        System.out.println(v1);
        System.out.print(v1.getTipo());
        v1.setTipo("Estrada");
        System.out.println(v1);

        System.out.println(v2);
        System.out.print(v2.getBagageira());
        v2.setBagageira(30);
        System.out.println(v2);

        System.out.println(v3);
        System.out.print(v3.getLicenca());
        v3.setLicenca(456978);
        System.out.println(v3);

        System.out.println(v4);
        System.out.println(v4.getPeso());
        System.out.print(v4.getMaxCarga());
        v4.setPeso(2650);
        v4.setMaxCarga(7690);
        System.out.println(v4);

        System.out.println(v5);
        System.out.println(v5.getPeso());
        System.out.print(v5.getMaxPassageiros());
        v5.setPeso(2650);
        v5.setMaxPassageiros(76);
        System.out.println(v5);

        System.out.println(v3);
        System.out.println(v3.getMatricula());
        System.out.println(v3.getMarca());
        System.out.println(v3.getModelo());
        System.out.println(v3.getQuadro());
        System.out.print(v3.getCilindrada());
        v3.setMatricula("ZZ-99-ZZ");
        v3.setMarca("Fiat");
        v3.setModelo("500");
        v3.setQuadro("1JLHE21JX2506347");
        v3.setCilindrada(1000);
        System.out.println(v3);

        PesadoPassageiros v6 = new PesadoPassageiros("EE-55-EE", "Volvo", "9500","3AVHE21JX2406847", 3700, 2650, 76);
        PesadoPassageiros v7 = new PesadoPassageiros("EE-55-EE", "Volvo", "9500","3AVHE21JX2406847", 3700, 3000, 80);
        System.out.println("");
        System.out.println(v5.equals(v6));
        System.out.println(v5.equals(v7));
        System.out.println(v5.equals(v4));

        System.out.println(v1);
        System.out.println(v1.getUltimoTrajeto());
        System.out.print(v1.getQuilometrosPercorridos());
        v1.trajeto(300);
        System.out.println(v1);
        System.out.println(v1.getUltimoTrajeto());
        System.out.print(v1.getQuilometrosPercorridos());
        v1.trajeto(240);
        System.out.println(v1);
        System.out.println(v1.getUltimoTrajeto());
        System.out.println(v1.getQuilometrosPercorridos());

        System.out.println("\nA Viatura com mais Km é: "+emp.maisKm());
    }
    
}
