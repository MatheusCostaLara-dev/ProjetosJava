package exercicios;
import java.util.Scanner;

public class Temperatura {
     // (ºF - 32) x 5/9 = ºC

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        final int ajuste = 32;
        final double multiplicador = 5/9.0;


        System.out.println("Digite a temperatura em ºF: ");
        double fahrenheit = e.nextDouble();

        double celsius = (fahrenheit - ajuste) * (multiplicador);
        System.out.println("A temperatura é de: " + celsius +"ºC");
    }

}
