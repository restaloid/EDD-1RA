package eva1_4_referencias;

/**
 *
 * @author Luis carlos Quiñones 
 */
public class EVA1_4_REFERENCIAS {
    public static void main(String[] args) {
        //REFERENCIAS --> DIRECCION DE MEMROIA
        //APUNTADORES --> DIRECCIONES DE MEMORIA --> C++
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //Quitar la direccioon
        prueba = null; //permite destruir (liberar memoria) de un objeto
        //COMO DESTRUYE JAVA LOS OBJETOS QUE YA NO SE VAN A AUSAR?
        
    }
    class Prueba{
        
    }
    
}
