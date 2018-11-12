import java.util.*;
import java.lang.Math;

public class Principal {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un año");
        int annio;
        
        annio = input.nextInt();
        if (annio % 4 == 0) {
            if (annio % 100 == 0) {
                if (annio % 400 == 0) {
                    System.out.println("Sí es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            } else {
                System.out.println("Sí es bisiesto");
            }
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
