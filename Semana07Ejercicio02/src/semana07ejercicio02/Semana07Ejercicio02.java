package semana07ejercicio02;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana07Ejercicio02 {

    public static void main(String[] args) {
        double montoBruto = 0, montoNeto = 0, montoCargo = 0;
        double montoSencillo = 0, montoDoble = 0, montoTriple = 0;
        int cantidad = 0;
        char opc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\t\tNAUFRAGO SATISFECHO\n");
            System.out.println("[P] - Efectuar Pedido");
            System.out.println("[R] - Emitir Recibo");
            System.out.println("[X] - Salir");
            System.out.println("-----------------");
            System.out.print("Ingrese una opcion: ");
            opc = sc.next().toUpperCase().charAt(0);
            switch (opc) {
                case 'P':
                    do {
                        System.out.println("\t\tMENU DEL RESTAURANTE");
                        System.out.println("[S] Hamburguesa Sencilla - S/20.00");
                        System.out.println("[D] Hamburguesa Doble - S/25.00");
                        System.out.println("[T] Hamburguesa Triple - S/28.00");
                        System.out.println("[N] Finalizar Pedido");
                        System.out.println("------------------------------");
                        System.out.print("Ingrese la opcion: ");
                        opc = sc.next().toUpperCase().charAt(0);
                        switch (opc) {
                            case 'S':
                                do {
                                    System.out.println("HAMBURGUESA SENCILLA");
                                    System.out.print("Ingrese la cantidad de hamburguesas sencillas: ");
                                    cantidad = sc.nextInt();
                                    if(cantidad<=0)
                                        System.out.println("Cantidad ingresada incorrecta...");
                                } while (cantidad <= 0);
                                montoSencillo += (cantidad * 20);
                                break;
                            case 'D':
                                do {
                                    System.out.println("HAMBURGUESA DOBLE");
                                    System.out.print("Ingrese la cantidad de hamburguesas dobles: ");
                                    cantidad = sc.nextInt();
                                    if(cantidad<=0)
                                        System.out.println("Cantidad ingresada incorrecta...");
                                } while (cantidad <= 0);
                                montoDoble += (cantidad * 25);
                                break;
                            case 'T':
                                do {
                                    System.out.println("HAMBURGUESA TRIPLE");
                                    System.out.print("Ingrese la cantidad de hamburguesas triple: ");
                                    cantidad = sc.nextInt();
                                    if(cantidad<=0)
                                        System.out.println("Cantidad ingresada incorrecta...");
                                } while (cantidad <= 0);
                                montoTriple += (cantidad * 28);
                                break;
                            case 'N':
                                System.out.println("Pedido procesado...");
                                break;
                            default:
                                System.out.println("La opcion ingresada es incorrecta...");
                        }
                    } while (opc != 'N');
                    montoBruto = montoSencillo + montoDoble + montoTriple;
                    do {
                        System.out.println("PAGO CON TARJETA");
                        System.out.print("Desea pagar con tarjeta [S - N]: ");
                        opc = sc.next().toUpperCase().charAt(0);
                    } while (opc != 'S' && opc != 'N');
                    if (opc == 'S') {
                        montoCargo = 0.05 * montoBruto;
                    }
                    montoNeto = montoBruto + montoCargo;
                    break;
                case 'R':
                    System.out.println("\n\t\tREPORTE DE PAGO\n");
                    System.out.printf("Hamburguesa Sencilla - S/ %.2f %n", montoSencillo);
                    System.out.printf("Hamburguesa Doble - S/ %.2f %n", montoDoble);
                    System.out.printf("Hamburguesa Triple - S/ %.2f %n", montoTriple);
                    System.out.println("--------------------------");
                    System.out.printf("Monto Bruto: S/ %.2f %n", montoBruto);
                    System.out.printf("Monto por tarjeta: S/ %.2f %n", montoCargo);
                    System.out.println("--------------------------");
                    System.out.printf("Monto Neto: S/ %.2f %n", montoNeto);
                    System.out.println("");
                    break;
                case 'X':
                    System.out.println("Gracias por usar el sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
            }
        } while (opc != 'X');

    }

}
