public class MyNameLoop {
    public static void main(String[] args){

        String myName = "Andres Candido";
        int counter = 1, Max = 10;

        // while loop
        while(counter<=Max){
            System.out.println(counter +". "+ myName);
            counter = counter + 1;
        }


        // Do while loop
        counter = 1;
        do{
            System.out.println(counter +". "+ myName);
            counter = counter + 1;
        } while(counter<=Max);


        // For loop
        for(counter=1; counter<=Max; counter++){
            System.out.println(counter +". "+ myName);
        }
    }   
}
