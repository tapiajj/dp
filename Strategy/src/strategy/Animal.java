/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author cisco
 */
public class Animal {

    private String name;
    private double weight;
    private double height;
    private String foodbrand;
    private String color;
    private String sound;
    public Flys flyingtype;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        }
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the foodbrand
     */
    public String getFoodbrand() {
        return foodbrand;
    }

    /**
     * @param foodbrand the foodbrand to set
     */
    public void setFoodbrand(String foodbrand) {
        this.foodbrand = foodbrand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String fly() {
        return flyingtype.fly();
    }

    public void setFly(Flys newfly) {
        flyingtype = newfly;
    }
}