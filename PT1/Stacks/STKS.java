import java.util.Scanner;
import java.util.Stack;

public class STKS {
    public static void main(String[] args) {
        
        Stack<String> stk = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            allchoices();
            
            int pick = theChoices(scanner);
            switch (pick) {
                case 1:
                    pushWord(stk, scanner);
                    break;
                case 2:
                    popWord(stk);
                    break;
                case 3:
                    peekTop(stk);
                    break;
                case 4:
                    showStack(stk);
                    break;
                case 5:
                    System.out.println("Exiting.. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please pick from 1 to 5.");
            }
        }
    }
    
    private static void allchoices() {
        System.out.println("");
        System.out.println("1. Push a word");
        System.out.println("2. Pop a word");
        System.out.println("3. Peek top word");
        System.out.println("4. Show stack");
        System.out.println("5. Exit");
        System.out.print("Enter the word: ");
    }
        
    private static int theChoices(Scanner scanner) {
        int choice;
        choice = scanner.nextInt();
        return choice;
    }
        
    private static void pushWord(Stack<String> stk, Scanner scanner) {
        System.out.print("\nEnter a word to push: ");
        String word;
        word = scanner.next();
        stk.push(word);
        System.out.println("\nWord " + word + " has been added");
    }
        
    private static void popWord(Stack<String> stk) {
        if (!stk.isEmpty()) {
            String pop = stk.pop();
            System.out.println("\nThe word " + pop + " is popped");
        } else {
            System.out.println("\nStack is empty");
        }
    }
            
    private static void peekTop(Stack<String> stk) {
        if (!stk.isEmpty()) {
            String peek = stk.peek();
            System.out.println("\nTop word is " + peek);
        } else {
            System.out.println("\nStack is empty");
        }
            
    }
        
    private static void showStack(Stack<String> stk) {
        if (!stk.isEmpty()) {
            System.out.println("\nStack: ");
            System.out.println(stk);
                
        } else {
            System.out.println("\nStack is empty");
        }
    }

    public void runSTKS(int size) {
        System.out.println("[DEBUG] Running Stack operations with size: " + size);
        
    }
}

