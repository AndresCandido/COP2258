
import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args){

        //Get User's name, age, and GPA.
        String FullName;
        int age;
        double gpa;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name:");
        FullName = input.nextLine();

        System.out.print("Enter your age:");
        age = input.nextInt();

        System.out.print("Enter your gpa:");
        gpa = input.nextDouble();

        input.close(); // Close scanner after done using it

        System.out.print("User information:\nName:"+FullName+"\nAge:"+age+"\nGPA:"+gpa);
    }      
}
