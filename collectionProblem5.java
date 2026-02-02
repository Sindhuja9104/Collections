import java.util.TreeSet;
public class collectionProblem5 {
    public static void main(String[] args) {

        // Create a TreeSet of Integers
        TreeSet<Integer> ts = new TreeSet<>();

        // Add elements
        ts.add(5);
        ts.add(2);
        ts.add(8);
        ts.add(1);
        ts.add(5); // duplicate element
        ts.add(3);

        // Print the TreeSet
        System.out.println("TreeSet elements: " + ts);
    }
}
