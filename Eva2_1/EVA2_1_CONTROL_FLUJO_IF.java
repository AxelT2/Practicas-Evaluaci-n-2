/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_control_flujo_if;

/**
 *
 * @author temporal2
 */
import java.util.*;
import java.lang.Math;

public class EVA2_1_CONTROL_FLUJO_IF {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double califa;
        
        System.out.println("Input Califa");
        califa = input.nextDouble();
        while (califa > 100) {
            System.out.println("No manches, eso ni se puede ponla bien");
            califa = input.nextDouble();
        }
        if (califa <= 70) {
            System.out.println(Double.toString(califa) + "?, te pases de lanza obvio REPROBASTE");
        } else {
            System.out.println(Double.toString(califa) + ", Ya la hiciste viejon");
        }
    }
}


