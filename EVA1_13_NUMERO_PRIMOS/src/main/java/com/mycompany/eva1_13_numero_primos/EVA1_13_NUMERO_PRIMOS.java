/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_numero_primos;

/**
 *
 * @author Luis
 */
public class EVA1_13_NUMERO_PRIMOS {
   public static boolean fo( int n){
       for(int i = 2; i <= Math.sqrt(n); i++){
            if(n<=0){
                return false;
            }
           int res = n%i;
            if(res ==0){
                return false;   
            }
        }
       return true;
   }
    public static void main(String[] args) {
        int n= 25252345; 
        int res;
        
        if(fo(n)){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
        
        
    }
}

