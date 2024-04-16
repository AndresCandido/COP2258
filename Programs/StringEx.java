
public class StringEx {
    public static void main(String[] args){
    
        String fname = "Florida State Seminoles";

        System.out.println("My first name is " + fname);
        System.out.println("My first name's length is " + fname.length());
        System.out.println("My first name in all caps is " + fname.toUpperCase());
        System.out.println( fname.length() + " " + fname.substring(1,6));

    }   
}
