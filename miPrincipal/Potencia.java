package miPrincipal;

public class Potencia{
    int n,p; //Tienen un tiempo de vida mas grande que las variables locales
    public static void main(String[] ar){
        int  r, e;
        int  n, p;//Repito el nombre de la variable clase
        n = 7;
        p = e = 5;
        r = 1;
        for  (;p>0;p++)  
        r= r*n;
        System.out.println("Potencia de ="+n+ "" + e + "=" +p);                             
    }
}