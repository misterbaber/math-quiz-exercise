public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // The line below creates a reader. It only needs to be done once, so just leave it at the top.
        Reader read = new Reader();

        // The line below creates a variable and uses read's nextInt function to get a number from the user.
        int number = read.getInt("Enter a number:");
        System.out.println("You entered " + number);

        // You can also use the Methods class I created to get random numbers.
    }
}
