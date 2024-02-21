public class rep {
    public static int repe(int a) {
        int b = 0;
        int contador = 0;

        while (contador <= 10) {
            
            b = a * contador;
            System.out.println(b);
            contador++;
             // Incrementa 'a' para evitar um loop infinito
        }

        return b; // Retorna a soma final
    }
}
