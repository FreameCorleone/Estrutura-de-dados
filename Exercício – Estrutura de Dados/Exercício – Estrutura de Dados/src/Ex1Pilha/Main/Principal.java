package Ex1Pilha.Main;

import Ex1Pilha.Basica.Processo;
import Ex1Pilha.Estrutura.Pilha;

public class Principal {
    public static void main(String[] args) {

    Pilha p = new Pilha();
        Processo pro1 = new Processo(1,"Primeiro");
        Processo pro2 = new Processo(2,"Segundo");
        Processo pro3 = new Processo(3,"Terceiro");
        Processo pro4 = new Processo(4,"Quarto");
        Processo pro5 = new Processo(5,"Quinto");

    p.empilhar(pro1);
    p.empilhar(pro2);
    p.empilhar(pro3);
    p.empilhar(pro4);
    p.empilhar(pro5);
  
    p.imprimir();
    System.out.println("-------------------------------");
    p.verificaTopo();
    System.out.println("-------------------------------");
    System.out.println("REMOVENDO PRIMEIRO ELEMENTO");
    p.desempilhar();
    p.imprimir();
    
    }
}
