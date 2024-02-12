import java.util.Scanner;

public class Rumus22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.print("1. Kecepatan\n2. Jarak\n3. Waktu\n4. Exit\nApa yang anda ingin ketahui? (input nomor): ");
            pilihan = sc.nextInt();
            if (pilihan == 1){
                rumusKecepatan();
            }else if (pilihan == 2){
                rumusJarak();
            }else if (pilihan == 3){
                rumusWaktu();
            }
        }while (pilihan < 4);
    }
    static void rumusKecepatan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jarak (m): ");
        float jarak = sc.nextFloat();
        System.out.print("Masukkan Waktu (s): ");
        float waktu = sc.nextFloat();
        float kecepatan = jarak / waktu;
        System.out.printf("Kecepatan = %.2f m/s" , kecepatan );
        System.out.println();
    }
    static void rumusJarak (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kecepatan (m/s): ");
        float kecepatan = sc.nextFloat();
        System.out.print("Masukkan Waktu (s): ");
        float waktu = sc.nextFloat();
        float jarak = kecepatan * waktu;
        System.out.printf("Jarak = %.2f m" , jarak  );
        System.out.println();
    }
    static void rumusWaktu (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jarak (m): ");
        float jarak = sc.nextFloat();
        System.out.print("Masukkan Kecepatan (m/s): ");
        float Kecepatan = sc.nextFloat();
        float waktu = jarak / Kecepatan;
        System.out.printf("Waktu = %.2f s" , waktu );
        System.out.println();
    }
}
