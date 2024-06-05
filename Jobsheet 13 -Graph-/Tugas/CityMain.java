import java.util.Scanner;

public class CityMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah kota
        System.out.print("Input jumlah kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();

        City graph = new City(jumlahKota);

        // Input nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Input nama kota: ");
            String cityName = scanner.nextLine();
            graph.addVertex(i, cityName);
        }

        // Input jumlah jalan
        System.out.print("Input jumlah jalan: ");
        int jumlahJalan = scanner.nextInt();
        scanner.nextLine();

        // Input detail jalan
        for (int i = 0; i < jumlahJalan; i++) {
            System.out.print("Kota 1: ");
            String kota1 = scanner.nextLine();
            System.out.print("Kota 2: ");
            String kota2 = scanner.nextLine();
            System.out.print("Jarak " + kota1 + " – " + kota2 + ": ");
            int jarak = scanner.nextInt();
            scanner.nextLine();

            int index1 = graph.getVertexIndex(kota1);
            int index2 = graph.getVertexIndex(kota2);

            if (index1 != -1 && index2 != -1) {
                graph.addEdge(index1, index2, jarak);
            } else {
                System.out.println("Input Invalid");
                i--;
            }
        }

        // Print the graph
        graph.printGraph();
        scanner.close();
    }
}
