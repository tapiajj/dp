/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author cisco
 */

public interface Flys {
    String fly();
}
class canFly implements Flys{
    public String fly(){
    return "I'm high!";}

}
class cantFly implements Flys{
    public String fly(){
    return "I can't fly";
    }
}
