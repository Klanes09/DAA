# Binary Trees

A “binary tree” is a tree data structure where every node has two child nodes (at the most) that form the tree branches.


class BT {
    Node root;                                                  // it declares a variable named root of type of Node

    public BT() {                                              // this is a contructor of the bt class
        root = null;
    }

    public void insert(int key) {                              // it is used to insert a new node with the given key into the binary tree
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {              // thi is a recursive function that performs the insertion of a new node
        if (root == null) {                                   // if the current node is null it mean we have reached rthe appropriate position to insrt the new node
            return new Node(key);
        }

        if (key < root.key) {                                // if the key to be inserted is less than the key of the current node, the new node should be inserted in the right subtree of the current node.
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorder() {                                
        inorderRec(root);                                   // this is recursive helper function that performs the inorder traversal of the subtree rooted at the given root node
        System.out.println();
    }

    public void inorderRec(Node root) {
        if (root != null) {                                 // thi checks if the current node is not null
            inorderRec(root.left);                          // the line is recursively calls the inorder() method on the left child of the current node
            System.out.print(root.key + " ");               // it prints the key value of the current node to the console follwed by the space
            inorderRec(root.right);                         // The line recursively calls the inorder() methode on the right child of the current node
        }
    }
}

public class BinaryT {                                    // this is the main class and method, this is where the methode are being called

    public static void main(String[] args) {
        BT bst = new BT();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");   // it prints a message to the console, about the user to enter the data
        int numNodes = scan.nextInt();

        System.out.print("Enter the keys:");              // prints a message to the console about entering the keys for each node
        for (int i = 0; i < numNodes; i++) {              // this loop iterates numNodes times once for each node that needs to be inserted
            int key = scan.nextInt();
            bst.insert(key);                              // it calls the insert() method insert the key into BST
        }

        System.out.print("Inorder: ");
        bst.inorder();

        scan.close();
    }
}

# How to use the code

The user will be ask to enter number of nodes (sample: 4)

after that the user will be prompted to input the number of keys (sample: 2 10 3 4)

the output would be the lowest to highest number

Output: 2 3 4 10
