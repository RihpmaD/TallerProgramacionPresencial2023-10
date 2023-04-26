
package semana05ejercicio03;

import java.util.Scanner;

/**
 * Una distribuidora de motocicletas tiene una promoción de fin de año que
consiste en lo siguiente. Las motos marca Honda tienen un descuento del
5%, las marcas Yamaha del 8% y las Suzuki del 10%, las otras marcas
2%.
 * @author c20177
 */
public class Semana05Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char marca;
        double monto, descuento, montoFinal;
        System.out.println("\t\tSISTEMA DE VENTAS LOS MOTORIZADOS\n");
        System.out.println("[Y] - Yamaha\t[H] - Honda\t[S] - Suzuki\t[O] - Otros");
        System.out.print("Ingrese el precio de la moto: ");
        monto=sc.nextDouble();
        if(monto<=0)
            System.out.println("Monto ingresado incorrecto...");
        else{
            System.out.print("Ingrese la marca de la moto: ");
            marca=sc.next().toUpperCase().charAt(0);
            System.out.println("\nREPORTE DE VENTA");
            switch(marca){
                case 'H':
                    descuento=0.05*monto;
                    break;
                case 'Y':
                    descuento=0.08*monto;
                    break;
                case 'S':
                    descuento=0.1*monto;
                    break;
                case 'O':
                    descuento=0.02*monto;
                    break;
                default:
                    descuento=0;
                    System.out.println("Marca ingresada incorrecta...");
            }
            montoFinal=monto-descuento;
            System.out.printf("El monto a pagar es: S/. %.2f %n",monto);
            System.out.printf("El descuento es: S/. %.2f %n", descuento);
            System.out.printf("El monto final es: S/. %.2f %n", montoFinal);
        }
    }
    
}
