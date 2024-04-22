public class Dragon {
    int x, y;
    int direction;
    String arah;

    public void changeDirection(int newDirection){
        if (newDirection > 4 ){
            System.out.println("error");
        }else{
            switch (newDirection){
                case 1:
                    arah = "atas";
                    direction = 1;
                    break;
                case 2:
                    arah = "kanan";
                    direction = 2;
                    break;
                case 3:
                    arah = "bawah";
                    direction = 3;
                    break;
                case 4:
                    arah = "kiri";
                    direction = 4;
            }
        }
    }

    public void move (int step){
        switch (direction){
            case 1:
                y += step;
                break;
            case 2:
                x+= step;
                break;
            case 3:
                y -= step;
                break;
            case 4:
                x -= step;   
                break;     
        }
    }

    public void printStatus (){
        System.out.println("koordinat x: " + x + " y: " + y);
        System.out.println("arah: " + arah );
    }
}
