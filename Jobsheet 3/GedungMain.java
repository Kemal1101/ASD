import java.util.Scanner;
public class GedungMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah gedung: ");
        int jumlahGedung = sc.nextInt();
        sc.nextLine();
        Gedung gedung [] = new Gedung[jumlahGedung];

        for (int i = 0; i < jumlahGedung; i++){
            gedung [i] = new Gedung();
            System.out.print("Masukkan nama gedung: ");
            gedung [i].namaGedung = sc.nextLine();
            System.out.print("Masukkan Kapasitas Gedung: ");
            gedung[i].kapasitas = sc.nextInt();
            System.out.print("Masukkan Harga Gedung: ");
            gedung[i].harga = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < jumlahGedung ; i++){
            gedung[i].info();
        }
    }
}
