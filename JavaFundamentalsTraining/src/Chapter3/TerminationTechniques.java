package Chapter3;

/**
 * @author Kabelo Tlhape
 * Break: end / exit the loop
 * Continue: will skip the current iteration and start the next iteration
 */
public class TerminationTechniques {
    public static void main(String[] args) {

        //break: exit / end the loop
        System.out.println("=====Break=====");
        for (int i = 0; i < 20; i++) {
            if (i == 5) break;
            System.out.print("i = " + i + ",  ");
        }

        //Continue: skip current iteration
        System.out.println("\n\n=====Continue=====");
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 15; i++) {
            if (i == 5) break;
            if (i == 3) continue;
            System.out.println("i = " + i);
        }

    }
}
