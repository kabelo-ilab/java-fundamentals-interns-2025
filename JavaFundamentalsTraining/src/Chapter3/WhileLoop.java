package Chapter3;
/**
 * @author Kabelo Tlhape
 * Use While loop when you don't know the number of iterations.
 * While loop will continue to run untill the condition is false
 */
public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        while (count < 5){
            System.out.println("count = " + count);
            count+=2;
        }
    }
}
