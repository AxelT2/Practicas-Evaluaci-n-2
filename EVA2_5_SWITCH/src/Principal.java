
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner spider = new Scanner(System.in);
        System.out.println("Introduce el número de mes");
        int mes = spider.nextInt();
        switch (mes){
            case 1: 
                System.out.println("Enero");
            break;    
                
            case 2: 
                System.out.println("Febrero");
            break;   
                
            case 3: 
                System.out.println("Marzo");
            break;    
            default:
                System.out.println("No corresponde con ningún mes");
        }
        
    }
    
}
