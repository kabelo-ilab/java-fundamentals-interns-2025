package Chapter4;

/**
 * @author Kabelo Tlhape
 */
public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println("Sum: " + calcSum(2.3,8));

    }

    public static int calcSum(int x, int y, int z){
        return x + y + z;
    }

    public static double calcSum(double x, int y){
        return x + y;
    }

    public static double calcSum(int x, double y){
        return x + y;
    }

    /**
     * Calculate the sum of two integers
     * @param x Number 1
     * @param y NUmber 2
     * @return Sum
     */
    public static int calcSum(int x, int y){
        return x + y;
    }

    /**
     * Calculate the sum of two double
     * @param x Number 1
     * @param y Number 2
     * @return Sum
     */
    public static double calcSum(double x, double y){
        return x + y;
    }

    /**
     * Calculate the sum of two floating point values
     * @param x Number 1
     * @param y Number 2
     * @return Sum
     */
    public static float calcSum(float x, float y){
        return x + y;
    }
}
