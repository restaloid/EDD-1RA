/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_rapidez_arreglos;

/**
 *
 * @author Luis
 */
public class EVA1_7_RAPIDEZ_ARREGLOS {

    public static void main(String[] args) {
        // acceso por indices
        int[] arreglo1 = new int [1000000000]; 
       arreglo1[1]=100;
       for (int i =0; i<arreglo1.length; i++){//Llenarlo de valores aleatorios entre 0 y 99
           arreglo1[i] = (int) (Math.random()*1000);
           
       }
    }
}
