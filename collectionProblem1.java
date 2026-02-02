import java.util.LinkedList;
public class collectionProblem1{
    public static void main(String[] args){
        LinkedList<Integer>numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println("Elements:");
        for(int num:numbers){
            System.out.println(num+"");
        }
        System.out.println(numbers);
}
}

