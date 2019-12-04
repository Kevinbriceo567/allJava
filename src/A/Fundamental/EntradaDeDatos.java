
package A.Fundamental;

import java.util.Scanner;

public class EntradaDeDatos {
    
    public void Entrada(String[] args) {
	Scanner scanner = new Scanner(System.in); // INSTANCIAMOS EL SCANNER
	System.out.println("escanear:");
	String entrada = scanner.next(); // GUARDA LO ANTERIORMENTE INGRESADO POR CONSOLA 
	System.out.println("mostrar lo escaneado");
	System.out.println(entrada); // SE MUESTRA LO INGRESADO
        
        
    }
    
}
