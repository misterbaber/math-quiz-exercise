/**
 * Utility methods used across the math quiz exercise.
 *
 * <p>This class provides small helper functions such as rounding a double
 * to a specified number of decimal places and generating a random integer
 * inside a inclusive range.</p>
 */
public class Methods {
    /**
     * Round a double value to a given number of decimal places.
     *
     * @param places the number of decimal places to keep (must be >= 0).
     * @param value the value to round.
     * @return the value rounded to {@code places} decimal places.
     *
     * <p>Examples:
     * <pre>
     * roundDouble(2, 3.14159) // returns 3.14
     * roundDouble(0, 2.7)     // returns 3.0
     * </pre>
     *</p>
     */
    public static double roundDouble(int places, double value) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    /**
     * Return a uniformly distributed random integer between {@code min}
     * and {@code max}, inclusive.
     *
     * @param min the lower bound (inclusive)
     * @param max the upper bound (inclusive)
     * @return a random integer x such that {@code min <= x <= max}
     * @throws IllegalArgumentException if {@code min > max}
     */
    public static int randInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be <= max");
        }
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
