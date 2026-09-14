package com.mycompany.eva1_10_matrices;

/**
 *
 * @author Luis
 */
public class EVA1_10_MATRICES {

    public static void main(String[] args) {
        int [][] matriz =  new int [5][3]; // 15 enteros --X matriz de 5 filas por 3 columnas
        //llenar con datos aleatorios
        for(int i = 0 ; i<matriz.length; i++){//Primero dimension (5 filas)
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
        for (int i= 0; i<matriz.length; i++){
            for (int j=0 ; j<matriz[i].length;j++){
                System.out.println("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
