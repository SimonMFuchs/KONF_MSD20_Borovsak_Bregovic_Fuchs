package at.fhj.iit;

import java.util.Date;

/**
 * Configuration management
 * Exercise 4 - Class Wine
 * Author: Katarina Borovsak
 * Last modified: 25.04.2021
 */

public class Wine extends Drink implements PurchasableDrink {

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
        this.price = w.getPrice() + a.getPrice();
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
        return name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        String alcoholPercent = String.format("%.1f", getAlcoholPercent());

            return "Mixed wine drink " + name + " with " + alcoholPercent + " percent alcohol by volume";
    }

    /**
     * creates a sale with the current time and the drink information and adds it to the cash register
     */
    @Override
    public void purchase(CashRegister cashRegister) {
        cashRegister.addSale(new Sale(new Date(), cashRegister.getCurrentCashier(), this.getPrice(), this.getAlcoholPercent()));
    }
}


