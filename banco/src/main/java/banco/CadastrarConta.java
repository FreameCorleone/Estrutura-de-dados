package banco;
public class CadastrarConta {
    private Conta[] contas;
    private int numContas;

    public CadastrarConta(int tamanho) {
        this.contas = new Conta[tamanho];
        this.numContas = 0;
    }

    public void adicionarConta(String nome, double valor) {
        if (numContas < contas.length) {
            contas[numContas] = new Conta(nome, valor);
            numContas++;
        } else {
            System.out.println("Limite de contas atingido!");
        }
    }

    public void listarContas() {
        System.out.println("Lista de Contas:");
        for (int i = 0; i < numContas; i++) {
            System.out.println("Nome: " + contas[i].getNome() + ", Valor: " + contas[i].getValor());
        }
    }

    public Conta procurarConta(String nome) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNome().equalsIgnoreCase(nome)) {
                return contas[i];
            }
        }
        return null;
    }
}