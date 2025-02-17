# STACKS

A Stack is a linear data structure that holds a linear, ordered sequence of elements. It is an abstract data type. 
A Stack works on the LIFO process (Last In First Out), i.e., the element that was inserted last will be removed first.

How to use it:

import java.util.Scanner;                                                           // This is a scanner to have a user input
import java.util.Stack;                                                             // Data stucture

public class STKS{                                                                  // Main class
    public static void main(String[] args){                                         // Main method
        
        Stack<String> stk = new Stack<>();                                          // Called the data stucture
        Scanner scanner = new Scanner(System.in);                                   // We need to call the scanner to have a user input
        
        while(true){                                                                // Switch here is where the user will pick a which function they want. From here 
            allchoices();
            
            int pick = theChoices(scanner);
            switch(pick){
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
    }                                                                        // to here
    
    private static void allchoices(){                                        // The choices it is called to the main method
        System.out.println("");
        System.out.println("1. Push a word");
        System.out.println("2. Pop a word");
        System.out.println("3. Peek top word");
        System.out.println("4. Show stack");
        System.out.println("5. Exit");
        System.out.print("Enter the word: ");
    }
        
    private static int theChoices(Scanner scanner){                          // this is where the user input is functional.
        int choice;
        choice = scanner.nextInt();
        return choice;
    }
        
    private static void pushWord(Stack<String> stk, Scanner scanner){        // the class name to push a word
        System.out.print("\nEnter a word to push: "); // print to ask the user something
        String word;                                                         // String to store a word in the string
        word = scanner.next();                                               // scanner for user input
        stk.push(word);                                                      // this is to push the word 
        System.out.println("\nWord "+word+" has been added");                // To display the word that has been push in the stacks
    }
        
    private static void popWord(Stack<String> stk){                          // Class name to pop a word
        if(!stk.isEmpty()){                                                  // If statement to know if the stack is empty or not
        String pop = stk.pop();                                              // If the stack is not empty the word on top will be popped
            System.out.println("\nThe word "+pop+" is popped");              // Output to know that the word has been pop
        } else{                                                              // else statement if the stack is empty
            System.out.println("\nStack is empty");                          // Output
        }
    }
            
    private static void peekTop(Stack<String> stk){                          // Class to peek the top word
        if(!stk.isEmpty()){                                                  // if statement to confirm if the stake is empty or not
            String peek = stk.peek();                                        // Function to peek the top word
            System.out.println("\nTop word is "+peek);                       // Confirmation of the top word
        } else{                                                              // else statement to know if the stack is empty or no
            System.out.println("\nStack is empty");                          // Confirmation if the stack is empty
        }
            
    }
        
    private static void showStack(Stack<String> stk){                        // Class to show the stack
        if(!stk.isEmpty()){                                                  // If statement to knwo if the stack is empty of no
            System.out.println("\nStack: ");                                 // If the stack is not empty it will print the stack
            System.out.println(stk);                                         // Calling the stack
                
        } else{                                                              // Else statement if the stack is empty this will line of code will be use
            System.out.println("\nStack is empty");                          // If the stack is empty this will be the output
        }
    }
}


How to use the Stack
First is to pick if you are pushing a word, popping a word, show the stack, show the top word, and exiting 

if you are pushing a word pick 1 and enter the word

if you are popping a word pick 2 and click enter

if you are peeking the top word click 3 and it will dispay the top word

if you want to see the stacks click 4 and it will display the stacks

then lastly exit. 
