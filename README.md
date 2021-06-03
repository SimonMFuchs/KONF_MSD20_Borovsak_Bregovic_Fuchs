# Software Configuration Management #

## Drinks  ##

### Group F ### 

| Name of the contributor  |  e-Mail                                |
| ------------------------ |----------------------------------------|
| Borovsak Katarina        |  katarina.borovsak@edu.fh-joanneum.at  |
| Bregovic Dominik         |  dominik.bregovic@edu.fh-joanneum.at   |
| Fuchs Simon              |  simon.fuchs@edu.fh-joanneum.at        |


### Excercise 3 - changes table, commit history ###

| Date          |  Time         |Decription of changes         |Name of the contributor | 
| ------------- |---------------|------------------------------|------------------------|
| 03.06.2021    |  12:36        | Created branch name Sales    | Katarina               |
| 03.06.2021    |  12:37        | Modified README file         | Katarina               |
| 03.06.2021    |  13:01        | Created class Sales.java     | Katarina               |
|               |               |                              |                        |


### Exercise 2 - test coverage ###

| Class name         | Date         |  Coverage                 |Name of the contributor | 
| ------------------ |------------- |---------------------------|------------------------|
| MixedDrinkTest     |              |                           | Simon                  |
| SoftDrinkTest      |              |                           | Domink                 |
| WineTest           | 03.06.2021   | 100% methods, 91% lines   | Katarina               |



**Dominik** SoftDrink class, consisting of Soft drinks 

-First added some mebervariables to the superclass Drinks.

-Added additional method to the class SoftDrink, mixSoftDrink().

-Reworked the constructor SoftDrink(), now he is initializing the supervarialbles a value and the i changed the arguments passed from a scanner to a fixed value.

-Added SoftDrinkTest.java to test the SoftDrink.java class,
all methods had given the expected value exclusevly the mixSoftDrink() method.
here I had to delete the first an last spaces in order to guarantee the same return value in comparison to the expected value.

-Deleted the scanner. Was not necessary not used.


**Simon:** 
MixedDrink class,  A simple mixed drink consisting of two liquids and an optional garnish. e.g. a *Gin Tonic with a cucumber slice*. 

| methods       |  description  |parameters|return values| 
| ------------- |---------------|----------|-------------|
| constructor1()  | constructor with garnish | name, liquid1, liquid2, garnish | / |
| constructor2()  | constructor without garnish| name, liquid1, liquid2 | / |
| getVolume() | tells you the volume in litre | / | Volume in litre as double |
| getAlcoholPercent() | tells you the alcohol amount in percent | / | Alcohol amount in percent |
| isAlcoholic() | tells you if drink is alcoholic or not | / | boolean true if alcoholic, false if not |
| hasGarnish() | tells you if drink has a garnish or not | / | boolean true if it has, false if not |
| toString() | prints the drink object in a nice way | / | information as a string | 

Testing: 
85% coverage.
All methods are tested with parameterrized tests.
Only 85% coverage because somehow the second constructor is not covered according to IntelliJ, even though it should be.


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
