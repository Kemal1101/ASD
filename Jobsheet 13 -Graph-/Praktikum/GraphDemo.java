public class GraphDemo {

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 2, 4);
        g.addEdge(0, 1, 3);
        g.addEdge(1, 2, 6);
        g.addEdge(2, 3, 1);
        g.print();
        g.addEdge(6, 7, 5);
        g.getEdge(0, 1);
        g.getDegree();


    }
}