#Tutorial with excample

Overview: With this program we are able to create and buy our drink.
  
First we have to now which drink we want to buy. In our tutorial we will have a gin tonic, which, as the name says, consist of the liquide gin and the liquide tonic.
   
    * create an instance of liquid and name it "tonic"
    * create an instance of liquid and name it "gin"
    
    
In order to mix our two liquids we have to create a mixedDrink:
   Good luck that we now what inheritance is and how to make use of it. For those who are not familiar with this topic, please read this: https://www.w3schools.com/java/java_inheritance.asp
   
    * we will now assign a instance of the MixedDrink class which needs a name (as String) and our two liquids, to our super-class Drink. 
    * exc: Drink gintonic = new MixedDrink("ginTonic", gin, tonic);
    
     
In order to buy a drink we will further on have to create a new instance of the cashier class.

    * exc: Cashier ourCashier = new Cashier();

 
After the first step we are able to build our CashRegister class

    * exc: CashRegister cashRegister = new CashRegister(ourCashier);


Our last task persists of adding our sale to the CashRegister class. For this we will the method of our interface PurchasableDrink.
   If you are not familiar with the topic interfaces, then please go through this: https://www.w3schools.com/java/java_interface.asp.  
   Because our Drink-class has implemented the interface we are able to use it for all our drink-creations.

    * exc: ginTonic.purchase(cashRegister);

At the end we are printing our work like a typical bill, with the name of the cashier, the date and the price of our drink. 