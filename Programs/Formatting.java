
public class Formatting {

    public static void main(String[] args){

        double balance = 100.232;
        double tax = 8.53;
        double statetax = 2.333;

        System.out.printf( "The balance is %.2f\n", balance);

        System.out.printf( "The balance is %.2f, the tax is %.2f, and the state tax is %.2f\n", balance,tax,statetax);

    }
}