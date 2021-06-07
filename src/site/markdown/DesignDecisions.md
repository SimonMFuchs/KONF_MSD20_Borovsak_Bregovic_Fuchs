#Description of the design decisions

##Authors: Simon Fuchs, Dominik Bregovic, Katarina Borovsak
###Datum: 06.06.2021
###Project: Maven Project at the class Configuration Management
 
In the following tables is explained how the new functionalities were design and what is the output of the newly created methods. We created two new classes, namely CahRegister and Cashier and an Interface PurchasableDrink.
 
###Class Cashier
Represents a cashier - the person that is in control of the CashRegister

| Code                    | Description                   |parameters|
| ------------------------|-------------------------------|----------|
| constructor Cashier     | Creating a cashier            | name     | 
| variable String name    | name of the cashier           | /        |
| variable String getName | getter of the current cashier | /        |

###Class CashRegister
Represents a cash register which stores sales and cashiers and can return revenue information

| Code                    | Description                                                       |parameters |
| ------------------------|-------------------------------------------------------------------|-----------|
| variable ArrayList      | List of the cashiers who are allowed to operate the cash register |/          | 
| currentCashier          | The cashier who is operating the register at current purchases    | /         |
| salesList               | List of sales made with the cashRegister                          | /         |
| formatter               | formatter for date                                                | /         |
| constructor CashRegister| currentCashier is the current cashier operating the cash register | currentCashier  |
| changeCashier           | sets given cashier as new current cashier, if she/he is present in the cashier list   |cashier         |
| addSale                 | addsSale to list of sales                                         | /         |
| getRevenueNonAlcoholic  | returns the revenue for non alcoholic drinks - returns revenue    | /         |
| getRevenueLowAlcoholic  | returns the revenue for low alcoholic drinks (alcohol percentage smaller 16%)    | /         |
| getRevenueHighAlcoholic  | returns the revenue for high alcoholic drinks (alcohol percentage bigger 40%)    | /         |
| getRevenueByDay  | returns the revenue on a given date    | date         |
| getRevenueByCashier  | revenue made by a given cashier as a double    | cashier         |
| getRevenueByCashierAndDay  | returns the revenue on a given date    | cashier, date         |
| getCashierList | Getter for cashierList    | /         |
| getRevenueByCashier  | returns the revenue on a given date    | /         |
| getCurrentCashier  | Getter for currentCashier   | /         |
| addCashier  | add an cashier to the cashierList, so he is able to operate the cash register    | cashier       |
| List Sale   | Getter for salesList    | /         |


### interface PurchasableDrink 
Interface for drinks that are purchasable
