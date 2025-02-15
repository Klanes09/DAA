import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

class Max_heap{
    PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
    Scanner scan = new Scanner(System.in);
    
    public void Add(){
        System.out.print("\nEnter Value: ");
        int value = scan.nextInt();
        max_heap.add(value);
        System.out.println("The value "+value+" has been added");
    }
    public void Remove(){
        if(!max_heap.isEmpty()){
            int remove = max_heap.poll();
            System.out.println(remove+" has been removed");
        }
        else{
            System.out.println("The heap is empty");
        }
    }
    
    public void Display(){
        System.out.println("Heap: "+max_heap);
    }
    public void Choice(){
        while(true){
            System.out.println("\nChoices: ");
        System.out.println("[1] Add [2] Remove \n[3] Display [4]Exit");
        System.out.print("Pick: ");
        int choices = scan.nextInt();
        
        switch(choices){
            case 1 -> Add();
            case 2 -> Remove();
            case 3 -> Display();
            case 4 -> {
                System.out.print("Exiting.. Thank you!");
                return;
                }
            default -> System.out.println("Invalid");
            }
        
        }
    
    }
    
}
public class Max{
    public static void main(String[] args){
        Max_heap mx = new Max_heap();
        mx.Choice();
    }
}
