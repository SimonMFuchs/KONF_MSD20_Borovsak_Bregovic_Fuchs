package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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

    @Test
    void changeCashier() {
        cashRegister.addCashier(cashier2);
        cashRegister.changeCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCurrentCashier());
    }

    @Test
    void addSale() {
        cashRegister.addSale(sale);
        assertEquals(sale, cashRegister.getSalesList().get(0));
    }

    @Test
    void getRevenueNonAlcoholic() {
        cashRegister.addSale(sale);
        assertEquals(0, cashRegister.getRevenueNonAlcoholic());
    }

    @Test
    void getRevenueLowAlcoholic() {
        cashRegister.addSale(sale);
        assertEquals(0, cashRegister.getRevenueLowAlcoholic());
    }

    @Test
    void getRevenueHighAlcoholic() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueHighAlcoholic());
    }

    @Test
    void getRevenueByDay() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueByDay(new Date()));
    }

    @Test
    void getRevenueByCashier() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueByCashier(cashier1));
    }

    @Test
    void getRevenueByCashierAndDay() {
        cashRegister.addSale(sale);
        assertEquals(5, cashRegister.getRevenueByCashierAndDay(cashier1, new Date()));
    }

    @Test
    void getCashierList() {
        List<Cashier> cashierList = new ArrayList<Cashier>();
        cashierList.add(cashier1);
        cashierList.add(cashier2);
        cashRegister.addCashier(cashier2);
        assertEquals(cashierList, cashRegister.getCashierList());
    }

    @Test
    void getCurrentCashier() {
        assertEquals(cashier1, cashRegister.getCurrentCashier());
    }

    @Test
    void testChangeCashier() {
        cashRegister.addCashier(cashier2);
        cashRegister.changeCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCurrentCashier());
    }

    @Test
    void testAddSale() {
        cashRegister.addSale(sale);
        assertEquals(sale, cashRegister.getSalesList().get(0));
    }

    @Test
    void addCashier() {
        cashRegister.addCashier(cashier2);
        assertEquals(cashier2, cashRegister.getCashierList().get(1));
    }

    @Test
    void getSalesList() {
        List<Sale> salesList = new ArrayList<Sale>();
        salesList.add(sale);
        cashRegister.addSale(sale);
        assertEquals(salesList, cashRegister.getSalesList());
    }
}