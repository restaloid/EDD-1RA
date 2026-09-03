package com.mycompany.eva1_6_arreglos;

/**
 *
 * @author Luis
 */
public class EVA1_6_ARREGLOS {

    public static void main(String[] args) {
       // acceso por indices
        int[] arreglo1 = new int [10]; 
       arreglo1[1]=100;
       //en java, el prier elemento esta en la posición 0, el útimo en n-1;
       //donde n es el tamaño del arreglo
       for (int i =0; i<10; i++){//Llenarlo de valores aleatorios entre 0 y 99
            arreglo1[i] = (int) (Math.random()*1000);
           System.out.println("["+ arreglo1[i]+"]");  
       }
       
    }
}
