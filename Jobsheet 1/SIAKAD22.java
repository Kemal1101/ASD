import java.util.Scanner;

public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================================");

        String matkul[] = {"Agama", "Bahasa Indonesia", "Bahasa Inggris Dasar", "Konsep Teknologi Informasi",
                "Critical Thinking and Problem Solving", "Pengantar Akuntansi, Manajemen, dan Bisnis",
                "Matematika Dasar", "Dasar Pemrograman", "Praktikum Dasar Pemrograman"};
        String nilaiHuruf[] = new String[9];
        double nilai[] = new double[9];
        double bobotNilai[] = new double[9];
        double totalSKS = 18;
        double nilaiSetara [] =  new double[9];
        double totalbobot = 0;


        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai Matakuliah " + matkul[i] + ": ");
            nilai[i] = sc.nextDouble();
            if (nilai[i] <= 100 && nilai[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilai[i] <= 80 && nilai[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] <= 73 && nilai[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] <= 65 && nilai[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] <= 60 && nilai[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] <= 50 && nilai[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilai[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
            totalbobot += bobotNilai[i];
            //nilaiSetara [i] = nilai [i] * bobotNilai [i];
        }
        // double totalNilaiSetara = 0;
        // for (int i = 0; i < 9 ; i++){
        //     totalNilaiSetara += nilaiSetara[i];
        // }
        //double ipSemester = totalNilaiSetara / totalSKS;
        double ipSemester = totalbobot / 9;
        System.out.println("====================================");
        System.out.println("     HASIL KONVERSI NILAI      ");
        System.out.println("====================================");

        System.out.printf("%-60s%-20s%-20s%-15s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-62s%-22.2f%-22s%-11.2f\n", matkul[i], nilai[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("====================================");
        System.out.printf("     IP Semeter = %.2f     ", ipSemester);
        System.out.println();
        System.out.println("====================================");


    }
}
