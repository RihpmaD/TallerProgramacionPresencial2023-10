
package semana06ejercicio04;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana06Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char turno;
        int horas, acHoras=0, maxHoras=0, minHoras=200, cantidad=1;
        double total=0, totalFinal=0;
        System.out.println("\t\tSISTEMA DE PAGO SEMANAL\n");
        while(cantidad<=5){
            System.out.println("\tTRABAJADOR "+cantidad+"\n");
            System.out.print("Ingrese la cantidad de horas: ");
            horas=sc.nextInt();
            System.out.print("Ingrese el turno [D|N]: ");
            turno=sc.next().toUpperCase().charAt(0);
            switch(turno){
                case 'D':
                    total=10*horas;
                    break;
                case 'N':
                    total=20*horas;
                    break;
            }
            cantidad++;
            acHoras+=horas;
            totalFinal+=total;
            if(horas>maxHoras)
                maxHoras=horas;
            if(horas<minHoras)
                minHoras=horas;
            System.out.println("\n\tREPORTE DE PAGO");
            System.out.println("Cantidad de horas: "+horas);
            if(horas<15)
                System.out.println("Estado: DESPEDIDO");
            else
                System.out.println("Estado: CONTRATADO");
            System.out.printf("Monto a recibir: S/.%.2f%n",total);
            System.out.println("---------------------------------------");
        }
        System.out.println("\n\t\tREPORTE FINAL\n");
        System.out.println("Total de horas trabajadas: "+acHoras);
        System.out.println("Trabajador con mas horas: "+maxHoras);
        System.out.println("Trabajador con menos horas: "+minHoras);
        System.out.printf("Monto total pagado: S/. %.2f%n",totalFinal);
    }
    
}
