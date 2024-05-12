public class ScavengerHunt {
    Node head;
    public ScavengerHunt() {
        this.head = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }
    
    public void addPoint(String question, String answer) {
        Node newPoint = new Node(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }
    public void displayPoints() {
        if (!isEmpty()){
            System.out.println("Isi Linked List: ");
            Node currentNode = head;

            while (currentNode != null){
                System.out.print(currentNode.pertanyaan + "\t");
                currentNode = currentNode.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equalsIgnoreCase(userAnswer)) {
                head = head.next;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
