import java.util.Scanner;
public class PelangganMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelanggan pelanggan = new Pelanggan();

        System.out.print("Masukkan Nama: ");
        pelanggan.namaPelanggan = sc.nextLine();
        System.out.print("Masukkan Acara yang ingin digelar: ");
        pelanggan.acara = sc.nextLine();
        System.out.print("Masukkan Jumlah Tamu: ");
        pelanggan.jumlahTamu = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Nomor Telfon: ");
        pelanggan.nomorTelfon = sc.nextLine();

        pelanggan.tampilInfo();
    }
}
