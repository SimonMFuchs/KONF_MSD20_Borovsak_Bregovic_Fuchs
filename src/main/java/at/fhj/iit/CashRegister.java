package at.fhj.iit;

import java.util.Date;

public interface CashRegister {
    Date date = new Date();
    // Umsatz
    // Umsatz pro Person
    // Umsatz at a specific Day

    public int calcPrice();

    public Drink buyDrink(Date date, Integer alcPercent);

}
