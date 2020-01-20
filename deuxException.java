/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfefinal;

/**
 *
 * @author Administrator
 */
public class deuxException extends Exception {
    public deuxException(){
        super();
    }

    @Override
    public String toString() {
       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
    return("Veillez coisir un parmi les Deux ");
    }
    
}
