import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class annualSales {

    public static void main(String[] args) {

        String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Double[] monthlySales = new Double[12];
        Double totalSales = 0.00;
        Double averageSales = 0.00;
        String highestMonth = "";
        Double highestSales = 0.00;
        String lowestMonth = "";
        Double lowestSales = 0.00;

        //Main Menu
        System.out.println("""
            (*********************)
             Monthly Sales Tracker
            (*********************)
            """);

        int response;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        do{
            System.out.println("""
                    Please make a selection:

                    1) Enter Sales Reports
                    2) Sales Overview
                    0) Exit
                    """);

            response = myObj.nextInt();  //Receive menu input

            if (response == 1){// Go to report input menu
                getSales(monthArray, monthlySales);
                totalSales = computeTotalSales(monthlySales);
                averageSales = computeAverageSales(monthlySales);
                highestMonth = monthArray[computeHighestMonth(monthlySales)];
                highestSales = monthlySales[computeHighestMonth(monthlySales)];
                lowestMonth = monthArray[computeLowestMonth(monthlySales)];
                lowestSales = monthlySales[computeLowestMonth(monthlySales)];
            }
            else if (response == 2){// Go to sales overview
                displaySaleInfo(totalSales, averageSales, highestMonth, highestSales, lowestMonth, lowestSales);
            }
            else if (response == 0){//exit
                System.out.println("\nThank you for using the Monthly Sales Tracker");
                break;
            }
            else{//Bad input
                System.out.println("\nInvalid input\n\n");
            }
        }while(response != 0);
    }

    public static void getSales(String[] monthArray, Double[] monthlySales){
        //This method receives the monthArray and monthlySales
        //arrays as arguments.  It prompts the users for the sale for each month. This amount should be
        //stored and returned into the corresponding location in the monthlySales array. For example,
        //January sales should be stored in the first location, February sales should be stored in the second
        //location, and so forth.
        System.out.println("""
            (*********************)
              Sales Report Input
            (*********************)
            """);

        String response;
        double salesValue;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        for(int i = 0; i < 12; i++) {
            boolean inputError = true;
            do {
                System.out.println("Please enter sales for " + monthArray[i] + " (Format \"0.00\"): ");
                response = myObj.nextLine();  //Receive menu input
                try {
                    salesValue = Double.parseDouble(response);
                    inputError = false;//if response is a double then while loop ends
                    monthlySales[i] = salesValue;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Invalid input. Please include decimals");
                }
            } while (inputError);
        }
    }

    public static Double computeTotalSales(Double[] monthlySales){
        //This method receives the monthly sales array as an argument and returns the total sales of the year.
        Double totalSales = 0.00;
        for(int i = 0; i < 12; i++){
            totalSales += monthlySales[i];
        }
        return totalSales;
    }

    public static Double computeAverageSales(Double[] monthlySales){
        //This method receives the monthly sales array as an
        //argument and returns the average sales for the year.
        return computeTotalSales(monthlySales) / 12.00;
    }

    public static int computeHighestMonth(Double[] monthlySales){
        //This method receives the monthly sales array as an
        //argument. This method will search and compare the values of the monthly sales array for the
        //highest value.  The method will return the index(or location in the array) of the month with the
        //highest value.
        int indexMax = 0;
        for(int i = 0; i < 12; i++){
            if (monthlySales[i] > monthlySales[indexMax]){
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static int computeLowestMonth(Double[] monthlySales){
        //This method receives the monthly sales array as an
        //argument. This method will search and compare the values of the monthly sales array for the
        //lowest value.  The method will return the index (or location in the array) of the month with the
        //lowest value.
        int indexLow = 0;
        for(int i = 0; i < 12; i++){
            if (monthlySales[i] < monthlySales[indexLow]){
                indexLow = i;
            }
        }
        return indexLow;
    }

    public static void displaySaleInfo(Double totalSales, Double averageSales, String highestMonth, Double highestSales, String lowestMonth,
                                       Double lowestSales){
        //This method will receive the total yearly sales, average monthly sale, the month
        //with the highest sales, as well as the sales for that month and the month with the lowest sales.
        //This method will display all of the data it received as arguments.
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("""
            (*********************)
             Sales Report Overview
            (*********************)
            """);
        System.out.println("Annual Sales: " + String.format("$%,.2f", totalSales));
        System.out.println("Average Sales: " + String.format("$%,.2f", averageSales));
        System.out.println("Highest Month: " + highestMonth);
        System.out.println("Highest Sales: " + String.format("$%,.2f", highestSales));
        System.out.println("Lowest Month: " + lowestMonth);
        System.out.println("Lowest Sales: " + String.format("$%,.2f", lowestSales));
    }
}
