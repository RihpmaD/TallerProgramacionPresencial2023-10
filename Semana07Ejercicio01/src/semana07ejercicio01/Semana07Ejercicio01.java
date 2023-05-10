package semana07ejercicio01;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana07Ejercicio01 {

    public static void main(String[] args) {
        double montoBruto, montoNeto, montoDescuento, precio=0;
        int cantidad=0;
        char opc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\t\tEL HARAPIENTO DISTINGUIDO\n");
            System.out.println("[i] - Registro de venta");
            System.out.println("[e] - Emision de comprobante");
            System.out.println("[s] - Salir");
            System.out.println("-------------------------");
            System.out.print("Ingrese la opcion: ");
            opc = sc.next().toUpperCase().charAt(0);
            switch (opc) {
                case 'I':
                    System.out.println("REGISTRO DE VENTA\n");
                    do {
                        System.out.print("Ingrese el precio del traje: ");
                        precio = sc.nextDouble();
                        if (precio <= 0) {
                            System.out.println("Precio ingresado incorrecto...\n");
                        }
                    } while (precio <= 0);
                    do {
                        System.out.print("Ingrese la cantidad de trajes: ");
                        cantidad = sc.nextInt();
                        if (cantidad <= 0) {
                            System.out.println("Cantidad ingresada incorrecta...\n");
                        }
                    } while (cantidad <= 0);
                    break;
                case 'E':
                    System.out.println("\n\tREPORTE DE PAGO\n");
                    montoBruto = precio * cantidad;
                    if (precio < 2500) {
                        montoDescuento = montoBruto * 0.08;
                    } else {
                        montoDescuento = montoBruto * 0.15;
                    }
                    montoNeto = montoBruto - montoDescuento;
                    System.out.println("La cantidad comprada es: " + cantidad);
                    System.out.printf("El precio unitario es: S/. %.2f %n", precio);
                    System.out.printf("El monto sin descuento es: S/. %.2f %n", montoBruto);
                    System.out.printf("El monto del descuento es: S/. %.2f %n", montoDescuento);
                    System.out.println("-----------------------------------------");
                    System.out.printf("El monto con descuento es: S/. %.2f %n %n", montoNeto);
                    break;
                case 'S':
                    System.out.println("Gracias por utilizar el sistema...");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta...");
            }
        } while (opc != 'S');

    }

}
