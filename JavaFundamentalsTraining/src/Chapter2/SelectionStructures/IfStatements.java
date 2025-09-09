package Chapter2.SelectionStructures;
/**
 * @author Kabelo Tlhape
 * This class demostrate the use of if statement, if-else and
 * nested if
 */
public class IfStatements {
    public static void main(String[] args) {

        int a = 5, b = 6, c = 7, d = 10;
        boolean x = true, y = false;

        //single if
        if (a > 5)
            System.out.println("Statement A");

        System.out.println("Statement B");
            //binary if
        if (a <= b){
            System.out.println("Statement C");
        }else{
            System.out.println("Statement D");
        }

        //if-else-if
        if (a < c){
            System.out.println("Statement E");
        } else if (c > d && x) {
            System.out.println("Statement F");
        } else if (d != a || y) {
            System.out.println("Statement G");
        }else{
            System.out.println("Statement H");
        }

        //nested if

        if (x){
            if (y){
                System.out.println("Statement I");
            } else if (y && c != d) {
                System.out.println("Statement J");
            }else{
                System.out.println("Statement K");
            }
        } else if (c >= d) {
            System.out.println("Statement L");
        }else {
            System.out.println("Statement M");
        }

    }
}
