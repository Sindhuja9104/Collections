
import java.util.ArrayList;
import java.util.Collections;

class collectionDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(45);
        numbers.add(5);
        numbers.add(8);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
