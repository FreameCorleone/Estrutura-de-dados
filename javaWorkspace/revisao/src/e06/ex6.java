package e06;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        System.out.println("Quantas horas você trabalhou?");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();

        Verificar ver = new Verificar();
        ver.verificarHora(a);
        System.out.println(ver.getResultado());




    }
}
