import java.util.ArrayList;
import java.util.Collections;
public class collectionProblem3{
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);
    }
}