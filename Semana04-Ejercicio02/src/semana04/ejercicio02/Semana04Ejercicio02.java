package semana04.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author c20177
 */
public class Semana04Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double total = 0.0;
        char opc;
        System.out.println("\t\tSISTEMA ESTADIO CUSCATLÁN\n");
        System.out.println("[G] - Sol General \tS/.3.00");
        System.out.println("[P] - Sol Preferente \tS/.5.00");
        System.out.println("[S] - Sombra \t\tS/.8.00");
        System.out.println("[T] - Tribuna \t\tS/.15.00");
        System.out.println("[A] - Platea \t\tS/.20.00");
        System.out.println("------------------------------");
        System.out.print("Ingrese el sector a registrar: ");
        opc = sc.next().toUpperCase().charAt(0);
        switch (opc) {
            case 'G':
                System.out.println("\t\nENTRADA SECTOR SOL GENERAL");
                System.out.print("Ingrese la cantidad de entradas: ");
                cantidad = sc.nextInt();
                total=cantidad*3;
                break;
            case 'P':
                System.out.println("\t\nENTRADA SECTOR SOL PREFERENTE");
                System.out.print("Ingrese la cantidad de entradas: ");
                cantidad = sc.nextInt();
                total=cantidad*5;
                break;
            case 'S':
                System.out.println("\t\nENTRADA SECTOR SOMBRA");
                System.out.print("Ingrese la cantidad de entradas: ");
                cantidad = sc.nextInt();
                total=cantidad*8;
                break;
            case 'T':
                System.out.println("\t\nENTRADA SECTOR TRIBUNA");
                System.out.print("Ingrese la cantidad de entradas: ");
                cantidad = sc.nextInt();
                total=cantidad*15;
                break;
            case 'A':
                System.out.println("\t\nENTRADA SECTOR PLATEA");
                System.out.print("Ingrese la cantidad de entradas: ");
                cantidad = sc.nextInt();
                total=cantidad*20;
                break;
            default:
                cantidad=0;
                total=0.0;
                System.out.println("Datos ingresados incorrecto...");
        }
        System.out.println("\n\tREPORTE DE RESULTADOS\n");
        System.out.println("La cantidad de entradas vendidas fue: "+cantidad);
        System.out.printf("El monto recaudado es: S/.%.2f%n",total);
    }

}
