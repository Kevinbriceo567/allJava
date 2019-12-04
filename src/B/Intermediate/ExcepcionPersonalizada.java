/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B.Intermediate;

/**
 *
 * @author Kevin Briceño
 */

public class ExcepcionPersonalizada extends Exception{
    
    public ExcepcionPersonalizada(){
        super("Se ha introducido el número 0");
    }
    
}