//Q11.Given a List of Strings,count the frequency of each string and store it in a HashMap<String,integer>.
//*Example Input:["apple,"banana","apple","orange","banana","apple"]
//*Expected output:{apple=3,banana=2,orange=1}


import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
public class collectionProblem9{
    public static void main(String[] args) {
        List<String>fruits=Arrays.asList("apple","banana","apple","orange","banana","apple");
        HashMap<String, Integer>frequencyOffruit=new HashMap<>();
        for(String fruit:fruits){
            if(frequencyOffruit.containsKey(fruit)){
                frequencyOffruit.put(fruit,frequencyOffruit.get(fruit)+1);

            }else{
                frequencyOffruit.put(fruit,1);
            }
        }

        System.out.println(frequencyOffruit);
    }
}