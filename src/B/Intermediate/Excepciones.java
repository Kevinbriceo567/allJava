package B.Intermediate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Excepciones {
    
    // TRY CATCH VERIFICADA //
    
        ///LEEMOS UN ARCHIVO
        public void leer() throws FileNotFoundException, IOException{
        File archivo=new File("D:\\texto.txt");
        FileReader fr=new FileReader(archivo);
        BufferedReader bf=new BufferedReader(fr);
        String linea;
        
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }
        
    }
        
        public void leer2(){
            
        try{///INSTANCIAMOS LA POSIBILIDAD DE UNA EXCEPCION
            leer();
        }
        
        catch(FileNotFoundException ex){ ///LA CAPTURAMOS
            System.out.println("No se ha encontrado el archivo deseado");
        }
        catch(IOException ex2){ ///DE FORMA QUE EL PROGRAMA CONTINUE
            System.out.println("Excepcion verificada");
        }
        finally{ ///EL FINALLY SE EJECUTA SIEMPRE, INDEPENDIENTEMENTE DE LA EXCEPCION
            
        }
        
            System.out.println("Programa terminado");
        }
        
            public static void main(String[] args) {
        Excepciones prueba=new Excepciones();
        prueba.operaciones2();
        
        prueba.leer2();
    }
            
    // TRY CATCH NO VERIFICADA //
            
        public void operaciones(){
        int num1=5,num2=0;
        
        int resultado=num1/num2;
        
        System.out.println(resultado);
    }
    
    public void operaciones2(){
        try{ ///INTENTAMOS CORRER EL METODO
            operaciones();
        }catch(ArithmeticException a){ ///AL ENCONTRAR UN ERROR, LO ATRAPA
            System.out.println("La división entre cero no está definida");
        }
        
        System.out.println("Programa terminado");
    }

    // THROW PERSONALIZADAS
        private int numero;
    private Scanner entry;
    
    public void introducirNumeros() throws ExcepcionPersonalizada{///
        
        entry=new Scanner(System.in);
        
        do {
            System.out.println("Digite un numero");
            numero=entry.nextInt();
            
            
            if (numero==0) { ///QUIERO PRODUCIR UNA EXCEPCION PERSONALIZADA
                throw new ExcepcionPersonalizada();
            }
            
        }while(numero!=0 && numero!=1);///SOLO LANZA LA EXCEPCION EN CASO DEL NUMERO SER IGUAL 0
        
    }///
    
    
    public void throwPersonalizada() throws ExcepcionPersonalizada {
        Excepciones prueba = new Excepciones();
        
        try{
            prueba.introducirNumeros();
        }catch(ExcepcionPersonalizada e){
            System.out.println("Ha introducido el numero cero");
        }
        
        System.out.println("Programa terminado");
        
    }
    

}