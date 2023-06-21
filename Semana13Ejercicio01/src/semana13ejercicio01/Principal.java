
package semana13ejercicio01;

/**
 *
 * @author C20177
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("MANEJO DE PERSONAL IPM Tech\n");
        Programador programador1=new Programador(100, 
                "Java", "Juan Perez", "12345678", 
                30, true, 3200);
        System.out.println(programador1+"\n");
        Programador programador2=new Programador(200, 
                "C++", "Maria Garcia", "23456789", 
                35, false, 4000);
        System.out.println(programador2);
    }
    
}
