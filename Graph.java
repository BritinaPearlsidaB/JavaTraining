public class Graph {
    int[][] adjMatrix;
   int nodes;

    public Graph(int nodes) {
        this.adjMatrix = new int[nodes][nodes];    
    }
    public void addEdge(int u, int v)
    {
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
    }
    public void display(){
        for(int i=0;i<nodes;i++){
            for(int j=0;j<nodes;j++){
                System.out.println(adjMatrix[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.display();
   }
    

}