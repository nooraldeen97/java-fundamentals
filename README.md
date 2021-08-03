# java-fundamentals <br>

### Lab-01:Java Primitives and Control Flow <br>
**Finished Tasks** :<br>

1-**Flipping Coins:** The written method that called flipNHeads  accepts an integer n and flips coins until n heads<br> are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers <br>below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on <br>one line for each flip.and It Print took FLIPS flips to flip N heads in a row. once n heads have been in a row.<br>

2- **Command Line Clock:** Write a method clock that uses Java’s built-in LocalDateTime object to constantly print <br>out the current time to the console, second by second. The program should run until someone manually kills <br>it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your <br>program should detect when the seconds increase and only print something out when the timestamp changes.<br>



<hr>

### Lab-02: Arrays, Loops, Imports, ArrayLists<br>

**Finished Tasks :**<br>

1- **Rolling Dice:** The written method that called roll  accepts an integer n and rolls a six-sided dice n times. The method  <br>return an array containing the values of the rolls.<br>

2- **check if Contains Duplicates:** The written method that called containsDuplicates  returns true or false <br>depending on whether the array contains duplicate values.<br>

3-**Calculating Averages:** The written method called arraysAvarege accepts an array of integers and calculates and <br>returns the average of all the values in the array.<br>

4- **Lowest weekly Month Temperatures average temperatures for Seattle:** calculate the average value for each week and return the array with the lowest average.

<hr>

### Lab-03:Maps, File I/O, and Testing<br>

1- **Maps:** The written method that called findMax/ FindMin and findMiss , to show the high and the low temp and the missing .  <br>
return an High: 72<br>
Low: 51<br>
Never saw temperature: 63<br>
Never saw temperature: 67<br>
Never saw temperature: 68<br>
Never saw temperature: 69<br>

2- **Tallying Election:** The written method that called tally  accepts a List of Strings representing votes and returns one string to show what got the most votes.<br>

3- **linter:** Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon .<br>

<hr>

4- **Inheritance and composition:**

In the inheritance folder I have 2 classes and 1 interface : <br>
- *Restaurant*: In this class there is a constructor to define the variables and there are getters and setters<br>
there is an array list to store all the reviews for a restaurant.<br>
- when a review is added the stars for that restaurant is going to change according to the average of the stars<br>
- there is toString method to print all the defined fields. <br>

- *Review*: In this class there is a constructor to define the variables and there are getters and setters<br>
- there is toString method to print all the defined fields<br>

*Shop*: In this class there is a constructor to define the variables and there are getters and setters<br>
- I created fields for name, description, numberOfDollarSigns and reviews<br>
- a method to add reviews to the shop<br>
- there is toString method to print all the defined fields<br>
*Theater*: In this class there is a constructor to define the variables and there are getters and setters<br>
- I created fields for name, Movies, and reviews<br>
*AddRev*: This method will add to array list of object a new review , and you can add more than one review for <br>each restaurunt .<br>
*AddReview*: In this interface there is a method that accepts a Review object<br>


In the LibraryTest file there are test for every method: <br>

- testRestaurantConstructor : is a test to make sure the Restaurant constructor is behaving reasonably<br>
- testReviewConstructor : is a test to make sure the Review constructor is behaving reasonably<br>
- testShopConstructor : is a test to make sure the Shop constructor is behaving reasonably<br>
- testTheaterConstructor : is a test to make sure the Theater constructor is behaving reasonably<br>
- testToStingReview: to test the toSting method in Review class<br>
- testToStringRestaurant:to test the toSting method in Restaurant class<br>
- testToStringShop:to test the toSting method in Shop class<br>
- testToStringTheater:to test the toSting method in Theater class<br>
- testAddRev : to test if addToRev method work fine and added to the resturant a review .<br>
- testChangeRating: to make sure that when i add a review the rate of restauruant will change to average .<br>
- ShopConstTest: test the constructor in the shop class<br>
- AddShopReviewTest: test if add review works for the shops<br>
- AddRemoveMovieTest: test if we can add and remove movies<br>
- AddTheaterReviewTest: test if add review works for the theater with and without the movie name<br>