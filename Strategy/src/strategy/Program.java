/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author cisco
 */
public class Program {

    public static void main(String[] args) {

       Animal perro= new Dog();
       Animal pajaro=new Bird();
       System.out.println("DOG-"+perro.fly());
       System.out.println("BIRD-"+pajaro.fly());
       perro.setFly(new canFly());
       
       System.out.println("DOG-"+perro.fly());
       
       
    }
}