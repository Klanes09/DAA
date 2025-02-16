import java.util.*;

class Priorityq{
    PriorityQueue<int[]> pq = new PriorityQueue<> ((a, b) -> Integer.compare(b[0], a[0]));
    Scanner scan = new Scanner(System.in);
    
    public void enqueue(){
        System.out.print("\nEnter number: ");
        int value = scan.nextInt();
        System.out.print("Enter its priority: ");
        int priority = scan.nextInt();
        
        pq.add(new int[]{priority, value});
        System.out.println(value+" has been added");
    }
    public void dequeue(){
        if(pq.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            int[] removed = pq.poll();
            System.out.println(removed[1]+" has been removed");
        }
        
    }
    
    public void display(){
        if (pq.isEmpty()) {
            System.out.println("\nQueue is empty.");
        } else {
            List<int[]> temp = new ArrayList<>(pq);
            temp.sort((a,b) -> Integer.compare(b[0], a[0])); 
            System.out.print("Queue: ");
            
            for (int[] item : temp) {
                
                System.out.print(item[1] + " ");
            }
            System.out.println(); 
        }
    }
    public void choices(){
        while(true){
            System.out.println("\n[1]Add     [2]Remove \n[3]Display [4]Exit");
            System.out.print("Input: ");
            int choice = scan.nextInt();
            
            switch(choice){
                case 1 -> enqueue();
                case 2 -> dequeue();
                case 3 -> display();
                case 4 -> {
                    System.out.println("Exiting....");
                    return;
                }
                default -> System.out.println("Invalid");
            }
        }
    }
}

public class PrioQue{
    public static void main(String[] args){
        Priorityq pq = new Priorityq();
        pq.choices();
    }
}