
package semana11ejercicio01;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana11Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fila;
        int salarios[][];
        String nombres[];
        System.out.println("\n\t\tSISTEMA CONTABLE\n\tDIMESIONES DE LA MATRIZ\n");
        do{
            System.out.print("Ingrese la cantidad de empleados: ");
            fila=sc.nextInt();
            if(fila<=0)
                System.out.println("La cantidad ingresada es incorrecta...");
        }while(fila<=0);
        sc.nextLine();
        nombres=new String[fila];
        salarios=new int[fila][4];
        for(int i=0;i<fila;i++){
            do{
                System.out.println("Ingrese el nombre del trabajador ["+(i+1)+"]: ");
                nombres[i]=sc.nextLine();
                if(!nombres[i].matches("[a-z A-Z]*"))
                    System.out.println("Nombre ingresado incorrecto...");
            }while(!nombres[i].matches("[a-z A-Z]*"));
            salarios[i][0]=(int)(Math.random()*500)*5;
            salarios[i][1]=(int)(Math.random()*30);
            if(salarios[i][1]<=5)
                salarios[i][2]=100;
            else
                if(salarios[i][1]<=10)
                    salarios[i][2]=250;
                else
                    if(salarios[i][1]<=20)
                        salarios[i][2]=400;
                    else
                        salarios[i][2]=550;
            salarios[i][3]=salarios[i][0]+salarios[i][2];
        }
        System.out.println("\n\tMOSTRAR DATOS DE EMPLEADOS\n");
        System.out.print("NOMBRES\t\tSALARIO\tTIEMPO\tAUMENTO\tTOTAL\n");
        for(int i=0;i<salarios.length;i++){
            System.out.print(nombres[i]+"\t");
            System.out.print("S/."+salarios[i][0]+"\t");
            System.out.print(salarios[i][1]+"\t");
            System.out.print("S/."+salarios[i][2]+"\t");
            System.out.print("S/."+salarios[i][3]+"\n");
        }
    }
    
}
