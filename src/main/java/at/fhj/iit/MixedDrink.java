package at.fhj.iit;

/**
 * represents a alcoholic mixed drink
 */
public class MixedDrink extends Drink{

    /**
     * uses two liquids
     */
    protected Liquid l1;
    protected Liquid l2;

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
        return ((l1.getVolume()) * l1.getAlcoholPercent() + (l2.getVolume()) * l2.getAlcoholPercent())/getVolume();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l1.getAlcoholPercent() > 0 || l2.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    public String toString(){
        String alcoholPercent = String.format("%.1f", getAlcoholPercent());
        return "Mixed Drink called " + name + " with " + alcoholPercent + " percent alcohol by volume";
    }
}
