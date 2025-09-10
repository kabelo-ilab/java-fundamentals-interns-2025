package Chapter4;

import java.util.Arrays;

/**
 * @author Kabelo Tlhape
 */
public class ParameterizedMethods {
    public static void main(String[] args) {
        displayMessage("Today is Wednesday");
        displayDetails("John",25,1.63,25000);

        System.out.println("\nSum: " + getSum(5,8));

        System.out.println("\nSum: " + calcSum(2,5,6,8,7));
    }
    public static void displayMessage(String msg){
        System.out.println(msg);
    }

    public static int getSum(int num1, int num2){
        return num1 + num2;
    }

    public static void displayDetails(String name, int age, double height, float salary){
        System.out.println("name = " + name + ", age = " + age + ", height = " + height + ", salary = " + salary);
    }

    public static double calcSum(double... numbers){
        return Arrays.stream(numbers).sum();
    }
}
