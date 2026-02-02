import java.util.ArrayList;

public class collectionProblem12 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(9);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(8);
        list2.add(9);

        ArrayList<Integer> commonList = new ArrayList<>();

        for (Integer num : list1) {
            if (list2.contains(num) && !commonList.contains(num)) {
                commonList.add(num);
            }
        }

        System.out.println(commonList);
    }
}