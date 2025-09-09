package Chapter1.Exercise;

import java.util.Scanner;

public class Fundraiser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double ADULT_MEAL_PRICE = 50.00;
        final double CHILD_MEAL_PRICE = 37.50;

        int adultMeals;
        int childrenMeals;
        double totalMealCost;

        System.out.print("Number of adult meals: ");
        adultMeals = sc.nextInt();
        System.out.print("Number of children meals: ");
        childrenMeals = sc.nextInt();

        double totalAdultMeals = (adultMeals * ADULT_MEAL_PRICE);
        double totalChildrenMeals = (childrenMeals * CHILD_MEAL_PRICE);
        totalMealCost = totalAdultMeals + totalChildrenMeals;

        System.out.format("""
                Adult Meals: %.2f
                Children Meals: %.2f
                Total Cost: %.2f
                """, totalAdultMeals, totalChildrenMeals, totalMealCost);

    }
}
