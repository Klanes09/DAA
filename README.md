# Heap Max

A max heap is a complete binary tree in which the value of a node is greater than or equal to the values of its children.
    
    public void Add(){                                                                        // class add
        System.out.print("\nEnter Value: ");                                                  // this will ask the user what data to be inputted
        int value = scan.nextInt();                                                           // scanner to get the data
        max_heap.add(value);                                                                  // this line is to add the data that the user inputted to be stored at the max_heap
        System.out.println("The value "+value+" has been added");                             // this confirms that the data has been added
    }
    public void Remove(){                                                                     // class remove
        if(!max_heap.isEmpty()){                                                              // this check if the list is empty or not
            int remove = max_heap.poll();                                                    // if the list is not empty this line command will be use and remove thedata 
            System.out.println(remove+" has been removed");                                  // confirmation that the data has been removed
        }
        else{                                                                                // else block
            System.out.println("The heap is empty");                                         // if the list is empty this will be displayed
        }
    }
    
    public void Display(){                                                                   // dislay class
        System.out.println("Heap: "+max_heap);                                               // this line will display the list inside the Max_heap
    }
    public void Choice(){                                                                    // class choices here this is all the choices of the user
        while(true){                                                                        // looping to ask the user again what data to be inputed until the user press the case 4 which exit or stop the program
            System.out.println("\nChoices: ");
        System.out.println("[1] Add [2] Remove \n[3] Display [4]Exit");
        System.out.print("Pick: ");
        int choices = scan.nextInt();
        
        switch(choices){
            case 1 -> Add();
            case 2 -> Remove();
            case 3 -> Display();
            case 4 -> {
                System.out.print("Exiting.. Thank you!");
                return;
                }
            default -> System.out.println("Invalid");
            }
        
        }
    
    }
}
public class Max{                                                                         // main class here is where all the method will be called.

    public static void main(String[] args){                   
        Max_heap mx = new Max_heap();
        mx.Choice();
    }
}

# How to use the code

case 1
the user will be ask to input a data to be stored inside the Max_heap
the highest value will be displayed infront

case 2 
the highest number in the list will be removed

case 3
this will display the lit 

case 4
this will stop the program


# Heap Min

A min-heap is a binary tree such that. - the data contained in each node is less than (or equal to) the data in that node's children

    public void Add(){                                                                                // class add
        System.out.print("\nEnter Value: ");                                                          // user will be asked on what data to be inputted
        int value = scan.nextInt();                                                                    // this will be use for the user input and to store the data inside the Min_heap
        min_heap.add(value);                                                                          // this is the command to store the value that the user inputted inside the Min_heap
        System.out.println("The value "+value+" has been added");                                    // Confirmation that the data has been stored
    }
    public void Remove(){                                                                             // remove class
        if(!min_heap.isEmpty()){                                                                       // this block checks if the min_healp is empty
            int remove = min_heap.poll();                                                              // if the list is not empty the data in the beginning will be removed
            System.out.println(remove+" has been removed");                                            // confirmation that the data has been removed
        }
        else{                                                                                          // else block
            System.out.println("The heap is empty");                                                   // this will be executed if the list is empty
        }
    }
    
    public void Display(){                                                                             // this class will be executed if the user chose to see the list 
        System.out.println("Heap: "+min_heap);                                                        // this will display the list
    }
    public void Choice(){                                                                              // this is where the user will pick which operation they want, in this class is where all the choices
        while(true){
            System.out.println("\nChoices: ");
        System.out.println("[1] Add [2] Remove \n[3] Display [4]Exit");
        System.out.print("Pick: ");
        int choices = scan.nextInt();
        
        switch(choices){
            case 1 -> Add();
            case 2 -> Remove();
            case 3 -> Display();
            case 4 -> {
                System.out.print("Exiting.. Thank you!");
                return;
                }
            default -> System.out.println("Invalid");
            }
        
        }
    
    }
    
}
public class Min{                                                                                      // Main class this is where the code above will be called

    public static void main(String[] args){
        Min_heap mp = new Min_heap();
        mp.Choice();
    }
}


# How to use the code

case 1
this ask the user what data to be stored infront

case 2 
this remove the data in the beginning of the list

case 3 
this display the list or all of the data inside the list

case 4 
this will stop the program

