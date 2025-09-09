package Chapter3;
/**
 * @author Kabelo Tlhape
 * Use the for loop when you know the number of times
 * the loop should execute
 */
public class ForLoop {
    public static void main(String[] args) {
        //Display Java 5 times
        for(int x = 1; x <= 5; x++){
            System.out.print(x + " - Java  ");
        }
        //multiple conditions
        System.out.println("\n=====Multiple Conditions=====");
        for(int x = 1, y = 5; x < 10; x++, y--){
            System.out.println(x + " <------> " + y);
        }

        //multiple conditions
        System.out.println("\n\n=====Multiple Conditions=====");
        for(int x = 1, y = 5; x < 10 && y >= 0; x++, y--){
            System.out.println(x + " <------> " + y);
        }
    }
}
