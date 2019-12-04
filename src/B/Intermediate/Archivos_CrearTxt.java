/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B.Intermediate;

import java.io.File;

/**
 *
 * @author Kevin Briceño
 */
public class Archivos_CrearTxt {
        public static void main(String[] args) {
        
        
        File archivo=new File("Archivos//prueba.txt");
        
        if (archivo.exists()) {
            System.out.println("Existe");
            System.out.println("Ruta absoluta:" + archivo.getAbsolutePath());
            System.out.println("Se puede leer?: "+archivo.canRead());
        }
        else{
            System.out.println("No existe");
        }
    }
}
