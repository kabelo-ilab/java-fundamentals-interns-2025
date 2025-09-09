package Chapter2.SelectionStructures;
/**
 * @author Kabelo Tlhape
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? resultWhenTrue : resultsWhenFalse
//        int numOne = 5, numTwo = 7;
//        int smallNumber;
//
//        if (numOne < numTwo){
//            smallNumber = numOne;
//        }else {
//            smallNumber = numTwo;
//        }
//
//       //variable = condition ? resultWhenTrue : resultsWhenFalse
//        smallNumber = numOne < numTwo ? numOne : numTwo;

        int number = 3;
        String results;


        results = number %2 == 0 ? "Even" :
                number %5 == 0 ? "Multiple of 5" : "Odd";
        System.out.println(results);

    }
}
