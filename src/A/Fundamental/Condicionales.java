
package alljava;

public class Condicionales {
    
    String boyName = "Will";
    
    int boyAge = 18;
    
    public void main(String[] args) {
        
        // IF & ELSE IF & ELSE
        if(boyAge >= 18){
            System.out.println("Puedes pasar");
        }
        else{
            System.out.println("No puedes pasar");
        }
        
        if(boyName == "Kev"){
            System.out.println("Bienvenido");
        }
        else if(boyName == "Ing"){
            System.out.println("Bienvenida");
        }
        else{
            System.out.println("No te conozco");
        }
        
        if(boyName == "Will"){
            System.out.println("Hola!");
        }
        
        int age = 2;
        
        // SWITCH
        switch (age){
            
            case 1:
                System.out.println("Tienes un año");
                break;
                
            case 2:
                System.out.println("Tienes dos años");
                break;
                
            case 3:
                System.out.println("Tienes tres años");
                break;
            
        }
        
        

    }
        

    
}
