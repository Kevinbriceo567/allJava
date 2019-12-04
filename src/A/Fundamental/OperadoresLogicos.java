
package A.Fundamental;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int age = 18;
        int age2 = 20;
        boolean mayor = true;
        
        if (age > 20){
            System.out.println("OPERADOR >");
        }
        else if (age < 20){
            System.out.println("OPERADOR <");
        }
        else if (age >= 20){
            System.out.println("OPERADOR >");
        }
        else if (age <= 20){
            System.out.println("OPERADOR <");
        }
        else if (age == age2){
            System.out.println("OPERADOR ==");
        }
        else if (age != age2){
            System.out.println("OPERADOR !=");
        }
        else if (age < 2 && age2 > 5){
            System.out.println("OPERADOR &&");
        }
        else if (age < 2 || age2 > 5){
            System.out.println("OPERADOR &&");
        }
        else if (!mayor){
            System.out.println("OPERADOR DE NEGACIÓN !");
        }
        
        
        
    }
}
