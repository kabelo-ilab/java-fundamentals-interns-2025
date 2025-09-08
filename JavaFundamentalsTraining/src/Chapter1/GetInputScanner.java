package Chapter1;

import java.util.Scanner;

/**
 * @author Kabelo Tlhape
 * This class demonstrate how to get input from the user
 * using a scanner object
 */
public class GetInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        double height;
        float salary;
        boolean isMarried = true;
        char initial;
        String firstname;

        System.out.print("Please enter initial: ");
        initial = sc.next().charAt(0);
        System.out.print("Please enter your name: ");
        firstname = sc.next();
        System.out.print("Please enter age: ");
        age = sc.nextInt();
        System.out.print("Please enter height: ");
        height = sc.nextDouble();
        System.out.print("Please enter salary: ");
        salary = sc.nextFloat();

        System.out.println("\n==========Details==========");
        System.out.println("Name: " + firstname + " (" + initial + ")" +
            "\nAge: " + age +
            "\nHeight: " + height +
            "\nSalary: " + salary +
            "\nMarried?: (" + isMarried + ")");


    }
}
