package e08;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o preço de custo");
        int cus = scan.nextInt();
        System.out.println("Qual o preço do produto");
        int pre = scan.nextInt();
        Pre ver = new Pre();
        ver.verificar(cus,pre);


    }
}
