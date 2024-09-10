package Exer1.Principal;

import Exer1.basica.Contato;
import Exer1.Lista.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Contato c1 = new Contato("Alessandro Silva", "Rua do Sol 123", "(75)98877-4321");
        Contato c2 = new Contato("Leticia Oliveira", "Rua da Paz 456", "(75)99555-1234");
        Contato c3 = new Contato("Rafael Martins", "Rua do Lago 789", "(75)99222-5678");

        lista.adiciona(c1);
        //System.out.println(lista.toString());


        lista.adicionaPorPosicao(0, c2);
        //System.out.println(lista.toString());

        lista.removerPorPosicao(0);
        lista.adiciona(c3);
        //System.out.println(lista.toString());

        
        //System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorNome("Alessandro Silva"));

    }

}
