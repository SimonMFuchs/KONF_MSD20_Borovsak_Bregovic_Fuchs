package at.fhj.iit;

import java.util.Date;

/**
 * represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink extends Drink implements PurchasableDrink{

    /**
     * uses only one liquid
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
        this.price = l.getPrice();
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    /**
     * Returns the price of liquid l
     *
     * @return price of liquid as double
     */
    @Override
    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }

    /**
     * creates a sale with the current time and the drink information and adds it to the cash register
     */
    @Override
    public void purchase(CashRegister cashRegister) {
        cashRegister.addSale(new Sale(cashRegister.getCurrentCashier(), this.getPrice(), this.getAlcoholPercent()));
    }
}
