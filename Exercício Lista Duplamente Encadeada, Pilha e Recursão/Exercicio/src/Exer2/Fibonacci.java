package Exer2;

public class Fibonacci {
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        while (true) {
            int fibNum = fibonacci(n);
            if (fibNum > 100) {
                break;
            }
            System.out.print(fibNum + " ");
            n++;
        }
    }
}
