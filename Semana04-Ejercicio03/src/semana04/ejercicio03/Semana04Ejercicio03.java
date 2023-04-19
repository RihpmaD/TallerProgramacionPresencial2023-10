
package semana04.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author c20177
 */
public class Semana04Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double totalSinDescuentoSinIgv, descuento=0, 
                totalSinDescuentoConIgv, montototal, precioIGV;
        char forma;
        String formaPago;
        System.out.println("\t\tSISTEMA DE VENTA DE IMPRESORAS\n");
        System.out.println("Precio Unitario: S/.78.00");
        System.out.println("-----------------------------");
        System.out.println("Forma de Pago\tDescuento");
        System.out.println("[E] - Efectivo\t10%");
        System.out.println("[T] - Tarjeta\t5%");
        System.out.println("[V] - Vale\t15%");
        System.out.println("-----------------------------");
        System.out.print("Ingrese la cantidad: ");
        cantidad=sc.nextInt();
        System.out.print("Elija la forma de pago: ");
        forma=sc.next().toUpperCase().charAt(0);
        totalSinDescuentoSinIgv=cantidad*78;
        precioIGV=78*1.18;
        totalSinDescuentoConIgv=precioIGV*cantidad;
        switch(forma){
            case 'E':
                descuento=totalSinDescuentoConIgv*0.1;
                formaPago="Efectivo";
                break;
            case 'T':
                descuento=totalSinDescuentoConIgv*0.05;
                formaPago="Tarjeta de Crédito";
                break;
            case 'V':
                descuento=totalSinDescuentoConIgv*0.15;
                formaPago="Vale de Compra";
                break;
            default:
                descuento=0;
                formaPago="";
        }
        montototal=totalSinDescuentoConIgv-descuento;
        if(formaPago.equals(""))
            System.out.println("Datos ingresados incorrectos...");
        else{
            System.out.println("\n\t\tREPORTE DE PAGO\n");
            System.out.println("Descripcion\t\t\t\tValor");
            System.out.println("Cantidad de impresoras: \t\t"+cantidad);
            System.out.printf("Precio con IGV: \t\t\t"
                    + "S/. %.2f %n",precioIGV);
            System.out.printf("Monto Total sin descuento con IGV: \t"
                    + "S/.%.2f %n", totalSinDescuentoConIgv);
            System.out.println("Forma de pago: \t\t\t\t"+formaPago);
            System.out.printf("Descuento con IGV: \t\t\t"
                    + "S/. %.2f %n", descuento);
            System.out.println("--------------------------------------------------");
            System.out.printf("Monto total a pagar con IGV: \t\t"
                    + "S/. %.2f %n",montototal);
        }
    }
    
}
