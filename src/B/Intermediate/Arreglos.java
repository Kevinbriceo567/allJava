
package B.Intermediate;

public class Arreglos {
    
    public static void main(String[] args) {
        
        // DEFINICION
        // ESTABLECEMOS LA CANTIDAD DE ELEMENTOS QUE CONTENDRÁ
        //int [] edades = new int[5];  
        
        // TODOS LOS VALORES DESDE EL INICIO
        int [] edades = {25, 76, 45, 18};
        
        // ESTABLECIENDO VALOR
        edades[0] = 17;
        
        // IMPRIMIENDO UNA POSICIÓN DEL ARREGLO
        System.out.println(edades[0]);
        
        // RECORRIENDO CADA POSICIÓN
        for (int i=0; i<edades.length; i++) {
            System.out.println(edades[i]);
        }
        
    }
    
}
