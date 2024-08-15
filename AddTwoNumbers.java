// this is a comment
/*
*Andrew Sanchez
* 8/15/24
* AddTwoInts.java
 */

import java.util.Scanner; //Import the Scanner class

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(" \n\n Welcome to the Double Int Program !\n\n");

        int firstNum = 0;
        int secoundNum = 0;
        int sumOfBothNumbers = 0;

        System.out.println("\n The value of sumOfBoth is: " + sumOfBothNumbers);

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Unit text for our first user input.
        System.out.println("\n The value of firstNum is: " + firstNum);

        // Ask user for the second int.
        System.out.println("\n Please enter a second whole number: ");
        secoundNum = myScannerObject.nextInt();

        // Unit text for our second user input.
        System.out.println("\n The value of secoundNum is: " + secoundNum);


        // Processing
        // Add the two ints from the user.
        // the total of firstNum and secondNum will be stored in
        // the variable name: sumOfBothNumber

        sumOfBothNumbers = firstNum + secoundNum;

        //Output the value of the variable name: sumOfBothNumbers
        System.out.println("\n The value of sumOfBothNumbers is: " + sumOfBothNumbers);

    }
}