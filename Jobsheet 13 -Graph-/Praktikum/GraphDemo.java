public class GraphDemo {

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1, 1);
        g.addEdge(1, 2, 2);
        g.addEdge(0, 3, 3);
        g.addEdge(4, 5, 4);
        g.addEdge(5, 2, 5);
        g.getDegree();
        g.print();
        g.getEdge(0, 1);
        g.printEdges();
    }
}