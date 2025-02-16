import java.util.*;

public class Graphs {
    Map<Integer, List<Integer>> adjList = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); 
    }

    public void buildGraph() {
        System.out.print("Enter the number of vertices: ");
        int V = scan.nextInt();

        System.out.print("Enter the number of edges: ");
        int E = scan.nextInt();

        for (int i = 0; i < E; i++) {
            System.out.print("Enter source and destination for edge" + (i + 1) + ": ");
            int source = scan.nextInt();
            int dest = scan.nextInt();
            addEdge(source, dest);
        }
    }

    public void display() {
        for (int node : adjList.keySet()) {
            System.out.println(node + " -> " + adjList.get(node));
        }
    }

    public static void main(String[] args) {
        Graphs graph = new Graphs();
        graph.buildGraph();
        graph.display();
        graph.scan.close(); 
    }
}