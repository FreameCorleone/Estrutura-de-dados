package lista;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
    	//testeInicial();
    	addInicio();
    	//adicionarPosicao();
    	//removeInicio();
    	//removeFinal();
    	//removePosicao();
    }
    public static void removePosicao() {
    	ListaEncadeada<Integer> lista = new ListaEncadeada<>();
    	lista.adiciona(1);
    	lista.adiciona(2);
    	lista.adiciona(3);
    	lista.adiciona(4);
    	lista.adiciona(5);
    	
    	System.out.println(lista.removerPorPosicao(1));
    	System.out.println(lista);
    }
    
    public static void removeFinal() {
    	ListaEncadeada<Integer> lista = new ListaEncadeada<>();
    	lista.adiciona(1);
    	lista.adiciona(2);
    	lista.adiciona(4);
    	System.out.println(lista);
    	System.out.println(lista.removeFinal());
    	System.out.println(lista);
    	
    }
    
    public static void removeInicio() {
    	ListaEncadeada<Integer> lista = new ListaEncadeada<>();
    	lista.adiciona(1);
    	lista.adiciona(2);
    	lista.adiciona(4);
    	
    	System.out.println(lista.removeInicio());
    	
    	
    	System.out.println(lista);
    
    }  
    
    public static void adicionarPosicao() {
    	ListaEncadeada<Integer> lista = new ListaEncadeada<>();
    	lista.adiciona(1);
    	lista.adiciona(2);
    	lista.adiciona(4);
    	
    	lista.adicionaPorPosicao(0, 0);
    	lista.adicionaPorPosicao(4, 5);
    	lista.adicionaPorPosicao(3, 3);
    	
    	System.out.println(lista);
    	
    }
    
    public static void addInicio() {
    	ListaEncadeada<Integer> lista = new ListaEncadeada<>();
    	
    	lista.adicionaInicio(3);
    	lista.adicionaInicio(2);
    	lista.adicionaInicio(1);
    	
    	System.out.println(lista);
    }
    
    public static void testeInicial() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1); 
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);
        System.out.println("Tamanho = " + lista.getTamanho());

        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));

        System.out.println("\n");

        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));

        lista.limpa();
        System.out.println(lista);
    	
    }
   
}
