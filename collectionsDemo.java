

import java.util.ArrayList;

public class collectionsDemo {
    public static void main(String[] args) {
        //collections:List--> ArrayList
        ArrayList<String> shoppingCart = new ArrayList<>();
        System.out.println("Shopping Cart "+shoppingCart);
        shoppingCart.add("shirt");
        shoppingCart.add("jeans");
        shoppingCart.add("Sportswear");
        shoppingCart.add("Jackets");
        System.out.println("Shopping Cart "+shoppingCart);
        
        //get
        System.out.println(shoppingCart.get(0));

        //set
        shoppingCart.set(0, "Ethnic wear");
        System.out.println("Shopping Catr "+shoppingCart);

        //remove
        shoppingCart.remove(2);
        System.out.println("Shopping Cart"+shoppingCart );

        //contains
        //System.out.println(shoppingCart.contains("sports  eshirt"));
        System.out.println(shoppingCart.contains("Ethnic ware"));

        //isEmpty
        System.out.println(shoppingCart.isEmpty());

        

    }
    
}




