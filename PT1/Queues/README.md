# Queue

Simple Queue
Simple Queue is a linear data structure that follows the First-In-First-Out (FIFO) principle, where elements are added to the rear (back) and removed from the front (head)

import java.util.LinkedList;                                                   // Util to use the data structure

import java.util.Queue;                                                        // Util to use the data structure

import java.util.Scanner;                                                      // Scanner to have an user input

public class Que{                                                              // Main class

    public static void main(String[] args){                                    // Main method
    
        Scanner scan = new Scanner(System.in);                                 // To have an user input
        Queue<String> Q = new LinkedList<>();
        
        while(true){                                                           // Switch this is where teh user will choice the operations
            
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


    private static void theChoice(){                                                   // The choices this is the class where it will display the operation
        System.out.println("\nEnter Queue");
        System.out.println("1. Enter Queue");
        System.out.println("2. Check Queue Size"); 
        System.out.println("3. Check Names");
        System.out.println("4. Remove the first in the queue");
        System.out.println("5. Exit Queue");
        System.out.print("Pick: ");
    }

    private static int Pick(Scanner scan){                                            // This is where the user input will be store
        int choice;
        choice = scan.nextInt();
        return choice;
    }

    private static void enterName(Queue<String> Q, Scanner scan){                     // Here is where the user will input the name to get to the queue
        System.out.print("\nEnter name: ");
        String name;
        name = scan.next();
        Q.offer(name);                                                               // This commad is where the user input will be stored and added
        System.out.println("\nName "+name+" has been added");                        // Confirmation that the user input is added
    }

    private static void checkSize(Queue<String> Q){                                  // This class will check the size of the queue 
        if(!Q.isEmpty()){                                                            // This will check if the queue is empty or not, the if statement
            System.out.println("\nCurrent Queue: "+Q.size());                        // if the queue is not empty it will display teh queue size
        } else{                                                                      // else statement 
            System.out.println("\nQueue is empty");                                  // if the queue is empty this command line will be displayed
        }
    }


    private static void checkNames(Queue<String> Q){                                 // Check names, this class will check who is inside the queue
        if(!Q.isEmpty()){                                                            // Checking again if the queue is empty or not
            System.out.println("\nName:");                                           
            System.out.println(Q);                                                   
            Q.peek();                                                                // This will print the names inside the queue
        } else{
            System.out.println("\nQueue is empty");                                  // if the queue is empty this will be display
        }
    }
    
    private static void removeFirst(Queue<String> Q){                                // This class will remove the first one in the queue
        if (!Q.isEmpty()){                                                           // Checking again
            String polll = Q.poll();                                                 // this will remove the first on the queue
            System.out.println(polll+" has left the queue");                         // confimation that the name has been removed
        } else{
            System.out.println("\nThe queue is empty");                              // this will be displayed if the queue is empty
        }
    }
}  



# Priority Queue

A Priority Queue is a data structure where each element is associated with a priority, and elements with higher priority are dequeued before those with lower priority.


import java.util.*;                                                                  // This is where all the util needed


class Priorityq{                                                                    // Class Priority queue

    PriorityQueue<int[]> pq = new PriorityQueue<> ((a, b) -> Integer.compare(b[0], a[0]));
    Scanner scan = new Scanner(System.in);
    
    public void enqueue(){                                                          // enqueue this is where you add something in the queue
        System.out.print("\nEnter number: ");                                       // Asking user what to add 
        int value = scan.nextInt();                                                 // the scanner to get the user input
        System.out.print("Enter its priority: ");                                   // it will ask the user the priority of something
        int priority = scan.nextInt();                                              // scanner again to get the user input
        
        pq.add(new int[]{priority, value});                                         // this will add the value 
        System.out.println(value+" has been added");                                // confirmation that the number has been added
    }
    public void dequeue(){                                                          // Dequeue is where you will remove a number in the queue
        if(pq.isEmpty()){                                                           // checking if the queue is emopty or not
            System.out.println("Queue is empty");                                   // if the queue is empty this will be displayed
        }else{
            int[] removed = pq.poll();                                              //  if the queue is not empty this command will remove the number in the queue
            System.out.println(removed[1]+" has been removed");                     //  confirmation that the number has been removed
        }
        
    }
    
    public void display(){                                                          // display class this will display the queue 
        if (pq.isEmpty()) {                                                         // checking if the queue is empty or not
            System.out.println("\nQueue is empty.");                                // confirmation that the queue is empty
        } else {
            List<int[]> temp = new ArrayList<>(pq);                                 // this will display the queue this block from here
            temp.sort((a,b) -> Integer.compare(b[0], a[0])); 
            System.out.print("Queue: ");
            
            for (int[] item : temp) {
                
                System.out.print(item[1] + " ");
            }
            System.out.println();                                                  // to here
        }
    }
    public void choices(){                                                          // This will be the choice for the users
        while(true){
            System.out.println("\n[1]Add     [2]Remove \n[3]Display [4]Exit");
            System.out.print("Input: ");
            int choice = scan.nextInt();
            
            switch(choice){                                                          // Switch call the command like enqueue or dequeue depends on the user
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

public class PrioQue{                                                                 // Maind method
    public static void main(String[] args){
        Priorityq pq = new Priorityq();
        pq.choices();                                                                 // calling the Priorityq class to run the program
    }
}


# How to use the Simple and Priority Queue

# Simple Queue
Case 1 is entering a name inside the queue 
  sample:
  click 1, then input the name

case 2 is checking the size of the queue
  sample:
  click 2 then the size of the queue will be displayed

case 3 checking the names inside the queue
  sample:
  click 3 and the names will be displayed

case 4 removing the first in the queue
  sample:
  click 4 and the first one the queue will be displayed

case 5 exiting 
  this will exit the program

# Priority Queue

case 1:
 this will add number to the queue
 then it will ask you the priority of that number
 sample: 
   you input 1, then it will ask you the priority you will put any number sample 12
   and the 1 will have a value or priority of 12

case 2:
 this will remove the highest priority number 
 lets say that you have 1 that has a priority of 12
 and a 12 that has a priority of 1
 the highest priority is 1 then the 1 will be removed in the queue

case 3: 
  this will diplay the queue 

case 4:
  this will exit the program

  
 
