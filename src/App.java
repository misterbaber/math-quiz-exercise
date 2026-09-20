public class App {
    public static void main(String[] args) throws Exception {
        // DO NOT EDIT OR DELETE LINES 4 TO 15. FEEL FREE TO COPY AND PAST AS NEEDED.
        // The line below creates a reader. It only needs to be done once, so just leave it at the top.
        Reader read = new Reader();

        // The line below creates a variable and uses read's getInt function to get a number from the user.
        int number = read.getInt("Enter a number:");
        System.out.println("You entered " + number);

        // You can also use the Methods class I created to get random numbers.
        // Let's change the value of number, created above, to a random number from 1 to 100.
        number = Methods.randInt(1, 100);
        System.out.println("Your random number is " + number);

        /* 
         * Below this comment, write at least one math quiz question. 
         * Your question should:
         *     -generate two random values
         *     -show the user a simple math quesiton using these values
         *     -let the user enter an answer
         *     -show the user the correct answer
         *     -you do NOT need to evaluate whether the user is correct, but feel free to try!
         */

        // WRITE YOUR CODE BELOW THIS LINE:
        
        
    }
}
