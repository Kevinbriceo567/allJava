package C.POO;

public class Clase_Persona {
    
    ///ATRIBUTOS
    String nombre;
    int edad;
    String dni;
    
    ///METODOS
    ///CONSTRUCTOR 1
    public Clase_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    ///CONSTRUCTOR 2
    public Clase_Persona(String dni) {
        this.dni = dni;
    }
    
    ///SOBRECARGA DE METODOS///
    public void correr(){
        System.out.println("Soy " + nombre + ", tengo " + edad + ", y estoy corriendo una maratón");
    }
    
    public void correr(int km){
        System.out.println("He corrido " + km + " kilometros");
    }
    ///////////////////////////
}
        