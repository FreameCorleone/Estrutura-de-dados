package banco;
class CadastrarConta {
    private Conta[] contas;
    private int capacidade;
    private int tamanho;

    public CadastrarConta() {
       
    }

    public CadastrarConta(int capacidade) {
        this.capacidade = capacidade;
        this.contas = new Conta[capacidade];
        this.tamanho = 0;
    }

    public void adicionarConta(String nome, double valor, int posicao) {
        if (posicao < 0 || posicao >= capacidade) {
            System.out.println("Posição inválida.");
            return;
        }
        
        if (contas[posicao] == null) {
            contas[posicao] = new Conta(nome, valor);
            tamanho++;
        } else {
            for (int i = tamanho; i > posicao; i--) {
                contas[i] = contas[i - 1];
            }
            contas[posicao] = new Conta(nome, valor);
            tamanho++;
        }
    }

    public void listarContas() {
        System.out.println("Lista de Contas:");
        
        for (int i = 0; i < tamanho; i++) {
            if (contas[i] != null) {
                System.out.println("Nome: " + contas[i].getNome() + ", Valor: " + contas[i].getValor());    
            }
            
        }
    }
    public Conta procurarConta(String nome) {
        for (int i = 0; i < capacidade; i++) {
            if (contas[i].getNome().equalsIgnoreCase(nome)) {
                return contas[i];
            }
        }
        return null;
    }
}