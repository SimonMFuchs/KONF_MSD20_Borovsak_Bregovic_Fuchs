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

        @BeforeEach
        void setup (){
            Liquid wein = new Liquid ("Wine", 0.1, 12);
            Liquid watter = new Liquid ("Watter", 0.1,0);

            Wine w = new Wine("Wine",wein, watter);
        }

        /**
         * testing the method getVolume
         */

        @Test
        void testGetVolume() {
            Liquid wein = new Liquid ("Wine", 0.1, 12);
            Liquid watter = new Liquid ("Watter", 0.1,0);

            Wine w = new Wine("Wine",wein, watter);

            assertEquals(0.2, w.getVolume());
        }


        /**
         * testing the method getAlcoholPercent
         */

        @Test
        void getAlcoholPercent() {
            Liquid wein = new Liquid ("Wine", 0.1, 12);
            Liquid watter = new Liquid ("Watter", 0.1,0);

            Wine w = new Wine("Wine",wein, watter);

            assertEquals(12, w.getAlcoholPercent());
        }

        /**
         * testing the method getName
         */

        @Test
        void getName() {
            Liquid wein = new Liquid ("Wine", 0.1, 12);
            Liquid watter = new Liquid ("Watter", 0.1,0);

            Wine w = new Wine("Wine",wein, watter);

            assertEquals("Wine", w.getName());
        }



        @Test
        void isAlcoholic() {
            Liquid wein = new Liquid ("Wine", 0.1, 12);
            Liquid watter = new Liquid ("Watter", 0.1,0);

            Wine w = new Wine("Wine",wein, watter);

            assertTrue(w.isAlcoholic());
        }

        @Test
        void testToString() {
            Liquid wein = new Liquid ("Wine", 0.1, 12);
            Liquid watter = new Liquid ("Watter", 0.1,0);

            Wine w = new Wine("Wine",wein, watter);

            String expected = "Mixed wine drink Wine with 12.0 percent alcohol by volume";
            assertEquals(expected , w.toString());
        }

    }