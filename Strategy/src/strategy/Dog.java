/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author cisco
 */
public class Dog extends Animal {

    public Dog() {
        super();
    flyingtype= new cantFly();    
    }

    public void run() {
        System.out.println("I'm running!");
    }
    
}
