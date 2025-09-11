package Chapter5;

/**
 * @author Kabelo Tlhape
 */
public class ParallelArrays {
    public static void main(String[] args) {
        String[] arStudents = new String[]{"John", "Kate", "Jess", "Carol"};
        int[] arTestMarks = new int[]{58,74,78,79};

        int size = arStudents.length;

        System.out.println("Student\t\tTest Mark");
        System.out.println("=============================");
        for (int i = 0; i < size; i++) {
            System.out.println(arStudents[i] + "\t\t" + arTestMarks[i]);
        }
    }
}
