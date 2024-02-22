package e09;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 à 12 para saber o mês correspondente");
        String mes = scan.nextLine();
        VeriM ver = new VeriM();
        ver.verificarMes(mes);
        System.out.println(ver.getMes());
    }
}
