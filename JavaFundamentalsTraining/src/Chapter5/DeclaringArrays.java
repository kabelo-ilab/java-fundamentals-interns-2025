package Chapter5;

/**
 * @author Kabelo Tlhape
 * This class shows how to declare, assign and use array elements
 */
public class DeclaringArrays {
    public static void main(String[] args) {
        //Declare
        int[] arNumbers = new int[5];
        String[] arNames = new String[5];
        double[] arPrices = new double[5];

        //Assign
        arNumbers[0] = 5;
        arNumbers[1] = 15;
        arNumbers[2] = 52;
        arNumbers[3] = 54;
        arNumbers[4] = 65;

        //Use
        System.out.println(arNumbers[2]);
        System.out.println(arNames[2]);
        System.out.println(arPrices[3]);
    }
}
