package at.fhj.iit;

import java.util.List;

public class CashRegister {
    Drink drink;
    List<Customer> allCustomers;
    Integer sales;          //whole sales


    public CashRegister(Drink drink, Customer customer){
        this.drink = drink;
        this.allCustomers.add(customer);
    }

    public void calcTotalSales(){
        for (int i = 0; i <allCustomers.size(); i++) {
            this.sales += allCustomers.get(i).getSales();
        }
    }
}
