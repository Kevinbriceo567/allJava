/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B.Intermediate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kevin Briceño
 */
public class Archivos_ModificarTxt {
    
        ///VARIABLE GLOBAL
    File archivo;
    
    
    private void crearArchivo(){
        try {
            archivo=new File("prueba.txt");
            
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo");
        }
        
    }
    
    
    
    private void crearDirect(){
        archivo= new File("carpetaP");
        
        if (archivo.mkdir()) {
            System.out.println("Directorio creado");
        }
        else{
            System.err.println("Directorio no creado");
        }
        
    }
    
    
    ///ESCRIBIMOS EN EL ARCHIVO CON LA CLASE FileWriter
    private void writeText(){
        try {
            ///ELEGIMOS SOBRE QUE ARCHIVO ESCRIBIR
            FileWriter write=new FileWriter(archivo);
            write.write("EL ANIME DEBERÍA SER PROHIBIDO");
            write.write("\r\nSII");
            
            ///DEBEMOS CERRAR EL OBJETO
            write.close();
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribri sobre el archivo");
        }
        
        
    }
    
    private void addText(){
        try {
            ///SI TIENE EL TRUE, VA A AÑADIR TEXTO
            FileWriter write=new FileWriter(archivo,true);
            write.write("\r\nPROHIBIDO");
            write.write("\r\nNOO");
            
            ///DEBEMOS CERRAR EL OBJETO
            write.close();
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribri sobre el archivo");
        }
        
        
    }
    
    private void readText(){
        String cadena;
        
        try {
            FileReader lector=new FileReader(archivo);
            
            BufferedReader lecturaB=new BufferedReader(lector);
            cadena=lecturaB.readLine();
            
            //EL METODO SERÁ NULL CUANDO NO HAYA MAS PARA LEER
            while(cadena!=null){
                System.out.println(cadena);
                cadena=lecturaB.readLine();
            }
            
            
            
            
        }catch (FileNotFoundException ex) {
            System.err.println("error");
        
        } catch (IOException ex) {
                System.err.println("error");
        }
        
    }
    
    ///METODO MAIN PARA CREAR LOS ARCHIVOS
    public static void main(String[] args) {
        Archivos_ModificarTxt archivo1=new Archivos_ModificarTxt();
        
        archivo1.crearArchivo();
        archivo1.writeText();
        archivo1.addText();
        archivo1.readText();
        
    }
    
}
