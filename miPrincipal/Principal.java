package miPrincipal;
//Comentario
import biblioteca.Libro; //importa únicamente la clase Libro
import biblioteca.*; //importa todas las clases del paquete libro

public class Principal {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo, soy Lourdes"); //Esto es un comentario
        //Demostración de tipo de variable
        /*
         * Los tipos de datos float y double tienes 3 valores especiale:
         * infinito positivo
         * infinito negativo
         * NaN (Not a Number)
         */
        System.out.println(Math.sqrt(8)); //retorna un punto flotante
        System.out.println(Math.sqrt(-1)); //es un NaN
        System.out.println(1.1e5 * 1.1e2);
        System.out.println(1.10000 * 1.10);
        System.out.println(1.1e200 * 1.1e200); // esto retorna un Infinito positivo
        System.out.println(-1.1e200 * 1.1e200); // esto retorna un Infinito negativo
        //Tipo de dato char
        char car="A"; //las constantes char se
                          //colocan entre comillas
        car = "\101";
        System.out.println(car);
        car = "\u0041";
        System.out.println(car);
        car = "\165";
        System.out.println(car);
        //Tipo de dato logico
        boolean bandera; //declarando la variable boleana
        bandera = true;
        bandera = false;
        if (bandera) System.out.println("Es verdadero");
        //Ejemplo de envoltorios
        //convierte la cadena "123" a un tipo de dato Entero
        double s;
        System.out.println(Integer.parseInt(s:"123"));
        System.out.println(Long.parseLong(s:"165"));
        System.out.println(Byte.parseByte(s:"21"));
        System.out.println(Short.parseShort(s:"45"));
        System.out.println(Float.parseFloat(s:45.89));
        System.out.println(Double.parseDouble(s:"1.5e8"))
    }
}