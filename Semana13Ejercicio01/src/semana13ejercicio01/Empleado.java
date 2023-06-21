
package semana13ejercicio01;

/**
 *
 * @author C20177
 */
public class Empleado {
    private String nombre;//Apellidos y Nombres
    private String dni;
    private int edad;//18-45 años
    private boolean casado;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, int edad, 
            boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public void clasificacion(){
        System.out.println("\n\tCLASIFICACIÓN\n");
        if(this.edad<21)
            System.out.println("PRINCIPIANTE...");
        else
            if(this.edad<=35)
                System.out.println("INTERMEDIO...");
            else
                System.out.println("SENIOR...");
    }
    
    public void incrementoSalario(int porcentaje){
        if(porcentaje<0 || porcentaje>100)
            System.out.println("Valor ingresado incorrecto...");
        else{
            this.salario*=(porcentaje/100.0);
            System.out.println("Se incremento el salario en "+
                    porcentaje+"%.");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "\n\tnombre=" + nombre + "\n\tdni=" + 
                dni + "\n\tedad=" + edad + "\n\tcasado=" + 
                casado + "\n\tsalario=" + salario + "\n\t"+'}';
    }
    
}
