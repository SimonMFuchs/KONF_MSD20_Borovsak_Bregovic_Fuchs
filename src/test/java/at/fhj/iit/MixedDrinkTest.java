package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing MixedDrink implementation")
public class MixedDrinkTest {

    private MixedDrink drink;
    private Liquid l1;
    private Liquid l2;
    private CashRegister cashRegister;
    private Cashier cashier;

    @ParameterizedTest
    @CsvSource({
            " 0.2,  0, 0.04,  40, 0.24",
            " 0.15,  0.0, 0.02,  40, 0.17",
            " 0.3,  0.0, 0.08,  20, 0.38",
            " 0.1,  0.0, 0.05,  10, 0.15",
    })
    @DisplayName("Testing getVolume")
    public void testGetVolume(double vol1, double alc1, double vol2, double alc2, double expected) {
        Liquid l1 = new Liquid("TestLiquid1", vol1, alc1);
        Liquid l2 = new Liquid("TestLiquid1", vol2, alc2);
        drink = new MixedDrink("TestDrink", l1, l2);

        double actual = drink.getVolume();

        assertEquals(expected, actual, 0.001);
    }

    @ParameterizedTest
    @CsvSource({
            " 0.2,  0, 0.04,  40, 6.667",
            " 0.15,  0.0, 0.02,  40, 4.706",
            " 0.3,  0.0, 0.08,  20, 4.211",
            " 0.1,  0.0, 0.05,  10, 3.333",
    })
    @DisplayName("Testing getAlcoholPercent")
    public void testGetAlcoholPercent(double vol1, double alc1, double vol2, double alc2, double expected) {
        Liquid l1 = new Liquid("TestLiquid1", vol1, alc1);
        Liquid l2 = new Liquid("TestLiquid1", vol2, alc2);
        drink = new MixedDrink("TestDrink", l1, l2);

        double actual = drink.getAlcoholPercent();

        assertEquals(expected, actual, 0.001);
    }


    @ParameterizedTest
    @CsvSource({
            " 0.2,  0, 0.04,  40, true",
            " 0.15,  0.0, 0.02,  0, false",
            " 0.3,  0.0, 0.08,  20, true",
            " 0.1,  0.0, 0.05,  0, false",
    })
    @DisplayName("Testing isAlcoholic")
    public void testIsAlcoholic(double vol1, double alc1, double vol2, double alc2, boolean expected) {
        Liquid l1 = new Liquid("TestLiquid1", vol1, alc1);
        Liquid l2 = new Liquid("TestLiquid1", vol2, alc2);
        drink = new MixedDrink("TestDrink", l1, l2);
        boolean actual = drink.isAlcoholic();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            " 0.2,  0, 0.04,  40,, false",
            " 0.15,  0.0, 0.02,  0,,false",
            " 0.3,  0.0, 0.08,  20, cherry, true",
            " 0.1,  0.0, 0.05,  0, lemon, true",
    })
    @DisplayName("Testing hasGarnish")
    public void testHasGarnish(double vol1, double alc1, double vol2, double alc2, String garnish, boolean expected) {
        Liquid l1 = new Liquid("TestLiquid1", vol1, alc1);
        Liquid l2 = new Liquid("TestLiquid1", vol2, alc2);
        if(garnish == null)
            drink = new MixedDrink("TestDrink", l1, l2);
        else
            drink = new MixedDrink("TestDrink", l1, l2, garnish);
        boolean actual = drink.hasGarnish();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            " 0.2,  0, 0.04,  40, orange, Mixed Drink called TestDrink with 6.7 percent alcohol by volume and with orange as garnish",
            " 0.15,  0.0, 0.02,  0, , Mixed Drink called TestDrink with 0.0 percent alcohol by volume",
            " 0.3,  0.0, 0.08,  20, cherry, Mixed Drink called TestDrink with 4.2 percent alcohol by volume and with cherry as garnish",
            " 0.1,  0.0, 0.05,  10, lemon, Mixed Drink called TestDrink with 3.3 percent alcohol by volume and with lemon as garnish",
    })
    @DisplayName("Testing toString")
    public void testToString(double vol1, double alc1, double vol2, double alc2, String garnish, String expected) {
        Liquid l1 = new Liquid("TestLiquid1", vol1, alc1);
        Liquid l2 = new Liquid("TestLiquid1", vol2, alc2);
        drink = new MixedDrink("TestDrink", l1, l2, garnish);
        String actual = drink.toString();

        assertEquals(expected, actual);
    }

    @DisplayName("Testing getName")
    @Test
    public void testGetName(){
        l1 = new Liquid("TestLiquid1", 0.4, 0);
        l2 = new Liquid("TestLiquid1", 0.1, 40);
        drink = new MixedDrink("TestDrink", l1, l2, "lemon");
        assertEquals("TestDrink", drink.getName());
    }

    @DisplayName("Testing getPrice")
    @Test
    public void testGetPrice(){
        l1 = new Liquid("TestLiquid1", 0.4, 0, 10);
        l2 = new Liquid("TestLiquid1", 0.1, 40, 50);
        drink = new MixedDrink("TestDrink", l1, l2, "lemon");
        assertEquals(9, drink.getPrice());
    }

    @DisplayName("Testing purchase")
    @Test
    public void testPurchase(){
        l1 = new Liquid("TestLiquid1", 0.4, 0, 10);
        l2 = new Liquid("TestLiquid1", 0.1, 40, 50);
        drink = new MixedDrink("TestDrink", l1, l2, "lemon");

        cashier = new Cashier("cashier");
        cashRegister = new CashRegister(cashier);
        Sale expected = new Sale(cashier, 9, 8);
        drink.purchase(cashRegister);
        assertEquals(expected.getPrice(), cashRegister.getSalesList().get(0).getPrice());
    }
}
