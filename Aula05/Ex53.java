import Ex52.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex53 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>(100);
        livros.add(new Livro("Java 8", "CONDICIONAL"));
        livros.add(new Livro("POO em Java 8"));
        livros.add(new Livro("Java para totós", "NORMAL"));
        livros.get(2).setTipoEmprestimo("CONDICIONAL");
        ArrayList<Utilizador> alunos = new ArrayList<>(100);
        alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
        alunos.add(new Utilizador("Joao Silva", 90123, "LEI"));
        int opt = 0;
        while (opt != 8){
            System.out.println(" ");
            System.out.println("[MENU]");
            System.out.println("1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            System.out.print("Opção ");
            opt = sc.nextInt();
            switch(opt){
                case(1):
                    System.out.println(" ");
                    System.out.println("----- Inscrever utilizador -----");
                    System.out.print("Nome: ");
                    String nomeA = sc.next();
                    System.out.print("nMec: ");
                    int nMec = sc.nextInt();
                    System.out.print("Curso: ");
                    String curso = sc.next();
                    alunos.add(new Utilizador(nomeA, nMec, curso));
                    break;
                case(2):
                    System.out.println(" ");
                    System.out.println("----- Remover utilizador -----");
                    System.out.print("Nome: ");
                    String nomeR = sc.next();
                    for (int c1=0; c1<alunos.size() ; c1++){
                        if(alunos.get(c1).getNome().equals(nomeR)){
                            alunos.remove(c1);
                            break;
                        }
                    }
                    break;
                case(3):
                    System.out.println(" ");    
                    System.out.println("----- Imprimir Lista Utilizadores -----");
                    for(int c =0; c<alunos.size() ; c++)
                        System.out.println(alunos.get(c));
                    break;
                case(4):
                    System.out.println(" ");
                    System.out.println("----- Registar Livro -----");
                    System.out.print("Nome: ");
                    String livro = sc.next();
                    System.out.print("Tipo de Emprestimo: ");
                    String tipoEmprestimo = sc.next();
                    livros.add(new Livro(livro, tipoEmprestimo));
                    break;
                case(5):
                    System.out.println(" ");    
                    System.out.println("----- Imprimir Lista Livros -----");
                    for(int c =0; c<livros.size() ; c++)
                        System.out.println(livros.get(c));
                    break;
                case(6):
                    System.out.println(" ");    
                    System.out.println("----- Emprestar -----");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("nMEC: ");
                    int nMEC = sc.nextInt();
                    for(int c =0; c<livros.size() ; c++){
                        if(livros.get(c).getId()==id){
                            if (livros.get(c).getTipoEmprestimo().equals("CONDICIONAL"))
                                System.out.println("Este livro não pode ser requisitado!");
                            else if (livros.get(c).getEstado().equals("DISPONIVEL")==false)
                                System.out.println("Este livro já está emprestado!");
                            else{
                                for(int c2 =0; c2<alunos.size() ; c2++){
                                    if(alunos.get(c2).getnMec()==nMEC){
                                        if(alunos.get(c2).getIdLivros().size()<3){
                                            alunos.get(c2).setIdLivros(id);
                                            livros.get(c).setEstado("EMPRESTADO");
                                            System.out.println("Livro requisitado!");
                                        }
                                        else
                                            System.out.println("Atingiu o limite de empréstimos! Não pode requisitar mais.");
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                case(7):
                    System.out.println(" ");    
                    System.out.println("----- Devolver -----");
                    System.out.print("ID: ");
                    int id2 = sc.nextInt();
                    System.out.print("nMEC: ");
                    int nMEC2 = sc.nextInt();
                    for(int c =0; c<livros.size() ; c++){
                        if(livros.get(c).getId()==id2){
                            livros.get(c).setEstado("DISPONIVEL");
                            for(int c2 =0; c2<alunos.size() ; c2++){
                                if(alunos.get(c2).getnMec()==nMEC2){
                                    alunos.get(c2).removeIdLivros(id2);
                                    System.out.println("Livro devolvido!");
                                }
                            }
                            break;
                        }
                    }
                    break;
                case(8):
                    System.out.println(" ");    
                    System.out.println("[FIM]");
                    break;
            }
        }
        sc.close();
    }
}
