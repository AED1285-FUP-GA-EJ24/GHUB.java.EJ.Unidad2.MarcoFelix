package promedio;
// Proposito
// Autor: Marco Felix
// Fecha: 12/03/2024

import java.util.Scanner;

public class Promedio {
    public static void calcularPromedio(){
        Scanner teclado = new Scanner(System.in);
        //declarando la variable de salida
        int r;
        //declarando las variables de entrada
        int n1,n2,n3;
        System.out.print("Proporcona parcial 1:");
        n1 = teclado.nextInt();
        System.out.print("Proporcona parcial 2:");
        n2 = teclado.nextInt();
        System.out.print("Proporcona parcial 3:");
        n3 = teclado.nextInt();
        r = (n1+n2+n3)/3;
        System.out.println("Resultado = "+r);
    }
    
}
