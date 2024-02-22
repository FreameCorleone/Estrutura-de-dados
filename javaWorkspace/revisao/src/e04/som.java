package e04;
public class som {
    private int resultado; // Variável resultado é privada
    private int resultado2;

 

    public int executarLoop() {
        resultado = 0;
        // Loop for para imprimir valores de 0 a 30
        for (int a = 0; a <= 30; a++) {
            if (a % 2 == 1) {
                System.out.println(resultado);
                resultado = resultado + a;
            }
        }
        
        return resultado;
    }
    public int executarLoop2() {
        resultado2 = 1; 
        for (int a = 1; a <= 30; a++) {
            if (a % 2 == 0) {
                System.out.println("\n"+resultado2);
                resultado2 = resultado2 * a;
            }
        }
        return resultado2;
    }
    
    public int getResultado2() {
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    // Método público para obter o valor de resultado
    public int getResultado() {
        return resultado;
    }

    // Método público para definir o valor de resultado
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
