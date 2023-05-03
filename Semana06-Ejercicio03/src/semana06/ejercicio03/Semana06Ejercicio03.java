
package semana06.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana06Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double suma=0, numero=1;
        System.out.println("\t\tINGRESO DE NÚMEROS\n");
        while(numero>0){
            System.out.print("Ingrese numero: ");
            numero=sc.nextDouble();
            if(numero%2==0 && numero>0)
                suma+=numero;
        }
        System.out.println("\n\tRESULTADO");
        System.out.println("La suma es: "+suma);
    }
    
}
