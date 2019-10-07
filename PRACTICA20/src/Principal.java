/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] uno = new int[15];
        int[] colum = new int[15];
        int bruh = (int)(Math.random()*100)+1;
        for (int i = 0; i < uno.length; i++) {
            uno[i] = uno[bruh];
             System.out.println("["+uno[i]+"]"); 
    }
        if(bruh == bruh){
        int conta = 0;
        conta = conta +1;
        }
        for (int i = 0; i < uno.length; i++) {
            System.out.println("["+colum[conta]+"]");
        }
    }
}

class uno{}