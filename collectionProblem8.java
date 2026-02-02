//Q10.Using PriorityQueue for Task Prioritization 
//*problem:Youhave tasks with priority levels (lower means higher priority).
//create a priorityQueue of Intgers.Addproorities 5,1 3,2.Demonstrate how poll() extracts 
//elements in priority order 


import java.util.PriorityQueue;
public  class collectionProblem8{
    public static void main(String[] args) {
        PriorityQueue<Integer>task=new PriorityQueue<>();
        task.offer(5);
        task.offer(1);
        task.offer(3);
        task.offer(2);
        System.out.println(task);


        while(!task.isEmpty()){
            System.out.println("Priority is:"+task.poll());
        }


    }
}

