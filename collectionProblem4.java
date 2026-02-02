//Q6.Given a HashMap<String,Integer>representing product prices(product name->price),iterate through it and
//print each product name and its price.
 

import java.util.HashMap;
import java.util.Map;

public class collectionProblem4 {
    public static void main(String[] args) {

        HashMap<String, Integer> product = new HashMap<>();
        product.put("Laptop", 50000);
        product.put("Jeans", 2000);
        product.put("Bottle", 50);

        for (Map.Entry<String, Integer> entry : product.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}