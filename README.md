# Software Configuration Management #

## Drinks Sample ##

### Borovsak Katarina, Bregovic Dominik, Fuchs Simon ###


**Simon:** MixedDrink class,  A simple mixed drink consisting of two liquids e.g. a *Gin Tonic*. 
**Dominik** SoftDrink class, consisting of Soft drinks 

-First added some mebervariables to the superclass Drinks.

-Added additional method to the class SoftDrink, mixSoftDrink().

-Reworked the constructor SoftDrink(), now he is initializing the supervarialbles a value and the i changed the arguments passed from a scanner to a fixed value.

-Added SoftDrinkTest.java to test the SoftDrink.java class,
all methods had given the expected value exclusevly the mixSoftDrink() method.
here I had to delete the first an last spaces in order to guarantee the same return value in comparison to the expected value.

-Deleted the scanner. Was not necessary not used.


**Katarina** Wine class, a class with different wines

### Wine Class ###
Author: Katarina Borovsak
Last modified: 25.04.2021
It is a class, where you can create a new drink with two diffrent liquids, namely wine and water.
Class is part of [repository](https://github.com/SimonMFuchs/KONF_MSD20_Borovsak_Bregovic_Fuchs)
1. There are two possible liquids defined
2. Constructor named Wine with parameters: name, liquid1 and liquid2
3. Methods printOut, getVolume, getAlcoholPercent and isAlcoholic are extended from class Drink

### WineTest Class ###
Author: Katarina Borovsak
Last modified: 25.04.2021
It is a class, where the methods from class Wine are tested.
Class is part of [repository](https://github.com/SimonMFuchs/KONF_MSD20_Borovsak_Bregovic_Fuchs)
