
package semana05ejercicio01;

import java.util.Scanner;

/**
 * Ordenar 3 números de mayor a menor
 * @author c20177
 */
public class Semana05Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("\t\tSISTEMA DE ORDENAMIENTO DE TRES VALORES\n");
        System.out.print("Ingrese primer numero: ");
        n1=sc.nextDouble();
        System.out.print("Ingrese segundo numero: ");
        n2=sc.nextDouble();
        System.out.print("Ingrese tercer numero: ");
        n3=sc.nextDouble();
        System.out.println("\nRESULTADO\n");
        if(n1>=n2 && n1>=n3){
            System.out.print(n1 + " - ");
            if(n2>=n3)
                System.out.print(n2 + " - " + n3);
            else
                System.out.print(n3 + " - " + n2);
        }else{
            if(n2>=n1 && n2>=n3){
                System.out.print(n2 + " - ");
                if(n1>=n3)
                    System.out.print(n1 + " - " + n3);
                else
                    System.out.print(n3 + " - " + n1);
            }else{
                System.out.print(n3 + " - ");
                if(n1>=n2)
                    System.out.print(n1 + " - " + n2);
                else
                    System.out.print(n2 + " - " + n1);
            }
        }
        System.out.println("");
    }
    
}
