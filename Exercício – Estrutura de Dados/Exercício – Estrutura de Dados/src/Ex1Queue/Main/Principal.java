package Ex1Queue.Main;

import Ex1Queue.Basica.Processo;
import Ex1Queue.Estrutura.Fila;

public class Principal {
    public static void main(String[] args) {

    Fila f = new Fila();
        Processo pro1 = new Processo(1,"Primeiro");
        Processo pro2 = new Processo(2,"Segundo");
        Processo pro3 = new Processo(3,"Terceiro");
        Processo pro4 = new Processo(4,"Quarto");
        Processo pro5 = new Processo(5,"Quinto");
    f.inserir(pro1);
    f.inserir(pro2);
    f.inserir(pro3);
    f.inserir(pro4);
    f.inserir(pro5);

    f.mostrar();
    System.out.println("--------------------------------");
    f.inverter();
    f.mostrar();
    
    }
   
    
}
