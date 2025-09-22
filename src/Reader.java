import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Simple console input helper.
 *
 * This class wraps a {@link java.util.Scanner} to provide a few
 * convenience methods for reading typed input from System.in while
 * printing a prompt to the console.
 *
 * Note: these methods perform minimal validation and will throw
 * runtime exceptions (for example {@link InputMismatchException}) if the
 * user types a value that cannot be converted to the requested type.
 */
public class Reader {

    private Scanner input = new Scanner(System.in);

    /**
     * Prompts the user and reads the next token as an int.
     *
     * @param prompt the text to print before reading input (not null)
     * @return the parsed int value entered by the user
     * @throws InputMismatchException if the next token is not a valid int
     * @throws NoSuchElementException if input is exhausted
     */
    public int getInt(String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    /**
     * Prompts the user and reads the next token as a double.
     *
     * @param prompt the text to print before reading input (not null)
     * @return the parsed double value entered by the user
     * @throws InputMismatchException if the next token is not a valid double
     * @throws NoSuchElementException if input is exhausted
     */
    public double getDouble(String prompt) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    /**
     * Prompts the user and reads a full line of text.
     *
     * The method first consumes any remaining end-of-line left in the
     * scanner's buffer, then prints the prompt and reads the next line.
     * This mirrors the common pattern when mixing nextInt()/nextDouble()
     * with nextLine().
     *
     * @param prompt the text to print before reading input (not null)
     * @return the full line entered by the user (may be empty)
     * @throws NoSuchElementException if input is exhausted
     */
    public String getString(String prompt) {
        input.nextLine();
        System.out.print(prompt);
        return input.nextLine();
    }

}