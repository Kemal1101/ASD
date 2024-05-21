public class ScavengerHunt {
    Node head;
    Node tail;
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
            tail = newPoint;
        } else {
            tail.next = newPoint;
            newPoint.prev = tail;
            tail = newPoint;
        }
    }
    public void displayPoints() {
        if (!isEmpty()){
            System.out.println("Isi Linked List: ");
            Node currentNode = head;
            int i = 1;
            while (currentNode != null){
                System.out.print(i + ". " + currentNode.pertanyaan);
                currentNode = currentNode.next;
                i++;
                System.out.println();
            }
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

    public void kembali(){
        head = head.prev;
    }

}
