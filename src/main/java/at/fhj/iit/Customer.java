package at.fhj.iit;

import java.util.Date;

public class Customer {
    Date date;       // Umsatz at a specific Day
    String name;     // identifyer by name
    Integer sale;   // Umsatz pro Person


    public Customer(Date date, String name, Integer sale){
        this.date = date;
        this.name = name;
        this.sale = sale;
    }

    public void buyDrink (Integer sale){
        this.sale += sale;
    }

    public Integer getSales() {
        return sale;
    }


}
