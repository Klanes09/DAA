# Graph

Graphs in data structures are non-linear data structures made up of a finite number of nodes or vertices and the edges that connect them

    public void addEdge(int u, int v) {                                                             
        adjList.putIfAbsent(u, new ArrayList<>());                                                 // adjlist is a Hashmap where keys represent vertices and valus are lists 
        adjList.putIfAbsent(v, new ArrayList<>());                                                 // this line are same operation as the previous line but the vertex is v
        adjList.get(u).add(v);                                                                     // this line retrives the list of neighbors for vertex u 
        adjList.get(v).add(u);                                                                     // this line retrives the list of neighbors for vertex v
    }

    public void buildGraph() {
        System.out.print("Enter the number of vertices: ");                                        // this will ask the user how many vertice to be inputted
        int V = scan.nextInt();                                                                    // this line is for getting the user input and storing the data

        System.out.print("Enter the number of edges: ");                                           // this ask user how many edge to be inputted
        int E = scan.nextInt();                                                                    // same as the previous line

        for (int i = 0; i < E; i++) {                                                              // this loop iterates E times once for each edge
            System.out.print("Enter source and destination for edge" + (i + 1) + ": ");            // inside the loop this line display the user to input the souce and destination vertices for each edge
            int source = scan.nextInt();
            int dest = scan.nextInt();
            addEdge(source, dest);                                                                 // this command calls the addEdge() method to add an edge between the source vertex and the destination
        }
    }

    public void display() {                                                                        
        for (int node : adjList.keySet()) {                                                       // for loop iterates through all the keys in the adjlist map
            System.out.println(node + " -> " + adjList.get(node));                                // node is the current vertex being processed
        }
    }

    public static void main(String[] args) {                                                      // Main methos and main class this is where all the method are being called
        Graphs graph = new Graphs();
        graph.buildGraph();
        graph.display();
        graph.scan.close(); 
    }
}

# How to use the code

the user will be ask how many vertice to be inputted (sample: 3)

then it will ask how many edge will be inputted (sample: 2)

then the user will be prompted to enter source and detination for the edge (sample: 2 3)
                                                                           (        1 3)
and the output will be displayed
