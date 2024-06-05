public class Graph {

    public int numVertices;
    public int[][] adjMatrix;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j, int jarak) {
        adjMatrix[i][j] = jarak;
        adjMatrix[j][i] = jarak;
    }

    public void removeEdge(int i, int j, int jarak) {
        adjMatrix[i][j] = jarak;
        adjMatrix[j][i] = jarak;
    }

    public int getEdge(int i, int j) {
        return adjMatrix[i][j];
    }

    public boolean hasEdge(int i, int j) {
        return adjMatrix[i][j] != 0;
    }

    public void getDegree() {
        for (int i = 0; i < numVertices; i++) {
            int degree = 0;
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] != 0) {
                    degree++;
                }
            }
            System.out.println("Vertex " + i + " degree: " + degree);
        }
    }

    public void print() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printEdges() {
        System.out.println("Edges:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                if (adjMatrix[i][j] != 0) {
                    System.out.println("Edge antara " + i + " & " + j + " dengan jarak " + adjMatrix[i][j]);
                }
            }
        }
    }
}