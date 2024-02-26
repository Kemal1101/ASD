import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        double totalIpk = 0;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        Mahasiswa [] mahasiswa = new Mahasiswa[jumlahMahasiswa];
        for (int i = 0; i < mahasiswa.length ; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            mahasiswa [i] = new Mahasiswa();
            System.out.print("Masukkan nama mahasiswa: ");
            mahasiswa[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            mahasiswa[i].NIM = sc.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa: ");
            mahasiswa[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK mahasiswa: ");
            mahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
            totalIpk += mahasiswa[i].ipk;
        }

        for (Mahasiswa Tampil : mahasiswa){
            Tampil.tampil(j);
            j++;
        }

        double ratarata = totalIpk / jumlahMahasiswa;
        System.out.println("------------------------");
        System.out.printf("Rata-rata IPK mahasiswa: %.2f", ratarata);
        System.out.println();
        System.out.println("------------------------");

    }
}
