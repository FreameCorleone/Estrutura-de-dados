package banco;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastrarConta cadastro = new CadastrarConta(5);
        cadastro.adicionarConta("João", 1000);
        cadastro.adicionarConta("Maria", 2000);
        cadastro.adicionarConta("Jose", 1500);

        cadastro.listarContas();

        System.out.println("Busque uma conta por um nome");


        String nomeContaProcurada = scan.nextLine() ;


        Conta contaProcurada = cadastro.procurarConta(nomeContaProcurada);
        if (contaProcurada != null) {
            System.out.println("Conta encontrada - Nome: " + contaProcurada.getNome() + ", Valor: " + contaProcurada.getValor());
        } else {
            System.out.println("Conta com o nome '" + nomeContaProcurada + "' não encontrada.");
        }
    }
}