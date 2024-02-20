public class Ver {
    public int veri(int a) {
        if(a % 2 == 0) {
            System.out.println("O número " + a + " é par.");
            return 1; 
        } else {
            System.out.println("O número " + a + " é ímpar.");
            return -1;
        }
    }
}
