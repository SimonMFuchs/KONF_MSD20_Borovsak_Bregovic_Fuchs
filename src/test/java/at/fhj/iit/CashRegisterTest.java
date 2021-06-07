package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        sale = new Sale(cashier1, 5, 40);
        cashier2 = new Cashier("testCashier2");
    }

    @DisplayName("Testing changeCashier")
    @Test
    void changeCashier() {
        cashRegister.addCashier(cashier2);
        cashRegister.changeCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCurrentCashier());
    }

    @DisplayName("Testing addSale")
    @Test
    void addSale() {
        cashRegister.addSale(sale);
        assertEquals(sale, cashRegister.getSalesList().get(0));
    }

    @DisplayName("Testing getRevenueNonAlcoholic")
    @Test
    void getRevenueNonAlcoholic() {
        cashRegister.addSale(sale);
        assertEquals(0, cashRegister.getRevenueNonAlcoholic());
    }

    @DisplayName("Testing getRevenueLowAlcoholic")
    @Test
    void getRevenueLowAlcoholic() {
        cashRegister.addSale(sale);
        assertEquals(0, cashRegister.getRevenueLowAlcoholic());
    }

    @DisplayName("Testing getRevenueHighAlcoholic")
    @Test
    void getRevenueHighAlcoholic() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueHighAlcoholic());
    }

    @DisplayName("Testing getRevenueByDay")
    @Test
    void getRevenueByDay() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueByDay(new Date()));
    }

    @DisplayName("Testing getRevenueByCashier")
    @Test
    void getRevenueByCashier() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueByCashier(cashier1));
    }

    @DisplayName("Testing getRevenueByCashierAndDay")
    @Test
    void getRevenueByCashierAndDay() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueByCashierAndDay(cashier1, new Date()));
    }

    @DisplayName("Testing getCashierList")
    @Test
    void getCashierList() {
        List<Cashier> cashierList = new ArrayList<Cashier>();
        cashierList.add(cashier1);
        cashierList.add(cashier2);
        cashRegister.addCashier(cashier2);
        assertEquals(cashierList, cashRegister.getCashierList());
    }

    @DisplayName("Testing getCurrentCashier")
    @Test
    void getCurrentCashier() {
        assertEquals(cashier1, cashRegister.getCurrentCashier());
    }

    @DisplayName("Testing changeCashier")
    @Test
    void testChangeCashier() {
        cashRegister.addCashier(cashier2);
        cashRegister.changeCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCurrentCashier());
    }

    @DisplayName("Testing addSale")
    @Test
    void testAddSale() {
        cashRegister.addSale(sale);
        assertEquals(sale, cashRegister.getSalesList().get(0));
    }

    @DisplayName("Testing addCashier")
    @Test
    void addCashier() {
        cashRegister.addCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCashierList().get(1));
    }

    @DisplayName("Testing getSalesList")
    @Test
    void getSalesList() {
        List<Sale> salesList = new ArrayList<Sale>();
        salesList.add(sale);
        cashRegister.addSale(sale);
        assertEquals(salesList, cashRegister.getSalesList());
    }
}