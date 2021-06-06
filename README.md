# Software Configuration Management #

## Drinks  ##

### Group F ### 

| Name of the contributor  |  e-Mail                                |
| ------------------------ |----------------------------------------|
| Borovsak Katarina        |  katarina.borovsak@edu.fh-joanneum.at  |
| Bregovic Dominik         |  dominik.bregovic@edu.fh-joanneum.at   |
| Fuchs Simon              |  simon.fuchs@edu.fh-joanneum.at        |

### What is this project for? ###

This project lets you create different drinks composed of different liquids. 
For more information on the drinks you're able to create with this program please look below. 

In addition you can also add drinks as a purchase to a cash register, 
which then tracks what kind of drinks got sold, when they got sold and how much revenue you made.

### How to use this project? ###

Simply create different liquids and drinks and purchase them via the cash register.
For more information please look at the tutorial site in this repository.

### Installation instructions ###

Not much to say here. Just make sure you have maven installed and import the project into the IDE of your choice.
 
### Exercise 3 - changes table, commit history ###

| Date          |  Time         |Description of changes        |Name of the contributor | 
| ------------- |---------------|------------------------------|------------------------|
| 03.06.2021    |  12:36        | Created branch name Sales    | Katarina               |
| 03.06.2021    |  12:37        | Modified README file         | Katarina               |
| 03.06.2021    |  13:01        | Created class Sales.java     | Katarina               |
| 05.06.2021    |  20:00        | Implemented cash register functionalty| Simon         |
| 06.06.2021    |  17:00        | Created tests for cash register classes| Simon        |

## Sources for writing a README document ## 
[Make a read me web page](https://www.makeareadme.com/)

[Markdown web page](https://www.markdownguide.org/cheat-sheet)

[Beginners guide to documentation](https://www.writethedocs.org/guide/writing/beginners-guide-to-docs/)



### Exercise 2 - test coverage ###

| Class name         | Date         |  Coverage                 |Name of the contributor | 
| ------------------ |------------- |---------------------------|------------------------|
| MixedDrinkTest     | 06.06.2021   | 100% methods, 100%lines   | Simon                  |
| SoftDrinkTest      |              |                           | Dominik                 |
| WineTest           | 03.06.2021   | 100% methods, 91% lines   | Katarina               |


### Exercise 1 - Implementation of java classes ###

**Dominik** SoftDrink class, consisting of Soft drinks 

-First added some mebervariables to the superclass Drinks.

-Added additional method to the class SoftDrink, mixSoftDrink().

-Reworked the constructor SoftDrink(), now he is initializing the supervarialbles a value and the i changed the arguments passed from a scanner to a fixed value.

-Added SoftDrinkTest.java to test the SoftDrink.java class,
all methods had given the expected value exclusevly the mixSoftDrink() method.
here I had to delete the first an last spaces in order to guarantee the same return value in comparison to the expected value.

-Deleted the scanner. Was not necessary not used.
-Deleted unused imports
-Created a CashRegister branch
-Set upstream (git push -u origin CashRegister)
-Created an interface CashRegister


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
100% coverage.
Most methods are tested with parameterrized tests.



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
