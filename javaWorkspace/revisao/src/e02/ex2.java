package e02;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Escolha qual operação (+, -, /, *):");
        String op = scan.nextLine();

        int resultado = Cal.Calc(num1, num2, op);
        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
