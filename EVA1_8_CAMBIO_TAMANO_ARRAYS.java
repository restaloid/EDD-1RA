public class EVA1_8_CAMBIO_TAMANO_ARRAYS {
    public static void main(String[] args) {
        int [] datos = new int[10];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i< datos.length; i++){
            System.out.print(datos[i] + " ");
        }
        System.out.println("");
        datos = new int[5];
        System.out.println(datos);
        for(int i = 0; i< datos.length; i++){
            System.out.print("[" +   datos[i] + "] ");  
        }
    }
}
