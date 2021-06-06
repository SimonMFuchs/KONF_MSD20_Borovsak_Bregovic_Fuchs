package at.fhj.iit;

import java.util.Date;

//have to use the parentclass liquide
public class SoftDrink extends Drink implements PurchasableDrink{

    Liquid mySoftDrink;

    /**
     * @param name , softdrink name
     * @param volume , volume in liters
     *               the attributes that are necessary for a softdrink in order to exist
     * alcoholic and alcoholicPercent are set this values because softdrinks are not alcoholic
     */
    public SoftDrink(Liquid myLiquid, String name, double volume ){
        this.mySoftDrink = myLiquid;
        this.mySoftDrink.setName(name);
        this.mySoftDrink.setVolume(volume);
        this.mySoftDrink.setAlcoholPercent(0);
        this.price = myLiquid.getPrice();
    }

    /**
     * default constuctor
     */
    public SoftDrink(){
    }

    /**
     *
     * @param name1 , first softdrink
     * @param name2 , second softdrink
     * if the combination of the two softdrinks is legal, then new softdrink is crated
     * @return if valid mix returns the new creation, if not valid " No such combination in directory"
     */
    public String mixSoftDrinks(String name1, String name2) {
        String mix = name1.trim().toLowerCase()+name2.trim().toLowerCase();
        if (mix.equals("colafanta") || mix.equals("fantacola")){
            mix = "spezi";
        }else if (mix.equals("colasoda") || mix.equals("sodacola")){
            mix = "cola with soda";
        }else if (mix.equals("fantasoda") || mix.equals("sodafanta") ) {
            mix = "fanta with soda";
        }else {
            mix = "No such combination in base";
        }

        return mix;

    }

    @Override
    public double getVolume() {
        return this.mySoftDrink.getVolume();
    }

    @Override
    public double getAlcoholPercent() {
        return this.mySoftDrink.getAlcoholPercent();
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    @Override
    public String getName() {
        return this.mySoftDrink.getName();
    }

    @Override
    public double getPrice() {
        return mySoftDrink.getPrice();
    }

    /**
     * creates a sale with the current time and the drink information and adds it to the cash register
     */
    @Override
    public void purchase(CashRegister cashRegister) {
        cashRegister.addSale(new Sale(cashRegister.getCurrentCashier(), this.getPrice(), this.getAlcoholPercent()));

    }

}
