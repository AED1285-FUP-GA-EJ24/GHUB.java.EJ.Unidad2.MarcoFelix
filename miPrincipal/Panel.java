package miPrincipal;

public class Panel {
    int a,b,c; //Variable de clase
    double betas(){
        double x; //Variable Local
        a = 21; //Esta Variable es visible porque es de clase
        x = 0.01;
        return x;
    }
    int valor; //Variable de clase
    double alfas(){
        float x; //Declaracion local
        b = 19; //Esta Variable es visible porque es de clase
        valor = 0; //Desde un metodo de una clase se puede acceder
        a = 15; 
        x = 1L;
        return x;

    }
    
}