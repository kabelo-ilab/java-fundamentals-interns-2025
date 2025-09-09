package Chapter2.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RoomPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bedChoice;
        final double QUEEN_BED_PRICE = 125;
        final double KING_BED_PRICE = 139;
        final double SUITE_BED_PRICE = 165;
        double totalCost;
        double roomPrice;
        double additionalPrice = 0;
        int viewOption;

        System.out.println("""
                A - Queen Bed
                B - King Bed
                C - Suite""");
        bedChoice = sc.next();

        if (bedChoice.equalsIgnoreCase("a") ||
                bedChoice.equalsIgnoreCase("b") || bedChoice.equalsIgnoreCase("c")){
            System.out.println("""
                    1 - Lake View
                    2 - Park View""");
            viewOption = sc.nextInt();
            if (viewOption == 1 || viewOption == 2) {
                switch (viewOption) {
                    case 1:
                        additionalPrice = 15;
                        break;
                    default:
                        additionalPrice = 0;
                }

                switch (bedChoice){
                    case "A" : roomPrice = QUEEN_BED_PRICE;
                    break;
                    case "B" : roomPrice = KING_BED_PRICE;
                    break;
                    default:roomPrice = SUITE_BED_PRICE;
                }

                totalCost = roomPrice + additionalPrice;
                System.out.format("Total Price: %.2f", totalCost);
            }else{
                System.out.println("Invalid view option. Please select 1 or 2");
            }
        }else{
            roomPrice = 0;
            System.out.println("Invalid code");

        }
    }
}
