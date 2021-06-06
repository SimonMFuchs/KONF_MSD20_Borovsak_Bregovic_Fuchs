package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashierTest {

    private Cashier cashier;

    @BeforeEach
    public void setup() {
        cashier = new Cashier("test");
    }

    @Test
    public void getName() {
        assertEquals("test", cashier.getName());
    }
}