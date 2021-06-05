package at.fhj.iit;

import java.util.Date;

/**
 * represents a sale of drink
 */
public class Sale {

    /**
     * time of sale
     */
    protected Date date;

    /**
     * cashier who made the sale
     */
    protected Cashier cashier;

    /**
     * price of the drink purchased
     */
    protected double price;

    /**
     * alcoholic percent of the drink purchased
     */
    protected double alcoholicPercent;

    /**
     * Creates new liquid with given name, volume and
     * alcoholPercent
     *
     * @param date time of purchase
     * @param cashier cashier who made the sale
     * @param price price of the drink purchased
     * @param alcoholicPercent alcoholic percent of the drink purchased
     */
    Sale(Date date, Cashier cashier, double price, double alcoholicPercent) {
        this.date = date;
        this.cashier = cashier;
        this.price = price;
        this.alcoholicPercent = alcoholicPercent;
    }

    public Date getDate() {
        return date;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public double getPrice() {
        return price;
    }

    public double getAlcoholicPercent() {
        return alcoholicPercent;
    }
}
