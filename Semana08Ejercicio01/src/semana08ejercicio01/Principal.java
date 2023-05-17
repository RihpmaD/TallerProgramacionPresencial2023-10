
package semana08ejercicio01;

import java.util.Scanner;

/**
 *
 * @author c20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        double sum=0;
        System.out.println("\n\t\tESTRUCTURA REPETITIVA\n");
        System.out.print("Ingrese el numero de terminos: ");
        n=sc.nextInt();
        System.out.println("\n\tRESULTADO DE LA SECUENCIA\n");
        for(int i=1;i<=n;i++){
            sum+=(i*i);
            if(i!=n){
                if(sum>=n*n){
                    System.out.print((i*i)+" = ");
                    break;
                }
                else
                    System.out.print((i*i)+" + ");
            }
            else
                System.out.print((i*i)+" = ");
            
        }
        System.out.println(sum+"\n");
    }
    
}
