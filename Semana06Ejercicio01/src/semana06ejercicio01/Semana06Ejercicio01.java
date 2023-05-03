
package semana06ejercicio01;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana06Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double suma=0, numero;
        int cantidad=1;
        System.out.println("\t\tSUMA DE 5 NUMEROS\n");
        while(cantidad<=5){
            System.out.print("Ingrese numero "+cantidad+": ");
            numero=sc.nextDouble();
            suma+=numero;
            cantidad++;
        }
        System.out.println("\tRESULTADO");
        System.out.println("La suma de los 5 numeros es: "+suma);
    }
    
}
