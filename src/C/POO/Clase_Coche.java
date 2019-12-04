package C.POO;

public class Clase_Coche {
    
    ///ATRIBUTOS
        String color;
        String marca;
        int km;
        
    
    public static void main(String[] args) {
        
        ///OBJETO 1
        Clase_Coche coche1 = new Clase_Coche();
        
        coche1.color = "Negro";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche1 es: " + coche1.color);
        System.out.println("La marca del coche1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche1 es: " + coche1.km);
        
        ///OBJETO 2
        Clase_Coche coche2= new Clase_Coche();
        
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
    }
}
