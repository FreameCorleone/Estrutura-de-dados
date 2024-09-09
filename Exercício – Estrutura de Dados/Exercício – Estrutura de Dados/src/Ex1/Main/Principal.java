package Ex1.Main;

import Ex1.Basica.Processo;
import Ex1.Estrutura.Fila;

public class Principal {
    public static void main(String[] args) {

    Fila f = new Fila();
    Processo p1 = new Processo(1,"Primeiro");
    Processo p2 = new Processo(2,"Segundo");
    Processo p3 = new Processo(3,"Terceiro");
    Processo p4 = new Processo(4,"Quarto");
    Processo p5 = new Processo(5,"Quinto");
    f.inserir(p1); 
    f.inserir(p2); 
    f.inserir(p3); 
    f.inserir(p4); 
    f.inserir(p5); 
    
    f.mostrar();
    System.out.println("-------------------------");
    f.inverter();
    f.mostrar();

    }
}