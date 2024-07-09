public class Main {
    public static void main(String[] args) {
        RegraNegocioFuncionario regraFuncionario = new RegraNegocioFuncionario();
        RegraNegocioEmpresa regraEmpresa = new RegraNegocioEmpresa();

        Empresa emp1 = new Empresa("12345678000199", "Silvano Sales", "31987654323");
        Empresa emp2 = new Empresa("98765432000188", "Formula 1", "31987654324");

        regraEmpresa.cadastrarEmpresa(emp1);
        regraEmpresa.cadastrarEmpresa(emp2);

        Funcionario func1 = new Funcionario("12345678900", "João Silva", "MG1234567", "31987654321", emp1);
        Funcionario func2 = new Funcionario("09876543210", "Maria Souza", "SP7654321", "31987654322", emp1);
        Funcionario func3 = new Funcionario("11223344556", "Carlos Lima", "RJ1122334", "31987654325", emp2);

        regraFuncionario.cadastrarFuncionario(func1);
        regraFuncionario.cadastrarFuncionario(func2);
        regraFuncionario.cadastrarFuncionario(func3);

      
        System.out.println("Funcionários:");
        for (Funcionario func : regraFuncionario.listarFuncionario()) {
            System.out.println(func.getNome() + " - Empresa: " + func.getEmpresa().getNome());
        }

     
        System.out.println("\nEmpresas e seus funcionários:");
        for (Empresa emp : regraEmpresa.listarEmpresa()) {
            System.out.println("Empresa: " + emp.getNome());
            for (Funcionario func : emp.getFuncionarios()) {
                System.out.println("  Funcionário: " + func.getNome());
            }
        }
    }
}
