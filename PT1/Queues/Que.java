import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Que{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        Queue<String> Q = new LinkedList<>();
        
        while(true){
            
            theChoice();
            
            int pick = Pick(scan);
            
            switch(pick){
                case 1:
                    enterName(Q, scan);
                    break;
            
                case 2:
                    checkSize(Q);
                    break;
                
                case 3:
                    checkNames(Q);
                    break;
                case 4:
                    removeFirst(Q);
                    break;
                case 5:
                    System.out.println("Exiting. Thank you!");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input ");
            }
            
        }
        
    }


    private static void theChoice(){
        System.out.println("\nEnter Queue");
        System.out.println("1. Enter Queue");
        System.out.println("2. Check Queue Size"); 
        System.out.println("3. Check Names");
        System.out.println("4. Remove the first in the queue");
        System.out.println("5. Exit Queue");
        System.out.print("Pick: ");
    }

    private static int Pick(Scanner scan){
        int choice;
        choice = scan.nextInt();
        return choice;
    }

    private static void enterName(Queue<String> Q, Scanner scan){
        System.out.print("\nEnter name: ");
        String name;
        name = scan.next();
        Q.offer(name);
        System.out.println("\nName "+name+" has been added");
    }

    private static void checkSize(Queue<String> Q){
        if(!Q.isEmpty()){
            System.out.println("\nCurrent Queue: "+Q.size());
        } else{
            System.out.println("\nQueue is empty");
        }
    }


    private static void checkNames(Queue<String> Q){
        if(!Q.isEmpty()){
            System.out.println("\nName:");
            System.out.println(Q);
            Q.peek();
        } else{
            System.out.println("\nQueue is empty");
        }
    }
    
    private static void removeFirst(Queue<String> Q){
        if (!Q.isEmpty()){
            String polll = Q.poll();
            System.out.println(polll+" has left the queue");
        } else{
            System.out.println("\nThe queue is empty");
        }
    }
}  
    
