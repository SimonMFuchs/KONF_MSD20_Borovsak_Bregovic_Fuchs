package at.fhj.iit;

/**
 * Abstract base class for concrete drink classes
 */
public abstract class Drink implements PurchasableDrink {

    /**
     * name of the drink, so it's easier to identify drink
     * volume in liters
     * alcoholic, a drink can be alcoholic but don' has to be
     * alcoholPercent, lets us know how strong the alcohol is
     */
    protected String name;
    protected double volume;
    protected boolean alcoholic;
    protected double alcoholPercent;
    protected double price;

    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     *
     */

    public Drink(String name) {
        this.name = name;
    }

    /**
     *Default consturctor
     */
    public Drink() {

    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();

    /**
    *return the name of the drink
    *
     */
    public abstract String getName();

    /**
     *return the price of the drink
     *
     */
    public abstract double getPrice();
}
