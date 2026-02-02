//Q13.Given an arrayList of Integers,determine if it contains any duplicate elements.Return true if
//duplicates exists,false otherwise,
//*Example   input [1,2,3,4,2]->true;[1,2,3,4]->false.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import java.util.List;

public class collectionProblem11 {
    public static boolean containsDuplicates(List<Integer>numbers){
        Set<Integer>uniqueNumber = new HashSet<>();
        for(int num: numbers){
            if(!uniqueNumber.add(num)){
                return  true;
            }
        }
        return false;
    }
        public static void main(String[] args) {
            ArrayList<Integer>numbers=new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            //numbers.add(2);
            System.out.println(containsDuplicates(numbers));
        }
    }

