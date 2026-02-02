//Q8.create a sorted  ArrayList of integers :10,20,30,40,50.use  collections.binarySearch() to find the
//index of 30 and 25.Explain  the result for 25.


import java.util.ArrayList;
import java.util.Collections;
public class collectionProblem6{
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int indexOfElement30=Collections.binarySearch(numbers,30);
        System.out.println(indexOfElement30);
        int indexOfElement25=Collections.binarySearch(numbers,25);
        System.out.println(indexOfElement25);
    }
}
