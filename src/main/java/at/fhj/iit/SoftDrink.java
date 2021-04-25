package at.fhj.iit;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class SoftDrink extends Drink{

    // naming my drink and how much I want of it
    public SoftDrink(String name1, double volume){
        super.name = name1;
        super.volume = volume;
        super.alcoholic = false;
        super.alcoholPercent = 0.0;
    }

    public SoftDrink(){
    }


    public String mixSoftDrinks(String name1, String name2) {
        String mix = name1.trim().toLowerCase()+name2.trim().toLowerCase();
        if (mix == "colafanta" || mix == "fantacola"){
            mix = " spezi ";
        }else if (mix == "colasoda" || mix == "sodacola"){
            mix = " cola with soda ";
        }else if (mix == "fantasoda" || mix == "sodafanta" ) {
            mix = " fanta with soda ";
        }else {
            mix = " No such kombination in base ";
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
