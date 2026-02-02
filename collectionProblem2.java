//Q4.create a hashMap mapping student IDs(Integer)to names (String).add three students:101->"Alice"102->"Bob"103->"Charlie"
//Get and print the name of the stuent 102.check if stuent104 exists..


import java.util.HashMap;
public class collectionProblem2{
    public static void main(String[] args) {
        HashMap<Integer, String>studentMap=new HashMap<>();
        studentMap.put(101,"Alice");
        studentMap.put(102,"Bob");
        studentMap.put(103,"Charlie");
        System.out.println("Name of the student 102:"+studentMap.get(102));
        System.out.println("Name of the student 104:"+studentMap.get(104));
    }
}
