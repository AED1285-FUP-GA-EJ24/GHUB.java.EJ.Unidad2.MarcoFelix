package miPrincipal;

public class Frigo{
    protected double frigorias; //Variable de clase
    public double frigorias(Calor p){
    double x; // Variable local
    x = p.gr+frigorias-p.nt;// La variable es visible porque es protected
                            // Y la variable nt es visible porque es por omision
                            // Las variables privadas de la clase Calor no son visibles desde la clase Frigo
    return x;                        
 }
}