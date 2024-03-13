package puntaje;
/*Proposito: Obtener puntae  */

import java.util.Scanner;

public class Puntaje {
    public void calcularPuntaje();
        //declarar objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //variable de entrada
        int c,i,b;
        //variable de salida
        int p;
        System.out.print("Proporciona respuestas correctas");
        c = entrada.nextInt();
        System.out.print("Proporciona respuestas incorrectas");
        i = entrada.nextInt();
        System.out.print("Proporciona respuestas en blanco");
        b = entrada.nextInt();

        p = c*4 - i + b*0;

        System.out.println("Puntaje obtenido="+p);

        entrada.close();

}
