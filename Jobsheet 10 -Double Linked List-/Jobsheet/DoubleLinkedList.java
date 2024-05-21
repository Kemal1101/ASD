public class DoubleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()){
            System.out.println("Isi Linked List: ");
            Node currentNode = head;

            while (currentNode != null){
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public void addFirst (int input){
        Node newNode = new Node(input);

        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast (int input){
        Node newNode = new Node(input);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeFirst (){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        }else if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List Kosong");
        }else if(head == tail){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    public int getData(int index){
        Node currentNode = head;

        for (int i = 0 ; i < index ; i++){
            currentNode = currentNode.next;
            if(currentNode == null){
                System.out.println("Indeks Melebihi Batas isi Linked List");
                return - 1;
            }
        }

        return currentNode.data;
    }

    public int indexOf(int key){
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null){
            return -1;
        }else{
            return index;
        }
    }

    public void reversePrint(){
        if (!isEmpty()){
            System.out.println("Isi Linked List: ");
            Node currentNode = tail;

            while (currentNode != null){
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.prev;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void insertAfter(int key, int input){
        Node newNode = new Node(input);

        if (!isEmpty()){
            Node currentNode = head;

            do{
                if (currentNode.data == key){
                    if (currentNode == tail){
                        addLast(input);
                    }else{
                        newNode.next = currentNode.next;
                        newNode.prev = currentNode;
                        if (currentNode.next != null) {
                            currentNode.next.prev = newNode;
                        }
                        currentNode.next = newNode;
                    }
                    break;
                }

                currentNode = currentNode.next;
            }while (currentNode != null);
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
