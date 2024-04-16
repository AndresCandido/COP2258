import java.util.Scanner;

public class NameFormat {

    public static void main(String[] args){

        //giving the user's name, display their name in a certain format
        //Input: Fname, Middle name , Lname
        //Output: Lname, First initials of Fname and Middle name.

        String Fname, Mname, Lname, full_name;
        char F_initial, M_initial;
        int space1, space2;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your full name: ");

        full_name = scnr.nextLine();

        space1 = full_name.indexOf(' ');
        space2 = full_name.indexOf(' ', space1+1);

        
        F_initial =  full_name.charAt(0);
        M_initial =  full_name.charAt(space1+1);
        Lname = full_name.substring(space2+1);
        
        System.out.print(Lname+", "+F_initial+", "+M_initial+".");

    }   
}
