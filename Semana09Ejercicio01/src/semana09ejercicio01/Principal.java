
package semana09ejercicio01;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeros[];
        int tam;
        System.out.println("\n\tEJERCICIO 01\n");
        do {
            System.out.print("Ingrese la dimension del vector: ");
            tam = sc.nextInt();
            if (tam <= 0) {
                System.out.println("Tamaño ingresado es incorrecto...");
            }
        } while (tam <= 0);
        numeros=new double[tam];
        //Ingreso de datos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=((Math.random()*20)+20);
        }
        System.out.println("\nARREGLO FINAL");
        for (int i = 0; i < numeros.length; i++) {
            if (i != numeros.length - 1) {
                System.out.printf("%.2f | ",numeros[i]);
            } else {
                System.out.printf("%.2f %n",numeros[i]);
            }
        }
    }
    
}
