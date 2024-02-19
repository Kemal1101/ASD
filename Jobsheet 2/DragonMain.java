public class DragonMain {
    public static void main(String[] args) {
        System.out.println("Dragon 1\n--------------");
        Dragon dragon1 = new Dragon();
        dragon1.x = 5;
        dragon1.y = 5;
        dragon1.changeDirection(1);
        dragon1.move(4);
        dragon1.printStatus();

        System.out.println("Dragon 2\n--------------");
        Dragon dragon2 = new Dragon();
        dragon2.x = 3;
        dragon2.y = 6;
        dragon2.changeDirection(3);
        dragon2.move(8);
        dragon2.printStatus();
    }
}
