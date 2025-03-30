import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class LinDoubly {
    Node head;

    public LinDoubly() {
        head = null;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    public void displayForward() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("LinkedList (Forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackward() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        System.out.print("LinkedList (Backward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinDoubly list = new LinDoubly();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Display Forward");
            System.out.println("4. Display Backward");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at beginning: ");
                    int data1 = scanner.nextInt();
                    list.insertAtBeginning(data1);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    int data2 = scanner.nextInt();
                    list.insertAtEnd(data2);
                    break;
                case 3:
                    list.displayForward();
                    break;
                case 4:
                    list.displayBackward();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    public void runDoubly(int size) {
        System.out.println("[DEBUG] Running Doubly Linked List operations with size: " + size);
        
    }
}