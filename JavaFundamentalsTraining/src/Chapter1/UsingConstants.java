package Chapter1;

/**
 * @author Kabelo Tlhape
 * Using constant values: Shouldn't change during program
 * execution.
 * Use 'final' keyword to indicate that a variable is constant
 */
public class UsingConstants {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB";
        String welcomeMessage;

        welcomeMessage = "Welcome to " + COMPANY_NAME + "'s " + CURRENT_YEAR +
                " internship program";

        System.out.println(welcomeMessage);
    }
}
