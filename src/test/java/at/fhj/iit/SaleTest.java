package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SaleTest {

    private Sale sale;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    private Cashier testCashier;

    @BeforeEach
    public void setup() {
        testCashier = new Cashier("testCashier");
        sale = new Sale(testCashier,4, 0.16 );
    }

    @DisplayName("Testing getDate")
    @Test
    void getDate() {
        assertEquals(formatter.format(new Date()), sale.getDate());
    }

    @DisplayName("Testing getCashier")
    @Test
    void getCashier() {
        assertEquals(testCashier, sale.getCashier());
    }

    @DisplayName("Testing getPrice")
    @Test
    void getPrice() {
        assertEquals(4, sale.getPrice());
    }

    @DisplayName("Testing getAlcoholicPercent")
    @Test
    void getAlcoholicPercent() {
        assertEquals(0.16, sale.getAlcoholicPercent());
    }
}