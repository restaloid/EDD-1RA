/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_eva1_e;
/**
 *
 * @author Luis Quiñones /24550272
 */
public class EXAMEN_EVA1_e {

    public static void main(String[] args) {
        System.out.println(":");
         int  fillArray[] = new fillArray[10];
         
         //Generacion de llenado de numeros en el arreglo
         for(int i =0; i< fillArray.length; i++){
                fillArray[i] = (Math.random(*100);
         }
         //Imprimir los numeros del arreglo
         for(int i = 0; i<fillArray.length; i++){
             System.out.print("["+ fillArray[i]+"]");
         }
         
         //Creacion del 2do arreglo;
         int[] copyArray = new copyArray[10];
         for(int i = 0; i<copyArray.length; i++){
             copyArray[i] = fillArray[i];
         }
         
         //4. Mostrar arreglo Original
         for(int i = 0; i<fillArray.length; i++){
             System.out.print("["+ fillArray[i]+"]");
         }
         //4.1 Mostrar arreglo copiado
         for(int i = 0; i<copyArray.length; i++){
             System.out.print("["+ copyArray[i]+"]");
         }
         //4.2 editar el valor 0 del arreglo copiado
         copyArray[0]=999;
         //4.3
         
         //4. Mostrar arreglo Original
         for(int i = 0; i<fillArray.length; i++){
             System.out.print("["+ fillArray[i]+"]");
         }
         //4.1 Mostrar arreglo copiado
         for(int i = 0; i<copyArray.length; i++){
             System.out.print("["+ copyArray[i]+"]");
         }
         
         //5.add array
         
         int espacios= 5;
         int existspaces = fillArray.length;
         int total= espacios+existspaces;
         int nuevoArray[]= new nuevoArray[total;]
         
         //5.1
         for(int i =0; i<fillArray.length; i++){
             nuevoArray[i] = fillArray[i];
         }

        //5.2
         for(int i = fillArray.length ; i<fillArray.length; i++){
             nuevoArray[i] =0;
         }
          //5.5 Mostrar arreglo nuevo
         for(int i = 0; i<nuevoArray.length; i++){
             System.out.print("["+ nuevoArray[i]+"]");
         }
         
         
         
         
    }
    
}
