package partido;

public class Partido {
    public void calcularPuntaje(){
        //definir objetos Scanner
        Scanner teclado = new Scanner(System.in);
        //definir variable de entrada 
        int g,p,e;
        //define variable de salida
        int puntos;

        System.out.println("Proporciona Partidos ganados");
        g = teclado.nextInt();
        System.out.println("Proporciona Partidos empatados");
        e = teclado.nextInt();
        System.out.println("Proporciona Partidos perdidos");
        p = teclado.nextInt();

        //puntos = g*3 + e + p*0

        /*
         * La constante literal 3 es de tipo int, por lo tanto
         * toda la expresion se convierte a int, por lo que no
         * puede de manera IMPLICITA, asignarla a un valor short
         */

        puntos = (short)(g*3 + e);

        System.out.println("Puntaje Obtenido:"+puntos);

        teclado.close();


    }
}
