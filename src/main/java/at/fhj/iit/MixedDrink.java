package at.fhj.iit;

/**
 * represents a alcoholic mixed drink
 */
public class MixedDrink extends Drink implements PurchasableDrink{

    /**
     * uses two liquids and a garnish
     */
    protected Liquid l1;
    protected Liquid l2;
    protected String garnish;

    /**
     * Creates a MixedDrink object with given name, liquids and a garnish
     *
     * @param name name of drink
     * @param l1 first liquid
     * @param l2 second liquid to mix with
     * @param garnish garnish in form a string
     */
    MixedDrink(String name, Liquid l1, Liquid l2, String garnish){
        super(name);
        this.l1 = l1;
        this.l2 = l2;
        this.garnish = garnish;
        this.price = l1.getPrice() + l2.getPrice();

        java.util.Locale.setDefault(new java.util.Locale("en", "US"));
    }
    /**
     * Creates a MixedDrink object with given name and liquids
     *
     * @param name name of drink
     * @param l1 first liquid
     * @param l2 second liquid to mix with
     */
    MixedDrink(String name, Liquid l1, Liquid l2){
        super(name);
        this.l1 = l1;
        this.l2 = l2;
        this.price = l1.getPrice() + l2.getPrice();

        java.util.Locale.setDefault(new java.util.Locale("en", "US"));
    }

    /**
     * Returns volume of the drink
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l1.getVolume() + l2.getVolume();
    }

    /**
     * Returns alcohol volume percent of the drink
     *
     * @return alcohol volume percent of the whole drink
     */
    @Override
    public double getAlcoholPercent() {
        return ((l1.getVolume()) * l1.getAlcoholPercent() + (l2.getVolume()) * l2.getAlcoholPercent()) / getVolume();
    }

    /**
     * Gives information if the drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l1.getAlcoholPercent() > 0 || l2.getAlcoholPercent() > 0)
            return true;
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Gives information if the drink has a garnish or not
     *
     * @return true if drink has a garnish, otherwise false
     */
    public boolean hasGarnish() {
        if(garnish != null)
            return true;
        else
            return false;
    }

    /**
     * Prints object information
     *
     * @return formatted String
     */
    @Override
    public String toString(){
        String alcoholPercent = String.format("%.1f", getAlcoholPercent());
        if(hasGarnish())
            return "Mixed Drink called " + name + " with " + alcoholPercent + " percent alcohol by volume and with " + garnish + " as garnish";
        else
            return "Mixed Drink called " + name + " with " + alcoholPercent + " percent alcohol by volume";
    }

    /**
     * creates a sale with the current time and the drink information and adds it to the cash register
     */
    @Override
    public void purchase(CashRegister cashRegister) {
        cashRegister.addSale(new Sale(cashRegister.getCurrentCashier(), this.getPrice(), this.getAlcoholPercent()));
    }
}
