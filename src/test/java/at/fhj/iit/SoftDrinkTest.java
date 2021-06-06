package at.fhj.iit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SoftDrinkTest extends Drink implements PurchasableDrink{


    @ParameterizedTest
    @CsvSource({
            "cola, fanta",
    })
    @DisplayName("Test mixSoftDrinks")
    void mixSoftDrinks(String name1, String name2) {
        Liquid liquid = null;
        SoftDrink drink = new SoftDrink(liquid,"cola", 0.5);
        assertEquals("spezi", drink.mixSoftDrinks(name1, name2));
    }


    @ParameterizedTest
    @CsvSource({
            "cola, 0.5",
    })
    @DisplayName("Test getVolume")
    void testGetVolume(String name, double vol) {
        Liquid liquid = null;
        Drink drink = new SoftDrink(liquid,name, vol);
        assertEquals(0.5, drink.getVolume());
    }

    @org.junit.jupiter.api.Test
    void testGetAlcoholPercent() {
        Drink drink = new SoftDrink(null,"soda", 0.5);
        assertEquals(0.0, drink.getAlcoholPercent());

    }

    @org.junit.jupiter.api.Test
    void testIsAlcoholic() {
        Drink drink = new SoftDrink(null,"sprite", 0.5);
        assertEquals( false, drink.isAlcoholic());
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
        Drink drink = new SoftDrink(null,"icetea", 0.5);
        assertEquals("icetea", drink.getName());
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

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void purchase(CashRegister cashRegister) {
    }
}