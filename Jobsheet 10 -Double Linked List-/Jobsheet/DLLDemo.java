public class DLLDemo {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList();
        myDLL.print();
        myDLL.addFirst(800);
        myDLL.print();
        myDLL.addFirst(700);
        myDLL.print();
        myDLL.addLast(500);
        myDLL.print();
        myDLL.insertAfter(800, 22);
        myDLL.print();
        myDLL.insertAfter(22, 23);
        myDLL.print();
        // myDLL.reversePrint();
        // myDLL.removeFirst();
        // myDLL.print();
        // myDLL.removeLast();
        // myDLL.print();
        System.out.println(myDLL.getData(1));
        System.out.println(myDLL.indexOf(500));
    }
}
