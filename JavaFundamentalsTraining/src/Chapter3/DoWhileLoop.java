package Chapter3;
/**
 * @author Kabelo Tlhape
 * Do While Loop will execute atleast once
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        char option = 'a';

        do{
            System.out.println("option = " + option);
            option++;
        }while(option != 'g');
    }
}
