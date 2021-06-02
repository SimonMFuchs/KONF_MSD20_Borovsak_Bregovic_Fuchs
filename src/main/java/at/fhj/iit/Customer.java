package at.fhj.iit;

import java.util.Date;


public class Customer {
    private Date date;       // Umsatz at a specific Day
    private Integer billNR;     // identifyer by id
    private Integer sale;   // Umsatz pro Person
    private static  int id;


    /**
     * Creating a Custumer
     * @param date  is the date on which the drink is bought
     * @param id    identifyer for the specific bill
     * @param sale  cost of drink
     */
    public Customer(Date date, Integer id, Integer sale){
        this.date = date;
        this.billNR = id;
        this.sale = sale;
    }

    public void buyDrink (Integer sale){
        this.sale += sale;
    }

    public Integer getSales() {
        return sale;
    }


}
