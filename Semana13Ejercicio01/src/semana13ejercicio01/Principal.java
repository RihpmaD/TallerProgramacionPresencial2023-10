
package semana13ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Empleado listaEmpleado[]=new Empleado[2];
        String nombre, dni;
        int edad;
        boolean casado=true;
        double salario;
        char temp;
        System.out.println("\n\tSISTEMA DE REGISTRO DE EMPLEADO\n");
        //Ingreso de valores
        for(int i=0;i<=listaEmpleado.length;i++){
            System.out.println("\n\tINGRESE INFORMACIÓN "+(i+1));
            do{
                System.out.print("Ingrese el nombre completo: ");
                nombre=sc.nextLine();
                if(!nombre.matches("[a-z A-Z]*")){
                    System.out.println("Nombre ingresado incorrecto...");
                }
            }while(!nombre.matches("[a-z A-Z]*"));
            do{
                System.out.print("Ingrese el numero de DNI: ");
                dni=sc.nextLine();
                if(!dni.matches("[0-9]{8}")){
                    System.out.println("DNI ingresado incorrecto...");
                }
            }while(!dni.matches("[0-9]{8}"));
            try{
                do {
                    System.out.print("Ingrese la edad de la persona: ");
                    edad = sc.nextInt();
                    if (edad < 18 || edad > 45) {
                        System.out.println("Edad ingresada incorrecta...");
                    }
                } while (edad < 18 || edad > 45); 
            }catch(InputMismatchException e){
                System.out.println("Valor ingresado no es un número...");
                edad=18;
            }
            
            do{
                sc.nextLine();
                System.out.print("Esta casado[s|n]: ");
                temp=sc.next().toUpperCase().charAt(0);
                sc.nextLine();
                if(temp!='S' && temp!='N')
                    System.out.println("Valor ingresado es incorrecto...");
                else{
                    switch(temp){
                        case 'S':
                            casado=true;
                        case 'N':
                            casado=false;
                    }
                }
            }while(temp!='S' && temp!='N');
            salario=(Math.random()*1300.00)+1;
            try{
                listaEmpleado[i]=new Empleado(nombre, dni, edad, casado, salario);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No se puede agregar porque arreglo lleno...");
            }
            
        }
    }
    
}
