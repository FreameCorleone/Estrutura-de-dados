package Aprendizado;
import java.util.LinkedList;

public class Fila {
    LinkedList<String> fila = new LinkedList<String>();

    public void inserir(String nome){
        fila.addLast(nome);
    }
    public String remover(){
        return fila.removeFirst();
}

    public boolean verifica(){
        return fila.isEmpty();
    }

    public void mostrar(){
        System.out.println(fila.toString());
    }
}
