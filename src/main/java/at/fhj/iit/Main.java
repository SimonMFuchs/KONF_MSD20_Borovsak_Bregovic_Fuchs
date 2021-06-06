package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        //TUTORIAL

        Cashier tutorial = new Cashier("Tutorial");
        CashRegister cashRegister = new CashRegister(tutorial);

        Liquid tonic = new Liquid("Tonic", 0.150, 0, 2);
        Liquid gin = new Liquid("Gin", 0.04, 40, 50);
        Drink ginTonic = new MixedDrink("Gin Tonic", gin, tonic);

        ginTonic.purchase(cashRegister);

        System.out.println(cashRegister.getCurrentCashier().getName());

        System.out.println(cashRegister.getRevenueByCashier(tutorial));

        //TUTORIAL ENDE

        Liquid liquid = new Liquid("cola", 0.5, 0);
        Drink drink1 = new SoftDrink(liquid, "Fanta", 1.0);
        System.out.println("How much alcohol does " + drink1.getName() + " possess? " + liquid.getAlcoholPercent());

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());
        


        Liquid wein = new Liquid ("Wine", 0.1, 12);
        Liquid watter = new Liquid ("Watter", 0.1,0);

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);


        System.out.println(ginTonic);

        Drink spritzer = new Wine ("Spritzer", wein, watter);
        System.out.println(spritzer);
    }
}
