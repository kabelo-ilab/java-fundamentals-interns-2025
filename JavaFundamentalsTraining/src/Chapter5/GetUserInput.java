package Chapter5;

import java.util.Scanner;

/**
 * @author Kabelo Tlhape
 * Ask the user to enter 3 names, the name should be stored inside the
 * array only if it is 4 or more characters long
 */
public class GetUserInput {
    public static void main(String[] args) {
        String[] arNames = new String[3];
        Scanner sc = new Scanner(System.in);
        String name;

        int count  = 0;
        while(count < 3)
        {
            System.out.print("Enter name with at least 4 characters: ");
            name = sc.nextLine();

            if(name.isEmpty() || name.length() < 4 || name.matches(".*\\d.*"))
            {
                System.out.println("Invalid input");
                continue;
            }

            arNames[count] = name;
            count++;

        }
//        int count = 0;
//        while (count < 3){
//            System.out.print("Enter name with at least 4 characters: ");
//            name = sc.next();
//
//            if (name.length() >= 4){
//                arNames[count] = name;
//                count++;
//            }
//        }

//        for (int i = 0; i < arNames.length; i++) {
//            do {
//                System.out.print("Enter name with at least 4 characters: ");
//                name = sc.next();
//
//            }while (name.length() < 4);
//            arNames[i] = name;
//        }

        System.out.println("=============================");
        for (String n : arNames){
            System.out.println(n);
        }

    }
}
