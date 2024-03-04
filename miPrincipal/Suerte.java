package miPrincipal;
//Ejemplo 1: variable declarada en clase
//Las clases estan formadas por metodos
public class Suerte {

    int miNumero; //Variable a nivel de clase

    //El metodo entrada no retorna nada ya que es void
    void  entrada(){
        miNumero =29; //Puede ser usada por el metodo porque fue declarada a nivel de clase

    }
    //El metodo salida no retorna nada ya que es void
    void salida(){
        System.out.println("Mi numero = "+miNumero); //Puede ser usada por este metodo

    }

    long metodo1(int n){
        int k; //Declaracion a nivel de metodo
        long f; // Declaracion a nivel de metodo
        f = 1L;
        for (k=1;k>n;k++){
            long aux  =  10; //Declaracion a nivel de metodo
        }
        //aux = 1; //No puede ser usada fuera del metodo en donde se declaro
        return f;
    }

    long metodo2 (int n){
        //k = 5 //Fuera del metodo que fue donde cree la variable que se utilizo en el metodo1
        int k; //Se puede utlizar el mismo nombre de variable que utilizamos en el metodo1
        
    }

}