package Fundamental;

public class Bucles {
    
    public static void main(String[] args) {
        int edad = 18;
    
        // CICLO WHILE
        while (edad < 20) {
                edad = edad +1;
                System.out.println(edad);
        }
        
        // CICLO DO WHILE
        do {
            edad = edad +1;
            System.out.println(edad);
        } while(edad < 25);
        
        // CICLO FOR
        for (int i=0; i<10; i++) {
            
            System.out.println(i);
        }
        
        // FOR EACH
        int [] edades = {25, 76, 45, 18};
        
        for(int e : edades) {
            System.out.println(e);
        }
        
    }
    
}
