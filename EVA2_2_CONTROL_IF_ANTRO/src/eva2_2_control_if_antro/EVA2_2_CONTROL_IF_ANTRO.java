/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_control_if_antro;

import java.util.*;

public class EVA2_2_CONTROL_IF_ANTRO {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quieres pasar, a ver, ¿cuantos años tienes?");
        int edad;
        
        edad = input.nextInt();
        while (edad >= 100) {
            System.out.println("No estes de payaso, vuelvela a poner ");
            edad = input.nextInt();
        }
        if (edad >= 18) {
            System.out.println("¿Traes credencial? (si/no)");
            String cred;
            
            cred = input.nextLine();
            if (cred.equals("si")) {
                System.out.println("A no pues asi sí, pasale karnal");
            } else {
                System.out.println("Pues ahí te la encargo pa la siguiente, no?. Ya botate de aquí");
            }
        } else {
            System.out.println("Mira que chistosito ni pa que te asomas por aquí, ya llegale de aquí");
        }
    }
}
