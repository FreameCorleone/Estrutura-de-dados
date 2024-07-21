import br.edu.ifba.cadastros.Cadastros;

public class Mainn {
    public static void main(String[] args) {
        Cadastros<String> cadastros = new Cadastros<>();
        
        System.out.println("Adicionando contas:");
        cadastros.adicionar("Conta 1");
        cadastros.adicionar("Conta 2");
        cadastros.adicionar("Conta 3");
        
        listarContas(cadastros);
        
        System.out.println("\nAdicionando Conta 4 na posição 0:");
        cadastros.adicionarPorPosicao("Conta 4", 0);
        
        listarContas(cadastros);
        
        System.out.println("\nRemovendo conta na posição 2:");
        cadastros.remover(2);
        
        listarContas(cadastros);
        
        System.out.println("\nProcurando conta na posição 1:");
        String conta = cadastros.procurarConta(1);
        System.out.println("Conta encontrada: " + conta);
        
        System.out.println("\nTamanho atual da lista de contas:");
        int tamanho = cadastros.size();
        System.out.println("Tamanho: " + tamanho);
    }
    
    private static void listarContas(Cadastros<String> cadastros) {
        System.out.println("Listando contas cadastradas:");
        for (String conta : cadastros.listar()) {
            if (conta != null) {
                System.out.println(conta);
            }
        }
    }
}
