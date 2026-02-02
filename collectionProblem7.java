//Q9.Simulate a basic queue using a LinkedList.Add "task A","Task B","Task C".Then,remove and print
//tasks one by one until the queue is empty.


import java.util.LinkedList;
import java.util.Queue;;
public class collectionProblem7{
    public static void main(String[] args) {
        Queue<String>taskQueue=new LinkedList<>();
        taskQueue.offer("Task A");
        taskQueue.offer("Task B");
        taskQueue.offer("Task C");
        System.out.println(taskQueue);

        while(!taskQueue.isEmpty()){
            System.out.println("My task:"+taskQueue.poll());
        }

    }
}
