package e07;
import java.util.Scanner;

import e06.Verificar;
public class ex7{
    public static void main(String[] args) {
        System.out.println("Quantas horas você trabalhou?");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();

        Verificar ver = new Verificar();
        ver.verificarHora(a);
        System.out.println(ver.getResultado());
        if (ver.getResultado()<50) {
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }



    }
}
