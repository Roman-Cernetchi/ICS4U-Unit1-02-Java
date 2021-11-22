/*java -jar ~/scripts/checkstyle.jar -c ~/scripts/mr-coxall_checks.xml *.java
 * This program calculates how much energy would be generated from a certain
 * amount of mass.
 *
 * @author  Roman Cernetchi
 * @version 1.0
 * @since   2021-11-22
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This class contains the calculations for determining the amount of energy
* that would be generated from a certain amount of mass.
*/
final class Energy {

    // Public Constant Declarations
    /**
     * This constant represents the speed of light.
     */
    public static final double LIGHT_SPEED = 2.9979 * Math.pow(10, 7);

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Calculates and outputs the energy generated from an amount of mass.
     *
     * @param args No args will be used.
     * @throws IOException if there is anything wrong with the input
     * @throws NumberFormatException if the input isn't a float
     * */
    public static void main(final String[] args)
            throws NumberFormatException, IOException {

        // Variable Declarations
        final double mass;
        final double energy;

        try {
            // User prompt
            System.out.print("Enter the mass of your object (kg): ");

            // Gathering the user input
            final BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            // Converts the input to float
            mass = Double.parseDouble(inputReader.readLine());

            // Calculates the amount of energy (E = mc²)
            energy = mass * Math.pow(LIGHT_SPEED, 2);

            // Outputs the result of the calculation to the user
            System.out.println(mass + " can create " + energy + " J");
        } catch (NumberFormatException | IOException exception) {
            System.out.println("That wasn't a number.");
        }

        System.out.println("\nDone.");

    }

}
