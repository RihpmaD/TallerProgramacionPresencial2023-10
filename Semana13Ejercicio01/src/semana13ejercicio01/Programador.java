
package semana13ejercicio01;

/**
 *
 * @author C20177
 */
public class Programador extends Empleado{
    
    private int lineasDeCodigoPorhora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(int lineasDeCodigoPorhora, String lenguajeDominante, 
            String nombre, String dni, int edad, boolean casado, 
            double salario) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorhora = lineasDeCodigoPorhora;
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador{" + "\n\tLineas De Codigo Por hora=" + 
                lineasDeCodigoPorhora + "\n\tLenguaje Dominante=" + 
                lenguajeDominante + "\n\t"+'}'+"\n"+super.toString();
    }

    
}
