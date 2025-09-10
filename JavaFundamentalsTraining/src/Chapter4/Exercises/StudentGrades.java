package Chapter4.Exercises;

import java.util.Scanner;

public class StudentGrades {

    static String firstname, lastname;
    static int birthYear;
    static double testMark;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greetings();

        System.out.print("Enter firstname: ");
        firstname = sc.next();
        System.out.print("Enter lastname: ");
        lastname = sc.next();
        System.out.print("Enter birth year: ");
        birthYear = sc.nextInt();
        System.out.print("Enter test mark: ");
        testMark = sc.nextDouble();

        display();
    }

    static void greetings(){
        System.out.println("Hello, welcome to Student Grading System");
    }

    static String determineGrade(double testMark){

        String grade;
        if (testMark >= 90){
            grade = "A+";
        } else if (testMark >= 80) {
            grade = "A";
        }else if (testMark >= 70) {
            grade = "B";
        }else if (testMark >= 60) {
            grade = "C";
        }else if (testMark >= 50) {
            grade = "D";
        }else if (testMark >= 40) {
            grade = "D-";
        }else  {
            grade = "F";
        }
        return grade;
    }

    static int determineAge(int birthYear){
        final int CURRENT_YEAR = 2025;

        return CURRENT_YEAR - birthYear;
    }

    static void display(){
        System.out.format("""
                ============OUTPUT============
                Firstname: %s
                Lastname: %s
                Age: %d
                Grade: %s""", firstname, lastname, determineAge(birthYear), determineGrade(testMark));
    }
}
