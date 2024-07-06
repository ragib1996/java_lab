/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreadtrial;

/**
 *
 * @author Ragib Mehedi
 */
public class Mythreadtrial{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass n= new NewClass();
        N n2=new N();
        n.start();
        n2.start();
    }
    
}
