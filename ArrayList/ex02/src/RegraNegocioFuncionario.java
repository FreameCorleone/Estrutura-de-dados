import java.util.ArrayList;

public class RegraNegocioFuncionario {
    private ArrayList<Funcionario> funcionarios;

    public RegraNegocioFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        funcionario.getEmpresa().adicionarFuncionario(funcionario);
    }

    public ArrayList<Funcionario> listarFuncionario() {
        return funcionarios;
    }
}
