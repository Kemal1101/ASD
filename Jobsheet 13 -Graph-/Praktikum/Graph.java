public class Graph {

    public int numVertices;
    public int[][] adjMatrix;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j, int weight) {
        if (i > numVertices || j > numVertices){
            if (i > numVertices){
                System.out.println("Input " + i + " melebihi atau tidak sesuai dengan ukuran adjacency matrix");
            }else{
                System.out.println("Input " + j + " melebihi atau tidak sesuai dengan ukuran adjacency matrix");
            }
        }else{
            adjMatrix[i][j] = weight;
            adjMatrix[j][i] = weight;
        }

    }

    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public void print() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < numVertices ; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void getEdge(int i, int j){
        if (adjMatrix[i][j] != 0){
            System.out.println("Edge berbobot: " + adjMatrix[i][j]);
        }else{
            System.out.println("Tidak memiliki edge");
        }
    }

    public void getDegree(){
        for (int i = 0; i <numVertices; i++){

            int inDegree = 0;
            int outDegree = 0;
            
            System.out.println("-----------------------------------------------------");
            for (int k = 0; k < numVertices; k++){
                if (adjMatrix[i][k] != 0){
                    outDegree++;
                }
            }
            System.out.println("Jumlah out-degree dari vertex " + i + " adalah: " + outDegree);
    
            for (int k = 0; k < numVertices; k++){
                if (adjMatrix[k][i] != 0){
                    inDegree++;
                }
            }
            System.out.println("Jumlah in-degree dari vertex " + i + " adalah: " + inDegree);
            System.out.println("-----------------------------------------------------");
        }
    }
}