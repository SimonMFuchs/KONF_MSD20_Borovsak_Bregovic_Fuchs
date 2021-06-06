package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * represents a sale of drink
 */
public class Sale {

    /**
     * day of sale as string
     */
    protected String date;

    /**
     * formatter for date;
     */
    protected static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

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
     * @param cashier cashier who made the sale
     * @param price price of the drink purchased
     * @param alcoholicPercent alcoholic percent of the drink purchased
     */
    Sale(Cashier cashier, double price, double alcoholicPercent) {
        this.date = formatter.format(new Date());
        this.cashier = cashier;
        this.price = price;
        this.alcoholicPercent = alcoholicPercent;
    }

    public String getDate() {
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
