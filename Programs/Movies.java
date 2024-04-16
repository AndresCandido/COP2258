public class Movies {
    public static void main(String[] args){

        String [] movieNames = { "Norbit", "Borat", "The War of the Worlds", "World War Z", "Into the Spider-verse" };

        System.out.println( "Length of the movieNames is: " + movieNames.length );

        System.out.println( "3rd element is: " + movieNames[2]);

        movieNames[0] = "Ghost Rider";
        System.out.println( "The new 1st element is: " + movieNames[0]);

        for(int i=0; i < movieNames.length; i++){

            System.out.println( movieNames[i] );
        }

    }    
}
