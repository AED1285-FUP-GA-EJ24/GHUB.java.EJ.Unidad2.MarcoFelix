package miPrincipal;

public class DemoConversionTipo{
public static void main(String[] args){
    //Conversiones explicitas e implicitas

    float a = (float)8.5; //Asignar un valor double a un valor float
                        // Intenta oasar un double a un float eso se tiene que hacer de forma EXPLICITA

    double b = 8.5; //Conversion implicita se puede hacer porque un float necesita 4bytes
                    // y un double 8bytes, por lo tanto una  variable de menor capacidad se
                    //puede almacenar IMPLICITAMENTE een uno de mayor capacidad
     int c = (int) b; //Intento pasar un valor double a un valor int     
     
     double x = 5; // Asignar una constante literal de tipo double a un valor int se puede hacer de manera IMPLICITA
     double x1 = (double) 5; // Y tambien de manera EXPLICITa

     long y;
     y = (long)(3.2 * 2);
     System.out.println(y);
}

}