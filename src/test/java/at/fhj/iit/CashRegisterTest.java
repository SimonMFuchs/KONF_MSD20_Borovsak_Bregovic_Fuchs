package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashRegisterTest {

    private CashRegister cashRegister;
    private Cashier cashier1;
    private Cashier cashier2;
    private Sale sale;

    @BeforeEach
    public void setup() {
        cashier1 = new Cashier("testCashier");
        cashRegister = new CashRegister(cashier1);
        sale = new Sale(cashier1, 5, .40);
        cashier2 = new Cashier("testCashier2");
    }

    @Test
    void changeCashier() {
        cashRegister.addCashier(cashier2);
        cashRegister.changeCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCurrentCashier());
    }

    @Test
    void addSale() {
        cashRegister.addSale(sale);
    }

    @Test
    void getRevenueNonAlcoholic() {
    }

    @Test
    void getRevenueLowAlcoholic() {
    }

    @Test
    void getRevenueHighAlcoholic() {
    }

    @Test
    void getRevenueByDay() {
    }

    @Test
    void getRevenueByCashier() {
    }

    @Test
    void getRevenueByCashierAndDay() {
    }

    @Test
    void getCashierList() {
    }

    @Test
    void getCurrentCashier() {
    }

    @Test
    void testChangeCashier() {
    }

    @Test
    void testAddSale() {
    }

    @Test
    void testGetRevenueNonAlcoholic() {
    }

    @Test
    void testGetRevenueLowAlcoholic() {
    }

    @Test
    void testGetRevenueHighAlcoholic() {
    }

    @Test
    void testGetRevenueByDay() {
    }

    @Test
    void testGetRevenueByCashier() {
    }

    @Test
    void testGetRevenueByCashierAndDay() {
    }

    @Test
    void testGetCashierList() {
    }

    @Test
    void testGetCurrentCashier() {
    }

    @Test
    void addCashier() {
    }

    @Test
    void getSalesList() {
    }
}