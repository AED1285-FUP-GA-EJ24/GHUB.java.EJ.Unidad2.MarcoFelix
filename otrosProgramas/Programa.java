package otrosProgramas;
//Declaracion de import
import otrosProgramas.*;
public class Programa {
    public static void main(String[] args) {
           obtenerDatos();
           alfabetizar();
           verpalabras();
    }
    public static void obtenerDatos(){
        System.out.println("Estoy en obtener datos del otro paquete otrosProgramas");   
    }
        public static void alfabetizar(){
            System.out.println("Estoy en alfabetizar del otro paquete otrosProgramas");
    }
    public static void verpalabras(){
        System.out.println("Estoy en ver palabras del otro paquete otrosProgramas");
}
    
}