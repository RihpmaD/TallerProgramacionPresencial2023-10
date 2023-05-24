package semana09ejercicio03;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[];
        int tam;
        System.out.println("\n\tEJERCICIO 03\n");
        do {
            System.out.print("Ingrese la dimension del vector: ");
            tam = sc.nextInt();
            if (tam <= 0) {
                System.out.println("Tamaño ingresado es incorrecto...");
            }
        } while (tam <= 0);
        numeros = new int[tam];
        //Ingreso de datos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 20) + 20);
        }
        System.out.println("\nARREGLO ORIGINAL");
        for (int i = 0; i < numeros.length; i++) {
            if (i != numeros.length - 1) {
                System.out.printf("%d | ", numeros[i]);
            } else {
                System.out.printf("%d %n", numeros[i]);
            }
        }
        System.out.println("\nARREGLO FINAL");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                if (i != numeros.length - 1) {
                    System.out.printf("%d | ", numeros[i]);
                } else {
                    System.out.printf("%d %n", numeros[i]);
                }
            }
        }
    }

}
