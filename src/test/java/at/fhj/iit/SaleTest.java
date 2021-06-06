package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
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

    @Test
    void getDate() {
        assertEquals(formatter.format(new Date()), sale.getDate());
    }

    @Test
    void getCashier() {
        assertEquals(testCashier, sale.getCashier());
    }

    @Test
    void getPrice() {
        assertEquals(4, sale.getPrice());
    }

    @Test
    void getAlcoholicPercent() {
        assertEquals(0.16, sale.getAlcoholicPercent());
    }
}