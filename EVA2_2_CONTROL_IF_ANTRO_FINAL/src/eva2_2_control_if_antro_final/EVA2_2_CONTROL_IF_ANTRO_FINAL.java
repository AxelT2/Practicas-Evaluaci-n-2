/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_control_if_antro_final;
import java.util.*;

public class EVA2_2_CONTROL_IF_ANTRO_FINAL {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quieres pasar, a ver, ¿cuantos años tienes?");
        int edad;
        
        edad = input.nextInt();
        while (edad >= 100) {
            System.out.println("No estes de payaso, vuelvela a poner ");
            edad = input.nextInt();
        }
        System.out.println("¿Traes credencial? (true/false)");
        boolean cred;
        
        cred = input.nextBoolean();
        if (edad >= 18 && cred == true) {
            System.out.println("A no pues asi sí, pasale karnal");
        } else {
            System.out.println("Mira que chistosito ni pa que te asomas por aquí, ya llegale de aquí");
        }
    }
}
