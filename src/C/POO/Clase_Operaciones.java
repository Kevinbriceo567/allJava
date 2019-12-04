
package C.POO;

import javax.swing.JOptionPane;

public class Clase_Operaciones {
    /// ATRIBUTOS GLOBALES
    int suma;
    int resta;
    int multi;
    int divi;
    
    ///METODOS
    
    ///Método para sumar ambos números
    public void sumar(int numero1, int numero2){
        suma=numero1+numero2;
    }
    
    ///Método para restar ambos números
    public void restar(int numero1, int numero2){
        resta=numero1-numero2;
    }
    
    ///Método para multiplicar ambos números
    public void multi(int numero1, int numero2){
        multi=numero1*numero2;
    }
    
    ///Método para dividir ambos números
    public void divi(int numero1, int numero2){
        divi=numero1/numero2;
    }
    ///Método para mostrar los números
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
    }
    
}
