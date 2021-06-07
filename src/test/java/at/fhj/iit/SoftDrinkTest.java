package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SoftDrinkTest {

    private Liquid liquid;

    @BeforeEach
    void createLiquide(){
        this.liquid = new Liquid("cola", 0.5, 1.0, 10);
    }

    @ParameterizedTest
    @CsvSource({
            "cola, fanta",
    })
    @DisplayName("Test mixSoftDrinks")
    void testMixSoftDrinks(String name1, String name2) {
        SoftDrink drink = new SoftDrink(liquid,"cola", 0.5);
        assertEquals("spezi", drink.mixSoftDrinks(name1, name2));
    }


    @ParameterizedTest
    @CsvSource({
            "cola, 0.5",
    })
    @DisplayName("Test getVolume")
    void testGetVolume(String name, double vol) {
        Drink drink = new SoftDrink(liquid,name, vol);
        assertEquals(0.5, drink.getVolume());
    }

    @DisplayName("Test getAlcoholPercent")
    @Test
    void testGetAlcoholPercent() {
        Drink drink = new SoftDrink(liquid,"soda", 0.5);
        assertEquals(0.0, drink.getAlcoholPercent());

    }

    @DisplayName("Test isAlcoholic")
    @Test
    void testIsAlcoholic() {
        Drink drink = new SoftDrink(liquid,"sprite", 0.5);
        assertEquals( false, drink.isAlcoholic());
    }

    @DisplayName("Test getName")
    @Test
    void testGetName() {
        Drink drink = new SoftDrink(liquid,"icetea", 0.5);
        assertEquals("icetea", drink.getName());
    }

    @DisplayName("Test getPrice")
    @Test
    void getPrice() {
        Drink drink = new SoftDrink(liquid,"icetea", 0.5);
        assertEquals(5, drink.getPrice());
    }

    @DisplayName("Test purchase")
    @Test
    void purchase() {
        Drink drink = new SoftDrink(liquid,"icetea", 0.5);
        Cashier cashier = new Cashier("cashier");
        CashRegister cashRegister = new CashRegister(cashier);
        Sale expected = new Sale(cashier, 5, 0);
        drink.purchase(cashRegister);
        assertEquals(expected.getPrice(), cashRegister.getSalesList().get(0).getPrice());
    }
}