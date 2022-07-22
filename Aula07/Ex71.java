import Ex71.*;
import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AgenciaViagens av = new AgenciaViagens("ViagensPortugal","Rua Senhora de Mércoles, nº 4, 6000-280 Castelo Branco");
        System.out.println(av);
        int op = -1;
        av.adicionar("2573", "Casa de Campo", "Idanha-a-Nova", 30.00, 3.5, 3);
        av.adicionar("0987", "Quarto 34, Rainha Dona Amélia", "Castelo Branco", 60.00, 3.0, "Single");
        av.adicionar("90", "A".charAt(0), "Eletrico");
        while (op!=0){
            System.out.println("\n|MENU|\n");
            System.out.println("\t1. Realizar Check-In\t\t2. Realizar Check-Out");
            System.out.println("\t3. Alugar Carro\t\t\t4. Devolver Carro");
            System.out.println("\t5. Listar Alojamentos\t\t6. Listar Carros");
            System.out.println("\t7. Filtrar Alojamentos\t\t8. Filtrar Carros");
            System.out.println("\t9. Info Alojamento\t\t10. Info Carro");
            System.out.println("\t11. Adicionar Alojamento\t12. Adicionar Carro");
            System.out.println("\t13. Remover Alojamentos\t\t14. Remover Carros");
            System.out.println("\t15. Editar Alojamento\t\t16. Editar Carros");
            System.out.println("\t0. Terminar\n");
            System.out.print("\tAção: ");
            op = sc.nextInt();
            System.out.print("\n");

            switch(op){
                case(1):
                    System.out.println("|Realizar Check-In|");
                    System.out.print("Codigo/Nome do Alojamento: ");
                    String al = sc.next();
                    String p = av.checkIn(al);
                    if(p.equals("Check-In falhou!"))
                        System.out.println(p);
                    else{
                        System.out.print("Hospede Responsavel: ");
                        String pe = sc.next();
                        av.registarPessoa(al, pe, 1);
                        System.out.println(p);
                    }
                    break;
                case(2):
                    System.out.println("|Realizar Check-Out|");
                    System.out.print("Codigo/Nome do Alojamento: ");
                    String al2 = sc.next();
                    String p2 = av.checkOut(al2);
                    if(p2.equals("Check-Out falhou!"))
                        System.out.println(p2);
                    else{
                        av.registarPessoa(al2, null, 1);
                        System.out.println(p2);
                    }
                    break;
                case(3):
                    System.out.println("|Alugar Carro|");
                    System.out.print("Codigo do Carro: ");
                    String cr = sc.next();
                    String v = av.alugar(cr);
                    if(v.equals("Aluguer falhou!"))
                        System.out.println(v);
                    else{
                        System.out.print("Responsavel: ");
                        String pe2 = sc.next();
                        av.registarPessoa(cr, pe2, 2);
                        System.out.println(v);
                    }
                    break;
                case(4):
                    System.out.println("|Devolver Carro|");
                    System.out.print("Codigo do Carro: ");
                    String cr2 = sc.next();
                    String v2 = av.devolver(cr2);
                    if(v2.equals("Devolucão falhou!"))
                        System.out.println(v2);
                    else{
                        av.registarPessoa(cr2, null, 2);
                        System.out.println(v2);
                    }
                    break;
                case(5):
                    System.out.println("|Listar Alojamentos|");
                    System.out.println(av.getAlojamentos());
                    break;
                case(6):
                    System.out.println("|Listar Carros|");
                    System.out.println(av.getCarros());
                    break;
                case(7):
                    System.out.println("|Filtrar Alojamentos|");
                    System.out.println("1. Apartamentos");
                    System.out.println("2. Quartos de Hotel");
                    System.out.println("3. Disponiveis");
                    System.out.println("4. Preco - Maior que");
                    System.out.println("5. Preco - Menor que");
                    System.out.println("6. Avaliacao - Maior que");
                    System.out.println("7. Avaliacao - Menor que");
                    System.out.println("8. Numero Minimo de Quartos");
                    System.out.println("9. Tipo de Quarto");
                    System.out.print("Ação: ");
                    int op2 = sc.nextInt();
                    switch(op2){
                        case(1):
                            System.out.println(av.filtrar(1, null));
                            break;
                        case(2):
                            System.out.println(av.filtrar(2, null));
                            break;
                        case(3):
                            System.out.println(av.filtrar(3, null));
                            break;
                        case(4):
                            System.out.print("Preco: ");
                            String pre = sc.next(); 
                            System.out.println(av.filtrar(4, pre));
                            break;
                        case(5):
                            System.out.print("Preco: ");
                            String pre2 = sc.next(); 
                            System.out.println(av.filtrar(5, pre2));
                            break;
                        case(6):
                            System.out.print("Avaliacao: ");
                            String ava = sc.next(); 
                            System.out.println(av.filtrar(6, ava));
                            break;
                        case(7):
                            System.out.print("Avaliacao: ");
                            String ava2 = sc.next(); 
                            System.out.println(av.filtrar(7, ava2));
                            break;
                        case(8):
                            System.out.print("Numero: ");
                            String num = sc.next(); 
                            System.out.println(av.filtrar(8, num));
                            break;
                        case(9):
                            System.out.print("Tipo: ");
                            String tip = sc.next(); 
                            System.out.println(av.filtrar(9, tip));
                            break;
                    }
                    break;
                case(8):
                    System.out.println("|Filtrar Carros|");
                    System.out.println("1. Disponiveis");
                    System.out.println("2. Classe ");
                    System.out.println("3. Combustivel");
                    System.out.print("Ação: ");
                    int op3 = sc.nextInt();
                    switch(op3){
                        case(1):
                            System.out.println(av.filtrarCarros(1, null));
                            break;
                        case(2):
                            System.out.print("Classe: ");
                            String cl = sc.next(); 
                            System.out.println(av.filtrarCarros(2, cl));
                            break;
                        case(3):
                            System.out.print("Combustivel: ");
                            String comb = sc.next(); 
                            System.out.println(av.filtrarCarros(3, comb));
                            break;
                    }
                    break;
                case(9):
                    System.out.println("|Info Alojamento|");
                    System.out.print("Alojamento: ");
                    String c = sc.next();
                    System.out.println(av.getAlojamentoInfo(c));
                    break;
                case(10):
                    System.out.println("|Info Carro|");
                    System.out.print("Carro: ");
                    String ca = sc.next();
                    System.out.println(av.getCarroInfo(ca));
                    break;
                case(11):
                    System.out.println("|Adicionar Alojamento|");
                    System.out.println("1. Adicionar Apartamento");
                    System.out.println("2. Adicionar Quarto de Hotel");
                    System.out.print("Ação: ");
                    int a = sc.nextInt();
                    System.out.print("\nCódigo: ");
                    String codigo = sc.next();
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Local: ");
                    String local = sc.next();
                    System.out.print("Preco Por Noite: ");
                    String precoPorNoite = sc.next();
                    System.out.print("Avaliacao: ");
                    String avaliacao = sc.next();
                    if(a==1){
                        System.out.print("Numero de Quartos: ");
                        int numeroQuartos = sc.nextInt();
                        av.adicionar(codigo, nome, local, Double.parseDouble(precoPorNoite), Double.parseDouble(avaliacao), numeroQuartos);
                    }
                    else{
                        System.out.print("Tipo: ");
                        String tipo = sc.next();
                        av.adicionar(codigo, nome, local, Double.parseDouble(precoPorNoite), Double.parseDouble(avaliacao), tipo);
                    }
                    System.out.println("\n|Alojamento Adicionado|");
                    break;
                case(12):
                    System.out.println("|Adicionar Carro|");
                    System.out.print("Código: ");
                    String codigo2 = sc.next();
                    System.out.print("Classe: ");
                    String classe = sc.next();
                    System.out.print("Combustivel: ");
                    String combustivel = sc.next();
                    av.adicionar(codigo2, classe.charAt(0), combustivel);
                    System.out.println("\n|Carro Adicionado|");
                    break;
                case(13):
                    System.out.println("|Remover Alojamento|");
                    System.out.println("1. Remover 1 Alojamento");
                    System.out.println("2. Remover Todos os Alojamentos");
                    System.out.print("Ação: ");
                    int o = sc.nextInt();
                    if(o==1){
                        System.out.print("Alojamento: ");
                        String id3 = sc.next();
                        av.removerAlojamento(id3);
                        System.out.print("\n|Alojamento Removido|");
                    }
                    else
                        av.limparAlojamentos();
                    System.out.println("\n|Alojamento(s) Removido|");
                    break;
                case(14):
                    System.out.println("|Remover Carro|");
                    System.out.println("1. Remover 1 Carro");
                    System.out.println("2. Remover Todos os Carros");
                    System.out.print("Ação: ");
                    int o2 = sc.nextInt();
                    if(o2==1){
                        System.out.print("Carro: ");
                        String id4 = sc.next();
                        av.removerCarro(id4);
                        System.out.print("\n|Alojamento Removido|");
                    }
                    else
                        av.limparCarros();
                    System.out.println("\n|Carro(s) Removido|");
                    break;
                case(15):
                    System.out.print("Alojamento: ");
                    String alo = sc.next();
                    System.out.println("|Editar Alojamento|");
                    System.out.println("1. Nome");
                    System.out.println("2. Preco Por Noite");
                    System.out.println("3. Avaliacao");
                    if(av.getClass(alo) instanceof Apartamento)
                        System.out.println("4. Numero de Quartos");
                    else
                        System.out.println("4. Tipo");
                    System.out.print("Ação: ");
                    int ac = sc.nextInt();
                    System.out.print("\nMudar para: ");
                    String m = sc.next();
                    String resp = av.editar(alo, ac, m);
                    System.out.println(resp);
                    break;
                case(16):
                    System.out.print("Carro: ");
                    String car = sc.next();
                    System.out.println("|Editar Carro|");
                    System.out.println("1. Classe");
                    System.out.println("2. Combustivel");
                    System.out.print("Ação: ");
                    int ac2 = sc.nextInt();
                    System.out.print("\nMudar para: ");
                    String m2 = sc.next();
                    String resp2 = av.editarCarro(car, ac2, m2);
                    System.out.println(resp2);
                    break;
                case(0):
                    System.out.println("A Terminar...");
                    break;
            }
            if(op!=0){
                System.out.println("\nPretende continuar? (ENTER/'Sim')");
                sc.nextLine();
                String scan = sc.nextLine();
                if(!(scan.equals(""))){
                    op=0;
                    System.out.println("A Terminar...");
                }
            }
        };
        sc.close();
    }
}
