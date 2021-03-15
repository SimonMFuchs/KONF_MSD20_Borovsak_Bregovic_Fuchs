package at.fhj.iit;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class SoftDrink extends Drink{
    String nameDrink;
    double volume;


    // nameing my drink and how much i want of it
    SoftDrink(String name1, double volume){
        this.nameDrink = name1;
        this.volume = volume;
    }

    // overide the superclass method get volume
    public double getVolume(double volume) {
        this.volume = volume;
    }
}
