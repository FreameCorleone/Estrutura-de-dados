import ca.Cadastros;

public class Mainn {
    public static void main(String[] args) {
        Cadastros<String> cadastros = new Cadastros<>();

        cadastros.adicionar("Conta1");
        cadastros.adicionar("Conta2");
        cadastros.adicionar("Conta3");
        
        String[] contasPreenchidas = cadastros.listar();
        System.out.println("\nContas preenchidas:");
        for (String c : contasPreenchidas) {
            System.out.println(c);
        }
        
        cadastros.adicionarPorPosicao("Conta4", 1);
        contasPreenchidas = cadastros.listar();
        System.out.println("\nContas preenchidas:");
        for (String c : contasPreenchidas) {
            System.out.println(c);
        }
        
        
        
        
        cadastros.remover(2);

        contasPreenchidas = cadastros.listar();
        System.out.println("\nContas preenchidas:");
        for (String c : contasPreenchidas) {
            System.out.println(c);
        }
        
        String conta = cadastros.procurarConta(1);
        System.out.println("\nConta na posição 1: " + conta);

        
        

        int tamanho = cadastros.size();
        System.out.println("\nTamanho atual: " + tamanho);
    }
}
