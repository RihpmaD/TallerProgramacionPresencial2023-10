
package semana09ejercicio05;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibonacci[];
        int tam;
        System.out.println("\n\tEJERCICIO 04\n");
        do {
            System.out.print("Ingrese el elemento de Fibonacci: ");
            tam = sc.nextInt();
            if (tam <= 0) {
                System.out.println("Tamaño ingresado es incorrecto...");
            }
        } while (tam <= 0);
        fibonacci = new int[tam];
        if(tam==1)
            fibonacci[0]=1;
        if(tam==2){
            fibonacci[0]=1;
            fibonacci[1]=1;
        }
        if(tam>2){
            fibonacci[0]=1;
            fibonacci[1]=1;
            for(int i=2;i<fibonacci.length;i++){
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
        }
        System.out.println("\nFIBONACCI");
        for (int i = 0; i < fibonacci.length; i++) {
            if (i != fibonacci.length - 1) {
                System.out.printf("%d | ", fibonacci[i]);
            } else {
                System.out.printf("%d %n", fibonacci[i]);
            }
        }
    }
    
}
