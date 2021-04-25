package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

class SoftDrinkTest extends Drink {

    @org.junit.jupiter.api.Test
    void mixSoftDrinks() {
    }

    @org.junit.jupiter.api.Test
    void testGetVolume() {
        Drink drink = new SoftDrink("cola", 0.5);
        assertEquals(0.5, drink.getVolume());
    }

    @org.junit.jupiter.api.Test
    void testGetAlcoholPercent() {
    }

    @org.junit.jupiter.api.Test
    void testIsAlcoholic() {
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}