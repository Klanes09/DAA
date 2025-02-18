# LinkedList Singly

A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail). Each element in a linked list is called a node


    public void inputAtBeginning(int data){           
        Node newNode = new Node(data);                // creates new node and stores the data
        newNode.next = head;                          // sets the head as a new new node
        head = newNode;                               // head is the new node
    }
    public void inputAtEnd(int data){                 
        Node newNode = new Node(data);                // this line creates a new node, The node contuctor take the integer data as an argument
        if(head == null){                             // This line checks if the head of the list is null or not       
            head = newNode;                           // if the list is empty this line will set the head of the list to point to the created new node
            return;                                   
        }
        Node nod = head;                              // creates a temporary pointer which is nod and 
        while(nod.next != null){                      // this loop iterates through the list as long as the next pointer of the current node
            nod = nod.next;                           // each iteration of the loop the nod pointer is moved to the next node in the list 
        }
        nod.next = newNode;                           // after that loop completes the nod pointer points to the last node in the list 
    }
    public void Display(){
        Node current = head;                          // Created new pointer named current and it is set with the value of the head
        if(head == null){                             // this check if the head is null of not, if the head is null it means the list is empty
            System.out.print("\nEmpty");              // Prints that the list is empty, just a confirmation
            return;
        }
        System.out.print("\nList: ");                   
        while(current != null){                       // The loop continues as long as current points is not equal to null or empty
            System.out.print(current.data+ " ");      
            current = current.next;                   // The current ponter moves to the next node in the list by assigning it with the current.next to the current
        }
    }
    public static void main(String[] args){           // The main methos where the code is executed, with the switches and the methods created.
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
}

# How to use the code 
case 1
you will be ask what data are you gonna input at the begining
then if you enter the data will be stored at the first

case 2
same as the case 1 you will be ask to input the data to be stored at the end

case 3
this display the list, this will display the whole list

case 4
this will stop the programm


# LinkedList Doubly

A doubly linked list is a bi-directional linked list. So, you can traverse it in both directions. Unlike singly linked lists, its nodes contain one extra pointer called the previous pointer. This pointer points to the previous node

public void insertAtBeginning(int data) {                              
        Node newNode = new Node(data);                                // creates a new node object with the data
        newNode.next = head;                                          // Sets the pointer of the new created node which the new node to point to the current head
        if (head != null) {                                           // This if statement block checks if the list is not empty
            head.prev = newNode;                                      // if the list is not empty this line will be excuted and sets the prev pointer of the current head node to point to the new "newNode"
        }
        head = newNode;                                               // this line updates the head of the list
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);                                // creates a new node object with the given data
        if (head == null) {                                          // check if the code or list is empty or not
            head = newNode;                                          // if the list is empty the head will be set to point to the newly creatd newNode
            return;
        }
        Node last = head;                                           //  this line creates a temporary pointer which is the last and sets it with the current value of the head 
        while (last.next != null) {                                 // this loop iterates throught the list as long as the next pointer od the current node last is not null
            last = last.next;                                       // each iteration of the loop the last poniter is moved to the next node in the list by assigning the value of the last.next to the last 
        }
        last.next = newNode;                                        // after the loop completes the last pointer points to the last node in the list 
        newNode.prev = last;                                        // this line sets the prev pointer of the newly inserted node "newNode" to point to the previous node which is last
    }
    public void displayForward() {
        Node current = head;                                        // Craeted a temporary pointer current and sers it with the value of head
        if (head == null) {                                         // This if statement check if the head of the list if null or not
            System.out.println("List is empty");                    // this line will work if the list is empty or just confirmation that the list is empty
            return;
        }
        System.out.print("LinkedList (Forward): ");                 // the following output will show the list forward order
        while (current != null) {                                   // this loop continues as long as current pointer is not null
            System.out.print(current.data + " ");                  // this line prints or displays data value of the current node
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackward() {
        Node current = head;                                      // same as last
        if (head == null) {                                       // this check if the head of the list is null or not
            System.out.println("List is empty");                  // confirmation
            return;
        }
        while (current.next != null) {                            // loop iterates through the list as long as the next pointer of the current node is not null
            current = current.next;                                // in each iteration of the loop the current pointer is moved to the next node 
        }  
        System.out.print("LinkedList (Backward): ");              // this prints the backward to the console, indication that the following output is in backward
        while (current != null) {                                  // this loop ieterates through the list backaward
            System.out.print(current.data + " ");                  // inside the loop this line prints the data value of the current node
            current = current.prev;                              // this line prints a newline character to the consol moving the output to the next line
        }
        System.out.println();
    }

  # How to use the code

  case 1
  you will be ask to input data in the beginning
  then the data will be stored

  case 2
  this will ask the user to input data at the end of the list 

  case 3
  this will display the list forward

  case 4 
  this will display the list backward or revers

  case 5
  this will stop the program


  # LinkedList Circular

  A circular linked list is a type of linked list in which the first and the last nodes are also connected to each other to form a circle.
  
  void addBeginning(int data) {                                              
        Node newNode = new Node(data);                                       // Creates a new node object with the given data this node will be inserted at the beginning

        if (head == null) {                                                  // this block checks if the list is empty or not 
            head = newNode;                                                  // if the list is empty this commad sets the head of the list to point to the new "newNode"
            head.next = head;                                                // this line sets the next pointer of the new craeted head node to point inself
        } else {
            Node temp = head;                                                // this command creates a temp pointer temp and sets it with the current value of head
            while (temp.next != head)                                        // this loop iterates through the list as long as the next pointer of the current node temp 
                temp = temp.next;                                            // in each iteration of the loop the temp pointer is moved to the next node in the list by assigining the value of the temp.next to temp
            newNode.next = head;                                             // after loop completes the temp pointer points to the last node in the list
            temp.next = newNode;                                             // setss the next pointer of the last node to point to the newly created newNode
            head = newNode;                                                  // it updates the head of the list to point to the newly inserted newNode
        }
    }

    public void display() {
        if (head == null) {                                                 // it checks if the head is empty or not
            System.out.println("List is empty");                            // confirmation
            return;                                                         // if the list is empty the method returns
        }

        Node temp = head;                                                  // temporary pointer temp and sets it with the value of the head
        do {                                                              // do while loop is used to traverse the circular list
            System.out.print(temp.data + " -> ");                          // the loop this line prints the data of the current node temo followed by -> to indicate the connection to the next node
            temp = temp.next;                                              // temp points to the next node in the list
        } while (temp != head);
        System.out.println("(head)");                                      //this line prints head to indicate that the last node in the list is connected beck to the head
    }
}

public class LinCircular{                                                // main class
    public static void main(String[] args){                              // main method this is where all the method is used
        Scanner scan = new Scanner(System.in);                          
        cirList list = new cirList();


# How to use the code

case 1
this will ask the user to input data to be inserted at the beginning

case 2
this asl user to input data to be inserted at the end

case 3
this will display the list all the data

case 4
this will stop the program

