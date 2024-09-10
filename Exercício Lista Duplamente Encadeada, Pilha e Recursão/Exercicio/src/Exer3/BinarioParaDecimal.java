package Exer3;

public class BinarioParaDecimal {

    public static int binarioParaDecimal(String binario, int posicao) {
       
        if (posicao >= binario.length()) {
            return 0;
        }
        
      
        int digito = binario.charAt(posicao) - '0';

        int valor = digito * (int) Math.pow(2, binario.length() - 1 - posicao);

        return valor + binarioParaDecimal(binario, posicao + 1);
    }

    public static void main(String[] args) {
        
        String binario = "11";
        int decimal = binarioParaDecimal(binario, 0);

       
        System.out.println("O número binário " + binario + " em decimal é " + decimal);
    }
}
