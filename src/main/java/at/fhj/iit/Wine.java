package at.fhj.iit;

/**
 * Configuration management
 * Exercise 4 - Class Wine
 * Author: Katarina Borovsak
 * Last modified: 25.04.2021
 */

public class Wine extends Drink {

    /**
     * represents two different liquids from Liquid class: w, a
     */

    protected Liquid w;
    protected Liquid a;

    /**
     * represents a constructor Wine, with parameters name and two liquids
     */

    public Wine (String name, Liquid w, Liquid a) {
        super(name);
        this.w = w;
        this.a = a;
    }

    /**
     * represents a method for printing out new created drink Wine
     */

    public String printOut(){
        String alcoholPercent = String.format("%.1f", getAlcoholPercent());
        return "Wine drink is called " + name + " with " + alcoholPercent + " alcohol percent";
    }

    /**
     * Method from class Drink
     * returns the volume of drink in litre
     */

    @Override
    public double getVolume() {
        return w.getVolume() + a.getVolume();
    }

    /**
     * Method from class Drink
     * returns the alcohol percent
     */

    @Override
    public double getAlcoholPercent() {
        return w.getAlcoholPercent();
    }

    /**
     * Method from class Drink
     * returns the boolean value (true or false) if the drink is alcoholic or not
     */

    @Override
    public boolean isAlcoholic() {
        if (w.getAlcoholPercent() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}


