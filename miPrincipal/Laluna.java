package miPrincipal;

public class Laluna {
    public static void main(String[] args) {
        final int LUNA = 238857;
        System.out.println("Distancia de la luna "+LUNA+"millas");
        int lunaKilo;
        //Utilizamos el cast para convertir el resultado a entero
        lunaKilo = (int)(LUNA*1.609); //Una milla = 1.609 kilometros
        System.out.println("En kilometros es "+lunaKilo+"Km");
    }
    
}