package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Configuration management
 * Exercise 4 - Class WineTest
 * Author: Katarina Borovsak
 * Last modified: 25.04.2021
 */

import static org.junit.jupiter.api.Assertions.*;

    @DisplayName("Testing Wine class implementation")

public class WineTest {

        private Liquid l1;
        private Liquid l2;
        private Wine wine;

        @BeforeEach
        void setup (){
            l1 = new Liquid ("Wine", 0.1, 12, 10);
            l2 = new Liquid ("Watter", 0.1,0, 10);
            wine = new Wine("Wine",l1, l2);
        }

        @DisplayName("Testing getVolume")
        @Test
        void testGetVolume() {
            assertEquals(0.2, wine.getVolume());
        }

        @DisplayName("Testing getPercent")
        @Test
        void testGetAlcoholPercent() {
            assertEquals(12, wine.getAlcoholPercent());
        }

        @DisplayName("Testing getName")
        @Test
        void testGetName() {
            assertEquals("Wine", wine.getName());
        }

        @DisplayName("Testing getPrice")
        @Test
        void testGetPrice() {
            assertEquals("Wine", wine.getName());
        }

        @DisplayName("Testing isAlcoholic")
        @Test
        void testIsAlcoholic() {
            assertTrue(wine.isAlcoholic());
        }

        @DisplayName("Testing toString")
        @Test
        void testToString() {
            String expected = "Mixed wine drink Wine with 12.0 percent alcohol by volume";
            assertEquals(expected , wine.toString());
        }

        @DisplayName("Testing purchase")
        @Test
        void testPurchase() {
            Cashier cashier = new Cashier("cashier");
            CashRegister cashRegister = new CashRegister(cashier);
            Sale expected = new Sale(cashier, 2, 2.4);
            wine.purchase(cashRegister);
            assertEquals(expected.getPrice(), cashRegister.getSalesList().get(0).getPrice());
        }
    }