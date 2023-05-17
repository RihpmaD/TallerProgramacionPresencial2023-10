package semanas08ejercicio02;

import java.util.Scanner;

/**
 *
 * @author c20177
 */
public class Semanas08Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        double sum = 0;
        System.out.println("\n\t\tESTRUCTURA REPETITIVA\n");
        do {
            System.out.print("Ingrese el numero de terminos: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("valor ingresado incorrecto...");
            }
        } while (n <= 0);
        do {
            System.out.print("Ingrese el valor de la variable x: ");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("valor ingresado incorrecto...");
            }
        } while (x <= 0);
        System.out.println("\n\tRESULTADO DE LA SECUENCIA\n");
        for (int i = 1; i <= n; i++) {
            if (primo(i)) {
                continue;
            }
            sum += (x * 2 * i - 1);
            if (i != n) {
                System.out.print((x * 2 * i - 1) + " + ");
            } else {
                System.out.print((x * 2 * i - 1) + " = ");
            }
        }
        System.out.println(sum + "\n");
    }

    public static boolean primo(int numero) {
        int c = 0;
        if(numero==1)
            return true;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                c++;
            }
        }
        return c == 2;
    }

}
