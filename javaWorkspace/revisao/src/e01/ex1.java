package e01;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int resultado = rep.repe(num);
        System.out.println(resultado);
        scan.close();
    }
}
