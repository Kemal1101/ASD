import java.util.Scanner;
public class ScavengerMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Pada barisan aritmatika 7, 5, 3, 1, suku ke 20-nya adalah …", "-31");
        game.addPoint("Rumus suku ke-n dari barisan 3, -2, -7, -12, … adalah …", "-5an +8");
        game.addPoint("2(3x-4)+3(3x+5)", "15x+7");
        game.addPoint("6a+7b-5c+2a-3b+7c", "8a+4b+2c");

        game.displayPoints();

        Scanner sc = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc.close();
        System.exit(0);
    }
}
