import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinSingly{
    Node  head;
    
    public LinSingly(){
        head = null;
    }
    public void inputAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void inputAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node nod = head;
        while(nod.next != null){
            nod = nod.next;
        }
        nod.next = newNode;
    }
    public void Display(){
        Node current = head;
        if(head == null){
            System.out.print("\nEmpty");
            return;
        }
        System.out.print("\nList: ");
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
    public static void main(String[] args){
        LinSingly list = new LinSingly();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("\nChoose an option:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int pick = scan.nextInt();
            
            switch(pick){
                case 1:
                    System.out.print("\nInput data at beginning: ");
                    int a = scan.nextInt();
                    list.inputAtBeginning(a);
                    break;
                case 2:
                    System.out.print("\nInput data at last ");
                    int b = scan.nextInt();
                    list.inputAtEnd(b);
                    break;
                case 3:
                    list.Display();
                    break;
                case 4:
                    System.out.print("\nExiting. Thanks!");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.print("\nInvalid input");
            }
        }
    }
    public void runSingly(int size) {
        System.out.println("[DEBUG] Running Singly Linked List operations with size: " + size);
        
    }
}