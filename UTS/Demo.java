import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Banyak Kendaraan: ");
        int banyakKendaraan = sc.nextInt();
        Main parkiran = new Main(banyakKendaraan);
        Parkir parkir[] = new Parkir[banyakKendaraan];

        int menu;
        do {
            System.out.print("Menu\n1. Input Data\n2. Cari Data\n3. Lihat Keseluruhan Data\n4. Laporan\n5. Exit\ninput menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            if (menu == 1) {
                for (int i = 0; i < parkir.length; i++) {
                    System.out.println("Kendaraan " + (i + 1));
                    System.out.print("Tipe Kendaraan: ");
                    String tipeKendaraan = sc.next();
                    sc.nextLine(); // membersihkan newline
                    System.out.print("Nomor Plat: ");
                    String nomorPlat = sc.nextLine();
                    System.out.print("Lama Parkir (jam): ");
                    int lamaParkir = sc.nextInt();
                    sc.nextLine(); // membersihkan newline

                    parkir[i] = new Parkir(tipeKendaraan, lamaParkir, nomorPlat);
                    parkiran.add(parkir[i]);
                }
            } else if (menu == 2) {
                System.out.print("Plat yang ingin dicari: ");
                String cari = sc.nextLine();
                parkiran.sequentialSearchByPlat(cari);
            } else if (menu == 3) {
                parkiran.displayInfo();
            } else if (menu == 4) {
                parkiran.laporan();
            }
        } while (menu != 5); // Ubah kondisi untuk berhenti ketika menu == 5

        sc.close(); // Tutup scanner setelah selesai menggunakan
    }
}
