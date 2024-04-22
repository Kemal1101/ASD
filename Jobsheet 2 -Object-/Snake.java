public class Snake {
    int x,y;

    public void moveLeft (){
        x--;
    }

    public void moveRight (){
        x++;
    }

    public void moveUP (){
        y++;
    }

    public void moveDown (){
        y--;
    }

    public void printPotition (){
        System.out.println("Posisi Snake: ");
        System.out.println("koordinat x: " + x);
        System.out.println("koordinat y: "+ y);
    }

}
