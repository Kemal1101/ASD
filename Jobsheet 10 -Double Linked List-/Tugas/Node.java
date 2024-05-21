public class Node {
    String pertanyaan;
    String jawaban;
    Node next;
    Node prev;
    public Node(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
    }
}
