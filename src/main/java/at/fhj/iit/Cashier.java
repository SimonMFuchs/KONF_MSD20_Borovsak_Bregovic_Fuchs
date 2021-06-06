package at.fhj.iit;

/**
 * represents a cashier
 */
public class Cashier {

    /**
     * name of the cashier
     */
    private String name;

    /**
     * Creating a Cashier
     * @param name name of the cashier
     */
    public Cashier(String name){
        this.name = name;
    }

    /**
     * Getter for currentCashier
     *
     * @return name of the cashier
     */
    public String getName() {
        return name;
    }

}
