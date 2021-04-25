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

        /**
         * testing the method getVolume
         */

        @Test
        void testGetVolume() {
            Liquid w = new Liquid("wine2", 2, 12);
            assertEquals(2, w.getVolume());
        }

        /**
         * testing the method getAlcoholPercent
         */

        @Test
        void getAlcoholPercent() {
            Liquid w = new Liquid("wine2", 2, 12);
            assertEquals(12, w.getAlcoholPercent());
        }

        /**
         * testing the method getName
         */

        @Test
        void getName() {
            Liquid w = new Liquid("wine2", 2, 12);
            assertEquals("wine", w.getName());
        }

    }