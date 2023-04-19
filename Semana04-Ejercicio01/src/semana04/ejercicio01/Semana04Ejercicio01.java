
package semana04.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author c20177
 */
public class Semana04Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;
        String dia;
        System.out.println("SISTEMA DE DÍSA DE LA SEMANA\n");
        System.out.print("Ingresa un número del 1-7: ");
        valor=sc.nextInt();
        switch(valor){
            case 1:
                dia="LUNES";
                break;
            case 2:
                dia="MARTES";
                break;
            case 3:
                dia="MIERCOLES";
                break;
            case 4:
                dia="JUEVES";
                break;
            case 5:
                dia="VIERNES";
                break;
            case 6:
                dia="SABADO";
                break;
            case 7:
                dia="DOMINGO";
                break;
            default:
                dia="";
        }
        if(dia.equals(""))
            System.out.println("Día ingresado incorrecto...");
        else
            System.out.println("El día ingresado es: "+dia);
    }
    
}
