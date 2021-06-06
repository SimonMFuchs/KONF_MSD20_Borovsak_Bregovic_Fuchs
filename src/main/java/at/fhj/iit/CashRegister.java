package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * represents a cash register which stores sales and cashiers
 * and can return revenue information
 */
public class CashRegister {

    /**
     * List of the cashiers who are allowed to operate the cash register
     */
    private static List<Cashier> cashierList = new ArrayList<Cashier>();

    /**
     * The cashier who is operating the register at current purchases
     */
    private static Cashier currentCashier;

    /**
     * List of sales made with the cashRegister
     */
    private static List<Sale> salesList = new ArrayList<Sale>();

    /**
     * formatter for date;
     */
    protected static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

    /**
     * creating a cashRegister
     * @param currentCashier is the current cashier operating the cash register
     */
    CashRegister(Cashier currentCashier){
        this.currentCashier = currentCashier;
        cashierList.add(currentCashier);
    }

    /**
     * sets given cashier as new current cashier, if she/he is present in the cashier list
     * @param cashier cashier who should be the new currentCashier
     */
    public void changeCashier(Cashier cashier) {
        boolean flag = false;
        for (Cashier currentCashier: cashierList) {
            if(currentCashier == cashier) {
                flag = true;
                break;
            }
        }
        if(flag)
            this.currentCashier = cashier;
        else
            System.err.println("Cashier not found!");
    }

    /**
     * addsSale to list of sales
     * @param sale sale that was made
     */
    public void addSale(Sale sale) {
        salesList.add(sale);
    }

    /**
     * returns the revenue for non alcoholic drinks
     * @return revenue made with all non alcoholic drinks
     */
    public double getRevenueNonAlcoholic() {
        double revenue = 0;
        for(Sale sale : salesList) {
            if(sale.getAlcoholicPercent() == 0)
                revenue += sale.getPrice();
        }
        return revenue;
    }

    /**
     * returns the revenue for low alcoholic drinks (alcohol percentage smaller 16%)
     * @return revenue made with all low alcoholic drinks
     */
    public double getRevenueLowAlcoholic() {
        double revenue = 0;
        for(Sale sale : salesList) {
            if(sale.getAlcoholicPercent() <= 16)
                revenue += sale.getPrice();
        }
        return revenue;
    }

    /**
     * returns the revenue for high alcoholic drinks (alcohol percentage bigger 40%)
     * @return revenue made with all high alcoholic drinks
     */
    public double getRevenueHighAlcoholic() {
        double revenue = 0;
        for(Sale sale : salesList) {
            if(sale.getAlcoholicPercent() > 16)
                revenue += sale.getPrice();
        }
        return revenue;
    }

    /**
     * returns the revenue on a given date
     * @param date the date you want the over all revenue for
     * @return revenue made on given date as a double
     */
    public double getRevenueByDay(Date date) {
        double revenue = 0;
        for(Sale sale : salesList) {
           if(sale.getDate() == formatter.format(date))
               revenue += sale.getPrice();
        }
        return revenue;
    }

    /**
     * returns the revenue on a given date
     * @param cashier the cashier you want the over all revenue for
     * @return revenue made by a given cashier as a double
     */
    public double getRevenueByCashier(Cashier cashier) {
        double revenue = 0;
        for(Sale sale : salesList) {
            if(sale.getCashier() == cashier)
                revenue += sale.getPrice();
        }
        return revenue;
    }

    /**
     * returns the revenue on a given date
     * @param cashier the cashier you want the over all revenue for
     * @param date the date you want the over all revenue for
     * @return revenue made by a given cashier on a given date as a double
     */
    public double getRevenueByCashierAndDay(Cashier cashier, Date date) {
        double revenue = 0;
        for(Sale sale : salesList) {
            if(sale.getCashier() == cashier && sale.getDate() == formatter.format(date))
                revenue += sale.getPrice();
        }
        return revenue;
    }

    /**
     * Getter for cashierList
     *
     * @return list of cashiers who are allowed to operate the cash register
     */
    public List<Cashier> getCashierList() {
        return cashierList;
    }

    /**
     * Getter for currentCashier
     *
     * @return cashier who currently operates the cash register
     */
    public Cashier getCurrentCashier() {
        return currentCashier;
    }

    /**
     * add an cashier to the cashierList, so he is able to operate the cash register
     * @param cashier
     */
    public void addCashier(Cashier cashier) {
        cashierList.add(cashier);
    }

    /**
     * Getter for salesList
     *
     * @return list of sales made
     */
    public static List<Sale> getSalesList() {
        return salesList;
    }
}
