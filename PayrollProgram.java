// AS 8/20/24
/*
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked(no hour fractions), user's hourly payrate
 *
 * Processing: total weekly pay including overtime if more than 40
 *    hours were worked that week.
 *
 * Output: Polite greeting to the user and regular pay and overtime pay
 *
 *
 */
//

import java.util.Scanner;

public class PayrollProgram {

    static void theHelloMethod(){
        System.out.println(" \n Hello from theHelloMethod() ");
    }

    //Create a method that get input.
    // This is the method's Definition
    static void aPersonalGreeting(String someName) {
        System.out.println("\n hello " + someName + " how are you today?")
        

    public static void main(String[] args) {
        System.out.println("\n\n....Welcome to PayrollProgram!...\n");

        // Variables (member)
        String theUserName = "";


        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the users name
        System.out.println("\n Please enter your name ");
        theUserName = scanner.nextLine();

        // Call (invoke) our greeting method.
        aPersonalGreeting(theUserName);
        
        

        // Variables use in this program
        String userName = "";
        double hoursWorked = 0.0;
        double payRate = 0.0;

        double hrlyPayRate = 0.0;
        double weeklyPayWithoutOvertime = 0.0;
        double overTimePay = 0.0;
        double  totalWeeklyPay = 0.0;


        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create Scanner objects to get input from the user.
        Scanner myScannerObj = new Scanner(System.in);


        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked

        System.out.println("\n Please enter your hourly pay rate");
        // Use the Scanner object to get input from this prompt, and store what was retuned
        //from your Scanner object in a variable
        hrlyPayRate = myScannerObj.nextInt();

        // Get weekly hours worked from the user
        System.out.println("\n Please enter the total hours worked this week ( no hour Fractions): ");
        hoursWorked = myScannerObj.nextInt();



        // Create an output statement to the use echoing the user's input
        System.out.println("\n hey " + userName + " you worked " + hoursWorked + " this week !");
        // Calulate overtime hours
        double overtimeHours = Math.max(hoursWorked - 40, 0);

        // Calulate the overtime pay if applicable
        if (overtimeHours > 0) {
            overTimePay = overtimeHours * hrlyPayRate * 1.5;
        }
        // calculate regular pay
        if (hoursWorked > 40) {
            weeklyPayWithoutOvertime = 40 * hrlyPayRate;
        }
        else {
            weeklyPayWithoutOvertime = hoursWorked * hrlyPayRate;
        }
        // Calculate totale weekly pay
        totalWeeklyPay = weeklyPayWithoutOvertime + overTimePay;

        // Output results
        System.out.printf("\n Reuglar Pay: $%.2f%n", weeklyPayWithoutOvertime);
        System.out.printf("Overtime Pay: $%.2f%n", overTimePay);
        System.out.printf("Total Weekly Pay: $%.2f%n", totalWeeklyPay);
        // Close the Scanner
        myScannerObj.close();

        }
    }

