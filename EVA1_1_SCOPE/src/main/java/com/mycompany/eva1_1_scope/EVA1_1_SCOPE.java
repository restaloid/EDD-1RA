package com.mycompany.eva1_1_scope;

/**
 *
 * @author Luis Carlos Quiñones Escoboza
 */
public class EVA1_1_SCOPE {

    public static void main(String[] args) {
        int x = 100;
        for (int i = 0; i <10; i++){
            System.out.println("Valor de i = "+i){  
        }
            System.out.println("Valor final de la i= " + i); //NO EXISTE AQUI
            System.out.println("Valor final de la x = " + x); // EXISTE AQUI
        }
    }
    public static vouid OtraFuncion(){
        System.out.println("Valor de x = " +x); // NO EXISTE AQUI
    }
}
