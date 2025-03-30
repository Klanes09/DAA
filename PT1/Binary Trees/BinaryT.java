import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BT {
    Node root;

    public BT() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}

public class BinaryT {
    public static void main(String[] args) {
        BT bst = new BT();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int numNodes = scan.nextInt();

        System.out.print("Enter the keys:");
        for (int i = 0; i < numNodes; i++) {
            int key = scan.nextInt();
            bst.insert(key);
        }

        System.out.print("Inorder: ");
        bst.inorder();

        scan.close();
    }

    public void runBinaryT(int size) {
        System.out.println("[DEBUG] Running Binary Tree operations with size: " + size);
        // Add logic for Binary Tree operations here
    }
}