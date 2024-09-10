package Exer4;

import java.util.Stack;

public class PalindromoComPilha {

    public static boolean verificarPalindromo(String texto) {
        texto = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != pilha.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String texto1 = "A base do teto desaba";
        String texto2 = "arara";
        String texto3 = "palavra";

        System.out.println("\"" + texto1 + "\" é um palíndromo? " + verificarPalindromo(texto1));
        System.out.println("\"" + texto2 + "\" é um palíndromo? " + verificarPalindromo(texto2));
        System.out.println("\"" + texto3 + "\" é um palíndromo? " + verificarPalindromo(texto3));
    }
}
