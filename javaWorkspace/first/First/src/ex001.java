import java.util.Scanner; //tu precisa colocar isso para puxar o scaner
public class ex001 {
    public static void main(String[] args) {
        System.out.println("hello world");  
        Scanner scan = new Scanner(System.in); //cria o objeto para usar o scanner
        String nome = scan.nextLine(); //declarar variável para usar scanner
        System.out.println(nome);
        scan.close(); //fechar scanner
        
    }
}
