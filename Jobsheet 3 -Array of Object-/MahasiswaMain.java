import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        double totalIpk = 0;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        Mahasiswa [] daftarmahasiswa = new Mahasiswa[jumlahMahasiswa];
        for (int i = 0; i < daftarmahasiswa.length ; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            daftarmahasiswa [i] = new Mahasiswa();
            System.out.print("Masukkan nama mahasiswa: ");
            daftarmahasiswa[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            daftarmahasiswa[i].NIM = sc.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa: ");
            daftarmahasiswa[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK mahasiswa: ");
            daftarmahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
            totalIpk += daftarmahasiswa[i].ipk;
        }

        for (Mahasiswa mahasiswa : daftarmahasiswa){
            mahasiswa.tampil(j);
            j++;
        }

        double ratarata = totalIpk / jumlahMahasiswa;
        System.out.println("------------------------");
        System.out.printf("Rata-rata IPK mahasiswa: %.2f", ratarata);
        System.out.println();
        System.out.println("------------------------");

        sc.close();
    }
}
