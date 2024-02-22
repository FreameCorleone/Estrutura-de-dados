package e03;
public class Fibonacci {
    public static int Fibi(int a) {
        int num1 = 0;
        int num2 = 1;
        int resultado = 0;
        while (resultado <= 100){
            resultado = num1 + num2;
            System.out.println(resultado);

            num1 = num2;
            num2 = resultado;

        }
        return 0;
        
    }
}
