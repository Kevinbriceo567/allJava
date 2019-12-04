package A.Fundamental;

public class Funciones {
    
    public static void main(String[] args) {
        
        System.out.println(multiplicar(2,2));
        
        mensaje();
        
        }

    // FUNCIÓN QUE MULTIPLICA NÚMEROS
    private static int multiplicar(int x, int y)
    {
        return x * y;
    }
    
    // FUNCIÓN QUE IMPRIME MENSAJE
    public static void mensaje(){
        System.out.println("Hola");
    }
}
