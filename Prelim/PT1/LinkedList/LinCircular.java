import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class cirList {
    Node head;

    void addEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    void addBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}

public class LinCircular{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        cirList list = new cirList();

        while (true) {
            System.out.println("\nCircular Linked List Operations:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the beginning: ");
                    int val1 = scan.nextInt();
                    list.addBeginning(val1);
                    break;
                case 2:
                    System.out.print("Enter value to insert at the end: ");
                    int val2 = scan.nextInt();
                    list.addEnd(val2);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    public void runCircular(int size) {
        System.out.println("[DEBUG] Running Circular Linked List operations with size: " + size);
        
    }
}