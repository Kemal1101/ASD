public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake();

        snake1.y = 5;
        snake1.x = 5;

        snake1.moveDown();
        snake1.moveRight();
        snake1.moveUP();
        snake1.moveLeft();

        snake1.printPotition();

        Snake snake2 = new Snake();

        snake2.y = 10;
        snake2.x = 10;

        snake2.moveUP();
        snake2.moveLeft();
        snake2.moveDown();
        snake2.moveRight();
    }
}
