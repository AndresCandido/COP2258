import java.util.Scanner;

public class Practice {
    public static void main(String[] args){

     /*<Class> <obj_name> = new <Class>() */
        Scanner input = new Scanner(System.in);

        String FullName;
        System.out.print("Enter your full name:");
        FullName = input.nextLine();

        input.close(); // Close scanner after done using it

        System.out.print("Hello "+FullName+"!\nWelcome to Java!\n");
    }
} 