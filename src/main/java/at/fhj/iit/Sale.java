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

    /**
     * Getter for date
     *
     * @return date as string in the form dd.mm.yyyy
     */
    public String getDate() {
        return date;
    }

    /**
     * Getter for cashier
     *
     * @return the cashier who made the sale
     */
    public Cashier getCashier() {
        return cashier;
    }

    /**
     * Getter for price
     *
     * @return the price of the drink that was sold
     */
    public double getPrice() {
        return price;
    }

    /**
     * Getter for alcoholicPercent
     *
     * @return the alcoholic percent of the drink that was sold
     */
    public double getAlcoholicPercent() {
        return alcoholicPercent;
    }
}
