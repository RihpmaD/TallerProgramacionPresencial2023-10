package semana08ejercicio03;

import java.util.Scanner;

/**
 *
 * @author c20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("\n\t\tESTRUCTURA REPETITIVA\n");
        do {
            System.out.print("Ingrese el numero de terminos: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("valor ingresado incorrecto...");
            }
        } while (n <= 0);
        System.out.println("\n\tRESULTADO DE LA SECUENCIA\n");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (1 / (2.0 * i - 1));
            } else {
                sum -= (1 / (2.0 * i - 1));
            }
            if (i != n) {
                if (i % 2 == 0) {
                    System.out.print((1 / (2.0 * i - 1)) + " + ");
                } else {
                    System.out.print((1 / (2.0 * i - 1)) + " - ");
                }
            } else {
                System.out.print((1 / (2.0 * i - 1)) + " = ");
            }
        }
        System.out.println(sum + "\n");
    }

}
