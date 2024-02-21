import java.util.Scanner;
public class ex5 {
    
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        Ver verificar = new Ver();
        verificar.veri(num);
        scan.close();
    }
}