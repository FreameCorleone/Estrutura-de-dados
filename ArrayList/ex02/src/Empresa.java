import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String nome;
    private String telefone;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String cnpj, String nome, String telefone) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
        this.funcionarios = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
}
