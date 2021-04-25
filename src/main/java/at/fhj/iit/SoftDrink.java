package at.fhj.iit;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class SoftDrink extends Drink{

    /**
     * @param name1 , softdrink name
     * @param volume , volume in liters
     *               the attributes that are necessary for a softdrink in order to exist
     * alcoholic and alcoholicPercent are set this values because softdrinks are not alcoholic
     */
    public SoftDrink(String name1, double volume){
        super.name = name1;
        super.volume = volume;
        super.alcoholic = false;
        super.alcoholPercent = 0.0;
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
        return super.volume;
    }

    @Override
    public double getAlcoholPercent() {
        return super.alcoholPercent;
    }

    @Override
    public boolean isAlcoholic() {
        return super.alcoholic;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
