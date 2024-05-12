public class Node {
    String pertanyaan;
    String jawaban;
    Node next;
    public Node(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
    }
}
