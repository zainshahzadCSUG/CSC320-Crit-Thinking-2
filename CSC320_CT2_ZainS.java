import java.util.Scanner;

public class CSC320_CT2_ZainS {

    // this section gets the user's inputted income,
    // then calculates their tax withheld % based on income level 
    public static double calculate_tax(double income) {

        double tax_rate;

        if (income < 500) {
            tax_rate = 0.10; // if you make less than $500 a week, you pay 10% of that income towards tax 

        } else if (income < 1500) {
            tax_rate = 0.15; // if your income is between $501 and $1500, your rate is 15% of income 

        } else if (income < 2500) {
            tax_rate = 0.20; // $1501 - 2500, you pay 20%

        } else {
            tax_rate = 0.30; // anything beyond 2500 a week, you pay 30%
        }

        return income * tax_rate; // tells the program to print out your dollar amount for tax withheld 
    }


    public static void main(String[] args) {  // main function of the program 

        System.out.println("***---*** Tax Withholding Service ***---***"); // prints this out in the beginning of the terminal

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Please enter your weekly income: $"); 
            double income = input.nextDouble(); // user enters weekly income 

            if (income < 0) {
                System.out.println("Try again: Income cannot be negative."); // failsafe for negative income inputs 

            } else {
                double tax_withheld = calculate_tax(income);
                System.out.printf("Your weekly tax withholding is: $%.2f%n", tax_withheld); 
                // prints out user's tax withholding after executing formula 
            }

        } catch (Exception e) {
            System.out.println("Try again, you can only enter numbers!"); 
            // failsafe for only numbers for income
        }

        input.close();
    }
}
