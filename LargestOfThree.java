// this is a comment
/*
 *Andrew Sanchez
 * 8/15/24
 * AddTwoInts.java
 */

import java.util.Scanner; //Import the Scanner class

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println(" \n\n Welcome to the Largest of Three Program !\n\n");

        int firstNum = 0;
        int secoundNum = 0;
        int thirdNum = 0;
        int largestofThree = 0;

        System.out.println("\n The value of sumOfBoth is: " + largestofThree);

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Ask user for the second int.
        System.out.println("\n Please enter a second whole number: ");
        secoundNum = myScannerObject.nextInt();

        // Ask user for the third int.
        System.out.println("\n Please enter a third whole number: ");
        thirdNum = myScannerObject.nextInt();


        // Processing:
        // Compare the input with nested if statements.

        if (firstNum > secoundNum)
        {
            largestofThree = firstNum;
        }
        else
        {
            if (secoundNum > thirdNum)
            {
                largestofThree = secoundNum;
            } else
            {
                largestofThree = thirdNum;
            }
        }
        // Output largest of Three
        System.out.println("\n The Largest of Three" + largestofThree);




        }
    }
