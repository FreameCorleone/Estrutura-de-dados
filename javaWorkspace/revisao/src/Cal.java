public class Cal {
    public static int Calc(int a, int b, String c) {
        int resultado = 0;
        switch (c) {
            case "+":
                resultado = a + b; 
                break;
            case "-" :{
                resultado = a - b;
                break;
            }
            case "/" :{
                resultado = a / b;
                break;
            }
            case "*" :{
                resultado = a * b;
                break;
            }



            default:
                System.out.println("Operador inválido!");
                break;
        }

        return resultado;
    }
}
