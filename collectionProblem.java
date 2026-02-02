//create a arraylist of string add "Apple","Banana",and "Cherry" to it.
//Print  the list ,then remove "Banana "and print the list again.public class collectionsProblems {
    

import java.util.ArrayList;

public class collectionProblem {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print original list
        System.out.println(fruits);

        // Remove "Banana"
        fruits.remove("Banana");

        // Print updated list
        System.out.println(fruits);
    }
}




















