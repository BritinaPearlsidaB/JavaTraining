import java.util.LinkedList;

public class Graph2 {
    LinkedList<Integer>[] adj;

    public Graph2(int nodes) {
        adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public void printGraph() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph2 g = new Graph2(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.printGraph();
    }
}
