/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_reference;

/**
 *
 * @author Luis Quiñones    
 */
public class EVA1_5_REFERENCE {

    
    public static void main(String[] args) {
        int x = 5;
        System.out.println("valor de x=");
        incrementar(x);
        System.out.println("Valor de x modificado = "  + x);  
        //Ahora con objetos
        Mivalor mv = new MiValor();
        System.out.println("MiValor.y = " + mv.y);
        incrementarOjb(mv);
        System.out.println("MiValor.y =" +mv.y);
    }
    public static void incrementar(int valor){
        valor = valor+1;
        
    }
    public static void incremetarObj(MiValor valor){
        valor.y = valor.y+1;
    }
    
}
