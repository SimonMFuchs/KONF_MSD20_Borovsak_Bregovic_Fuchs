package at.fhj.iit;

import java.util.Date;


public class Customer {
    private Date date;       // Umsatz at a specific Day
    private Integer billNR;  // identifyer by id
    private Integer sales;   // Umsatz pro Person
    private static  int id;


    /**
     * Creating a Custumer
     * @param date  is the date on which the drink is bought
     * @param id    identifyer for the specific bill
     * @param cost  cost of drink
     */
    public Customer(Date date, Integer id, Integer cost){
        this.date = date;
        this.billNR = id++;
        this.sales = cost;
    }


    public Integer getSales() {
        return sales;
    }


}
