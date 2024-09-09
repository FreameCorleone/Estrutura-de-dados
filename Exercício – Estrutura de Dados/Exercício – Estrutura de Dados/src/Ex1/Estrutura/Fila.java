package Ex1.Estrutura;

import java.util.LinkedList;
import java.util.Stack;

import Ex1.Basica.Processo;

public class Fila {

    LinkedList<Processo> fila = new LinkedList<Processo>();
    Stack<Processo> pilha = new Stack<Processo>();

    public void inserir(Processo proc){
        fila.addLast(proc);
    }

    public Object remover(){
        return fila.poll();
}

    public boolean verifica(){
        return fila.isEmpty();
    }

    public void mostrar(){
        for(Processo p : fila){
            System.out.println("Id do processo " + p.getPid());
            System.out.println("Contéudo do processo " + p.getPid() + ": " + p.getConteudo());
        }
    }
    public void inverter(){
        while(!verifica()){
            pilha.add(fila.poll());
        }
        fila.clear();
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
    }
}

}
