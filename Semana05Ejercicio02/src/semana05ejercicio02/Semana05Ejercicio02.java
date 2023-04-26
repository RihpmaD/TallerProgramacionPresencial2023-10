package semana05ejercicio02;

import java.util.Scanner;

/**
 * Tiendas Don Misio desea un programa para ingresar por teclado el monto de
 * compra y el día de la semana; si el día es martes o jueves, se realizará un
 * descuento del 15% por la compra. Visualizar el descuento y el total a pagar
 * por la compra
 *
 * @author c20177
 */
public class Semana05Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char dia;
        double monto, descuento = 0;
        System.out.println("\t\tTIENDITA DE DON MISIO\n");
        System.out.println("L-Lunes\tM-Martes\tX-Miercoles\tJ-Jueves");
        System.out.println("V-Viernes\tS-Sabado\tD-Domingo");
        System.out.print("Ingrese el dia de compra [L - V]: ");
        dia = sc.next().toUpperCase().charAt(0);
        System.out.print("Ingrese el monto de la venta: ");
        monto = sc.nextDouble();
        if (monto <= 0) {
            System.out.println("El monto ingresado es incorrecto...");
        } else {
            switch (dia) {
                case 'M', 'J':
                    descuento = 0.15 * monto;
                    break;
                default:
                    descuento = 0;
            }
            System.out.println("\tREPORTE DE  VENTA");
            System.out.printf("El monto vendido es: S/. %.2f %n", monto);
            System.out.printf("El descuento por la venta: S/. %.2f %n", descuento);
            System.out.printf("El monto total a pagar: S/. %.2f %n", (monto - descuento));
        }
    }

}
