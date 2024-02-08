import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scan.nextLine();
        if (nome.equals("Enrico")) {
            System.out.println("Gay!");
        }
        System.out.println("Seu nome é " + nome);
        
        System.out.println("E a sua idade? ");
        int idade = scan.nextInt();

       

        for(int i = 0; i < 10; i++){
            idade = idade * 2;
            System.out.println("ida " + idade);
        }
        scan.close();
    }
}