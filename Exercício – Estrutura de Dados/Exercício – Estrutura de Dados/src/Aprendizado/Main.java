package Aprendizado;
public class Main {
    public static void main(String[] args) {
        Fila f = new Fila();
        if(f.verifica()){
            System.out.println("Fila vazia");
        }

        f.inserir("José");
        f.inserir("Gustavo");
        f.inserir("Ronaldo");
        f.inserir("Josinaldo");
        f.inserir("Tião");

        if(!f.verifica()){
            System.out.println("Fila preenchida");
            System.out.println("----------------------");
        }
        f.mostrar();

        System.out.println("-----------------");

        System.out.println("Removendo o primeiro elemento da fila: " + f.remover());
        System.out.println("Removendo o primeiro elemento da fila: " + f.remover());
        System.out.println("--------------------");

        f.mostrar();
    }
}
