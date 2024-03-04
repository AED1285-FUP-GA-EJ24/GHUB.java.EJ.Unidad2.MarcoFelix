package miPrincipal;
/*
 * Accesoa a una variable desde fuera de la clase Calor:
 * Privados
 * Proteguidas
 * Omision (Sin identificador de acceso)
 * Public son vistas desde cualquier clase
 */

public class Calor{
    private int x, g, t; //Solo son accesibles dentro dela clase 
    protected double gr; // Son accesible en todo el paquete son derivadas

    float nt; // Por omision (no tiene modificador de acceso), pueden ser vistas desde cualquier clase del paquete

    public int i; //Es accesible desde cualquier clase

    double calculo(){
        double x = 1; //Declaracion local
        gr = g*t+x;
        return gr;
    }
   
}