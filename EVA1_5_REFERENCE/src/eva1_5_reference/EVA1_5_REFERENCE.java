public class EVA1_5_REFERENCE {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("valor de x = " + x);
        incrementar(x);
        System.out.println("Valor de x modificado = "  + x);  
        
        //Ahora con objetos
        MiValor mv = new MiValor();
        System.out.println("MiValor.y = " + mv.y);
        incrementarObj(mv);
        System.out.println("MiValor.y =" +mv.y);
    }
    public static void incrementar(int valor){
        valor = valor+1;
        
    }
    public static void incrementarObj(MiValor valor){
        valor.y = valor.y+1;
    }
    
}
class MiValor {
    int y = 5;
}
