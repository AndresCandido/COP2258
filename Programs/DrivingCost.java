import java.util.Scanner;

public class DrivingCost {    
    public static void main(String[] args){

        // Declare and initialize
        double miles_per_gallon, dollars_per_gallon;

        Scanner scnr = new Scanner(System.in);

        miles_per_gallon = scnr.nextDouble();
        dollars_per_gallon = scnr.nextDouble();

        scnr.close(); // Close scanner after done using it

        double cost20gallons = dollars_per_gallon*20 * (1.0/miles_per_gallon);
        double cost75gallons = dollars_per_gallon*75 * (1.0/miles_per_gallon);
        double cost500gallons = dollars_per_gallon*500 * (1.0/miles_per_gallon);
        

        //print out
        System.out.printf("Cost of 20 miles is: %.02f\n", cost20gallons );
        System.out.printf("Cost of 75 miles is: %.02f\n", cost75gallons);
        System.out.printf("Cost of 500 miles is: %.02f\n", cost500gallons);

        System.out.printf("%.02f %.02f %.02f\n",cost20gallons,cost75gallons,cost500gallons);

    }
}