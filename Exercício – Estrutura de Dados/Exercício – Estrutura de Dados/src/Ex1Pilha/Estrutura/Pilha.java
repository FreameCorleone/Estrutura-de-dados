package Ex1Pilha.Estrutura;

import java.util.Stack;

import Ex1Pilha.Basica.Processo;



public class Pilha {
    Stack<Processo> pilha = new Stack<Processo>();

    public void empilhar(Processo proc){
        pilha.push(proc);
    }

    public Object desempilhar(){
        return pilha.pop();
    }

    public void verificaTopo(){
        System.out.println("Topo da pilha: " + pilha.peek());
    }
    
    public void imprimir(){
        for(Processo p : pilha){
            System.out.println("Id do processo " + p.getPid());
            System.out.println(" Contéudo do processo " + p.getPid() + ": " + p.getConteudo());
        }   

    }
    
}   
