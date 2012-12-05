/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author cisco
 */
public class Bird extends Animal {
    public Bird() {
        super();
        setHeight(23);
        setWeight(10);
        setColor("yellow");
        flyingtype= new canFly();
        setSound("pio");
    }
    public void sings() {
        System.out.println(getSound());
    }
}