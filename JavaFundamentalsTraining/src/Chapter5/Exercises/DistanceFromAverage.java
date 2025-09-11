package Chapter5.Exercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        int[] arNumbers = new int[10];
        double average = 0, total = 0, distance;
        int number, count = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter number: ");
            number = sc.nextInt();

            if (number != 0){
                arNumbers[count] = number;
                total+= number;
                count++;
            }
        }while (count < 10 && number != 0);

        if (count == 0){
            System.out.println("Error:...");
        }else{
            average = total / count;

            for (int i = 0; i < count; i++) {
                distance = (arNumbers[i] - average);
                System.out.println(String.format("""
                    Number: %d ---> Distance: %.2f""", arNumbers[i], distance));
            }
        }

    }
}
