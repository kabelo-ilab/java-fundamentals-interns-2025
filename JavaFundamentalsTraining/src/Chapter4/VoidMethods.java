package Chapter4;

/**
 * @author Kabelo Tlhape
 */
public class VoidMethods {
    public static void main(String[] args) {
        displayMessage();
        System.out.println("==================");
        displayAddress();
    }

    public static void displayMessage(){
        System.out.println("Hi, Welcome to Java Training");
    }

    private static void displayAddress(){
        System.out.println("""
                234 Rivonia Street.
                Sandton
                1234""");
    }


}
