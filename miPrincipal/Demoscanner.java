package miPrincipal;
/* 
 * Proposito: mostrar por consola
 *    la entrada
*/
import java.util.Scanner;
public class Demoscanner {
    public static void main(String[] args) {
        //Crear el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //obtiene la primera entrada
        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.nextLine();
        System.out.println("¿Cual es tu edad?");
        int edad = teclado.nextInt();
        System.out.println("¿Cuanto deseas ganar?");
        double sueldoDeseado = teclado.nextDouble();
        System.out.print("Buenos dias "+ nombre+
                     " me dices que tienes "+edad+" años de edad \n"+
                     " y que deseas ganar "+sueldoDeseado);
        //Cuando no lo use, cierro el objeto Scanner
        teclado.close();
}